package dataAccess;

import entities.Lecture;

public interface ILectureDao {
    void save(Lecture lecture);

    void create(Lecture lecture);

    void get(Lecture lecture);

    Lecture[] getAll();

    void filter(Lecture lecture);

    void update(Lecture lecture);

    void delete(Lecture lecture);
}
