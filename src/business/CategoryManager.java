package business;

import dataAccess.ICategoryDao;
import dataAccess.hibernate.HibernateCategoryDao;
import entities.Category;
import logger.DatabaseLogger;
import logger.ILogger;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private final ICategoryDao categoryDao = new HibernateCategoryDao();
    private final ILogger[] loggers = {new DatabaseLogger()};
    private final List<Category> _categories = new ArrayList<>();

    public void save(Category entity) throws Exception {
        Category[] categories = this.categoryDao.getAll();

        for (Category category : this._categories) { // Simüle etmek için categories yerine _categories
            // kullanıldı.
            if (entity.getName().toLowerCase().equals(category.getName().toLowerCase())) {
                for (ILogger logger : this.loggers) {
                    logger.log();
                }
                throw new Exception("Bu katagori ismi kullanılıyor.");
            }
        }

        this.addToCategories(entity);
        this.categoryDao.save(entity);
        for (ILogger logger : this.loggers) {
            logger.log();
        }
    }

    private void addToCategories(Category category) {
        this._categories.add(category);
    }
}
