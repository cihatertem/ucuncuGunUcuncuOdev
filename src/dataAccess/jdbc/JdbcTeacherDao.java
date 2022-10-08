package dataAccess.jdbc;

import dataAccess.ITeacherDao;
import entities.Teacher;

public class JdbcTeacherDao implements ITeacherDao {
    @Override
    public void save(Teacher teacher) {
        System.out.println("Eğitmen kaydedildi. (JDBC)");
    }

    @Override
    public void create(Teacher teacher) {
        System.out.println("Eğitmen oluşturuldu. (JDBC)");
    }

    @Override
    public void get(Teacher teacher) {
        System.out.println("Eğitmen getirildi. (JDBC)");
    }

    @Override
    public Teacher[] getAll() {

        System.out.println("Tüm eğitmenler getirildi. (JDBC)");
        Teacher[] teachers = {};
        return teachers;
    }

    @Override
    public void filter(Teacher teacher) {
        System.out.println("Eğitmenler filtrelendi. (JDBC)");
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Eğitmen güncellendi. (JDBC)");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Eğitmen silindi. (JDBC)");
    }
}
