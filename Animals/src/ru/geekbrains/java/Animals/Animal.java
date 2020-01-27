package ru.geekbrains.java.Animals;

public class Animal {
    String name;
    //String color;

   // public Animal() {
    //}
    public Animal() {
        this.name = name;
        System.out.println("Имя животного: " + name);
       // this.color = color;
    }

    public Animal(String name) {
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
        //System.out.println("Цвет животного: " + color);
    }

    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }
}
