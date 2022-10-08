package business;

import dataAccess.ILectureDao;
import dataAccess.hibernate.HibernateLectureDao;
import entities.Lecture;
import logger.DatabaseLogger;
import logger.EmailLogger;
import logger.FileLogger;
import logger.ILogger;

import java.util.ArrayList;
import java.util.List;

public class LectureManager {
    private final List<Lecture> _lectures = new ArrayList<>();
    private static final ILogger[] loggers = {new DatabaseLogger(), new FileLogger()};
    private final ILectureDao lectureDao = new HibernateLectureDao();


    public void save(Lecture newLecture) throws Exception {
        Lecture[] lectures = this.lectureDao.getAll();

        for (Lecture lecture : this._lectures) { // Simüle etmek için lectures yerine _lectures kullanıldı.
            if (newLecture.getName().toLowerCase().equals(lecture.getName().toLowerCase())) {
                for (ILogger logger : LectureManager.loggers) {
                    logger.log();
                }
                throw new Exception("Bu kurs ismi kullanılıyor.");
            }
        }

        if (newLecture.getPrice() < 0) {
            for (ILogger logger : LectureManager.loggers) {
                logger.log();
            }
            throw new Exception("Kurs ücreti 0'dan küçük olamaz.");
        }

        this.addToLectures(newLecture);
        this.lectureDao.save(newLecture);
        for (ILogger logger : LectureManager.loggers) {
            logger.log();
        }
    }

    private void addToLectures(Lecture lecture) {
        this._lectures.add(lecture);
    }
}
