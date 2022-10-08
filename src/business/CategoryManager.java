package business;

import entities.Category;
import logger.DatabaseLogger;
import logger.EmailLogger;
import logger.ILogger;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private static ILogger[] loggers = {new DatabaseLogger(), new EmailLogger()};
    private static List<Category> _categories = new ArrayList<>();

    public static void createCategory(Category newCategory) throws Exception {
        Category[] categories = Category.objects.getAll();

        for (Category category : CategoryManager._categories) { // Simüle etmek için categories yerine _categories
            // kullanıldı.
            if (newCategory.getName().toLowerCase().equals(category.getName().toLowerCase())) {
                for (ILogger logger : CategoryManager.loggers) {
                    logger.log();
                }
                throw new Exception("Bu katagori ismi kullanılıyor.");
            }
        }

        CategoryManager.addToCategories(newCategory);
        Category.objects.save(newCategory);
        for (ILogger logger : CategoryManager.loggers) {
            logger.log();
        }
    }

    private static void addToCategories(Category category) {
        CategoryManager._categories.add(category);
    }
}
