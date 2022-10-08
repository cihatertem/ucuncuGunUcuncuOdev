package dataAccess.jdbc;

import dataAccess.ILectureDao;
import entities.Lecture;

public class JdbcLectureDao implements ILectureDao {
    @Override
    public void save(Lecture lecture) {
        System.out.println("Kurs kaydedildi. (JDBC)");
    }

    @Override
    public void create(Lecture lecture) {
        System.out.println("Kurs oluşturuldu. (JDBC)");
    }

    @Override
    public void get(Lecture lecture) {
        System.out.println("Kurs getirildi. (JDBC)");
    }

    @Override
    public Lecture[] getAll() {
        System.out.println("Tüm kurslar getirildi. (JDBC)");
        Lecture[] lectures = {};
        return lectures;
    }

    @Override
    public void filter(Lecture lecture) {
        System.out.println("Kurslar filtrelendi. (JDBC)");
    }

    @Override
    public void update(Lecture lecture) {
        System.out.println("Kurs güncellendi. (JDBC)");
    }

    @Override
    public void delete(Lecture lecture) {
        System.out.println("Kurs silindi. (JDBC)");
    }
}
