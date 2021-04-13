package ru.geekbrains.Animals.lesson_4;

public class Cat extends Animals {
    Cat(String name){
        this.name = name;
    }
    public void run(int length){
        if (length < 200) {
            System.out.println("Кот " + name + " пробежал");
        }
    };
    public void jump(double height){
        if (height < 2.0) {
            System.out.println("Кот " + name + " прыгает");
        }
    }
}
