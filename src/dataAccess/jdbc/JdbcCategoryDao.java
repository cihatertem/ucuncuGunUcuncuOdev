package dataAccess.jdbc;

import dataAccess.ICategoryDao;
import entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

    @Override
    public void save(Category category) {
        System.out.println("Katagori kaydedildi. (JDBC)");
    }

    @Override
    public void create(Category category) {
        System.out.println("Katagori oluşturuldu. (JDBC)");
    }

    @Override
    public void get(Category category) {
        System.out.println("Katagori getirildi. (JDBC)");
    }

    @Override
    public Category[] getAll() {

        System.out.println("Tüm katagoriler getirildi. (JDBC)");
        Category[] categories = {};
        return categories;
    }

    @Override
    public void filter(Category category) {
        System.out.println("Katagoriler filtrelendi. (JDBC)");
    }

    @Override
    public void update(Category category) {
        System.out.println("Katagori güncellendi. (JDBC)");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Katagori silindi. (JDBC)");
    }
}
