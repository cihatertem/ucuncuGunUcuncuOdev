package business;

import dataAccess.ITeacherDao;
import dataAccess.hibernate.HibernateTeacherDao;
import entities.Teacher;
import logger.DatabaseLogger;
import logger.EmailLogger;
import logger.FileLogger;
import logger.ILogger;


public class TeacherManager {
    private final ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
    private final ITeacherDao teacherDao = new HibernateTeacherDao();

    public void save(Teacher teacher) {
        this.teacherDao.save(teacher);
        for (ILogger logger : loggers) {
            logger.log();
        }
    }
}
