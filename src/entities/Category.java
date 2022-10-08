package entities;


import dataAccess.ICategoryDao;

public class Category {
    private int id;
    private String name;
    public static ICategoryDao objects;

    public Category(ICategoryDao objects) {
        Category.objects = objects;
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
}
