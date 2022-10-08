package dataAccess.hibernate;

import dataAccess.ILectureDao;
import entities.Lecture;

public class HibernateLectureDao implements ILectureDao {

    @Override
    public void save(Lecture lecture) {
        System.out.println("Kurs kaydedildi. (Hibernate)");
    }

    @Override
    public void create(Lecture lecture) {
        System.out.println("Kurs oluşturuldu. (Hibernate)");
    }

    @Override
    public void get(Lecture lecture) {
        System.out.println("Kurs getirildi. (Hibernate)");
    }

    @Override
    public Lecture[] getAll() {
        System.out.println("Tüm kurslar getirildi. (Hibernate)");
        Lecture[] lectures = {};
        return lectures;
    }

    @Override
    public void filter(Lecture lecture) {
        System.out.println("Kurslar filtrelendi. (Hibernate)");
    }

    @Override
    public void update(Lecture lecture) {
        System.out.println("Kurs güncellendi. (Hibernate)");
    }

    @Override
    public void delete(Lecture lecture) {
        System.out.println("Kurs silindi. (Hibernate)");
    }
}
