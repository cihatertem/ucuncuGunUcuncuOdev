package dataAccess.hibernate;

import dataAccess.ITeacherDao;
import entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao {

    @Override
    public void save(Teacher teacher) {
        System.out.println("Eğitmen kaydedildi. (Hibernate)");
    }

    @Override
    public void create(Teacher teacher) {
        System.out.println("Eğitmen oluşturuldu. (Hibernate)");
    }

    @Override
    public void get(Teacher teacher) {
        System.out.println("Eğitmen getirildi. (Hibernate)");
    }

    @Override
    public Teacher[] getAll() {

        System.out.println("Tüm eğitmenler getirildi. (Hibernate)");
        Teacher[] teachers = {};
        return teachers;
    }

    @Override
    public void filter(Teacher teacher) {
        System.out.println("Eğitmenler filtrelendi. (Hibernate)");
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Eğitmen güncellendi. (Hibernate)");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Eğitmen silindi. (Hibernate)");
    }
}
