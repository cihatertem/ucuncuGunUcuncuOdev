package entities;

import business.TeacherManager;
import dataAccess.ITeacherDao;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private String description;
    private String avatar;
    public static TeacherManager objects;

    public Teacher(TeacherManager objects) {
        Teacher.objects = objects;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
