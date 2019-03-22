package entity;

import java.util.ArrayList;

public class Food {
    private int id;
    private String name;
    private String description;
    private double price;
    private String createdAt;

    public Food() {
    }

    public Food(int id, String name, String description, double price, String createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format("%15s| %15s| %15s| %15s\n", this.id, this.name, this.description, this.createdAt);
    }
}
