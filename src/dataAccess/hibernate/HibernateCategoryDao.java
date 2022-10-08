package dataAccess.hibernate;

import dataAccess.ICategoryDao;
import entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

    @Override
    public void save(Category category) {
        System.out.println("Katagori kaydedildi. (Hibernate)");
    }

    @Override
    public void create(Category category) {
        System.out.println("Katagori oluşturuldu. (Hibernate)");
    }

    @Override
    public void get(Category category) {
        System.out.println("Katagori getirildi. (Hibernate)");
    }

    @Override
    public Category[] getAll() {

        System.out.println("Tüm katagoriler getirildi. (Hibernate)");
        Category[] categories = {};
        return categories;
    }

    @Override
    public void filter(Category category) {
        System.out.println("Katagoriler filtrelendi. (Hibernate)");
    }

    @Override
    public void update(Category category) {
        System.out.println("Katagori güncellendi. (Hibernate)");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Katagori silindi. (Hibernate)");
    }
}
