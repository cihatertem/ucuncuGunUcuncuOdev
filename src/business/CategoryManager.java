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
    private static final ILogger[] loggers = {new DatabaseLogger()};
    private static final List<Category> _categories = new ArrayList<>();

    public void save(Category entity) throws Exception {
        Category[] categories = this.categoryDao.getAll();

        for (Category category : CategoryManager._categories) { // Simüle etmek için categories yerine _categories
            // kullanıldı.
            if (entity.getName().toLowerCase().equals(category.getName().toLowerCase())) {
                for (ILogger logger : CategoryManager.loggers) {
                    logger.log();
                }
                throw new Exception("Bu katagori ismi kullanılıyor.");
            }
        }

        CategoryManager.addToCategories(entity);
        this.categoryDao.save(entity);
        for (ILogger logger : CategoryManager.loggers) {
            logger.log();
        }
    }

    private static void addToCategories(Category category) {
        CategoryManager._categories.add(category);
    }
}
