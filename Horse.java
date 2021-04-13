package ru.geekbrains.Animals.lesson_4;

public class Horse extends Animals {
    Horse(String name){
        this.name = name;
    }
    public void run(int length){
        if (length < 1500) {
            System.out.println("Лощадь" + name + " побежала");
        }
    };
    public void swim(int length){
        if (length < 100) {
            System.out.println("Лошадь " + name + " поплыла");
        }
    };
    public void jump(int height){
        if (height < 3.0) {
            System.out.println("Лошадь " + name + " прыгает");
        }
    }
}
