package ru.geekbrains.java.Animals;

public class Cat extends Animal {
    String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;

    }

    public void catInfo(){
        //System.out.println("Имя кота / кошки: " + name);
        System.out.println("Цвет: " + color);
    }


//
//    public class AnimalsApp {
//        public void main(String[] args) {
//            Animal animal = new Animal("Дружок");
//            Cat cat = new Cat("Барсик", "Белый");
//            animal.animalInfo();
//            cat.animalInfo();
//            cat.catInfo();
//        }
//    }
}
