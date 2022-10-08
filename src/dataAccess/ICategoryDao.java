package dataAccess;

import entities.Category;

public interface ICategoryDao {
    void save(Category category);

    void create(Category category);

    void get(Category category);

    Category[] getAll();

    void filter(Category category);

    void update(Category category);

    void delete(Category category);

    interface ILoggerDao {
    }
}
