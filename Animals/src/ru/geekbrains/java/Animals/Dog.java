package ru.geekbrains.java.Animals;

public class Dog extends Animal {
    String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public void dogInfo(){
        System.out.println("Кличка: "+ name);
        System.out.println("Цвет: " + color);
    }
}
