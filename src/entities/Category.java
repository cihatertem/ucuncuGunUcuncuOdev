package entities;


import business.CategoryManager;

public class Category {
    private int id;
    private String name;
    public static CategoryManager objects = new CategoryManager();


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
}
