package dataAccess;

import entities.Lecture;
import entities.Teacher;

public interface ITeacherDao {
    void save(Teacher teacher);

    void create(Teacher teacher);

    void get(Teacher teacher);

    Teacher[] getAll();

    void filter(Teacher teacher);

    void update(Teacher teacher);

    void delete(Teacher teacher);
}
