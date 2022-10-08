import business.CategoryManager;
import business.LectureManager;
import dataAccess.ICategoryDao;
import dataAccess.ILectureDao;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateLectureDao;
import dataAccess.jdbc.JdbcLectureDao;
import entities.Category;
import entities.Lecture;

public class Main {
    public static void main(String[] args) throws Exception {
        final ILectureDao LECTUREDAO = new HibernateLectureDao();
        LectureManager lectureManager = new LectureManager();

        Lecture lecture1 = new Lecture(LECTUREDAO);
        lecture1.setName("Java 101");
        lecture1.setPrice(10);
        lectureManager.createLecture(lecture1);

        Lecture lecture2 = new Lecture(LECTUREDAO);
        lecture2.setName("Java 102");
        lecture2.setPrice(5);
        lectureManager.createLecture(lecture2);

        final ICategoryDao CATEGORYDAO = new HibernateCategoryDao();

        Category category1 = new Category(CATEGORYDAO);
        category1.setName("Java");
        CategoryManager.createCategory(category1);

        Category category2 = new Category(CATEGORYDAO);
        category2.setName("JAVA");
        CategoryManager.createCategory(category2);
    }
}