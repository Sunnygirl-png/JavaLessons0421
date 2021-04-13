package ru.geekbrains.Animals.lesson_4;

public class Dog extends Animals {
    Dog(String name){
        this.name = name;
    }

    public void run(int length){
        if (length < 500) {
            System.out.println("Пёсель " + name + " пpобежал");
        }
    };
    public void swim(int length){
        if (length < 10) {
            System.out.println("Пёсель " + name + " поплыл");
        }
    };
    public void jump(double height){
        if (height < 0.5) {
            System.out.println("Пёсель " + name + " прыгает");
        }
    }
}
