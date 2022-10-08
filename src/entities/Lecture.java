package entities;

import dataAccess.ILectureDao;

public class Lecture {
    private int id;
    private String name;
    private Teacher teacher;
    private double price;
    private Category category;

    public static ILectureDao objects;

    public Lecture(ILectureDao objects) {
        Lecture.objects = objects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
