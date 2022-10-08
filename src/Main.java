import entities.Category;
import entities.Lecture;
import entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {
        Teacher teacher1 = new Teacher();
        teacher1.setId(1);
        teacher1.setFirstName("Engin");
        Teacher.objects.save(teacher1);
        
        Lecture lecture1 = new Lecture();
        lecture1.setName("Java 101");
        lecture1.setPrice(10);
        Lecture.objects.save(lecture1);

        Lecture lecture2 = new Lecture();
        lecture2.setName("Java 102");
        lecture2.setPrice(-1);
        Lecture.objects.save(lecture2);

        Category category1 = new Category();
        category1.setName("Java");
        Category.objects.save(category1);

        Category category2 = new Category();
        category2.setName("Python");
        Category.objects.save(category2);
    }
}