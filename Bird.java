package ru.geekbrains.Animals.lesson_4;

public class Bird extends Animals {
    Bird(String name){
        this.name = name;
    }
    public void run(int length) {
        if (length < 5) {
            System.out.println("Птичка" + name + " побежала");
        }
    }

    public void jump(int height) {
        if (height < 0.2) {
            System.out.println("Птичка " + name + " прыгает");
        }
    }
}
