package ru.mytasks;

public class Phone {
    private String name;
    private int price;

    @org.jetbrains.annotations.Contract(pure = true)
    public Phone (String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
