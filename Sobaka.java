package ru.geekbrains.Animals.lesson_4;

public class Sobaka extends Dog {
    Sobaka (String name){
        super(name);
    }
    @Override
    public void run(int length){
        if (length < 400){
            System.out.println("Собака " + name +" пробежала");
        }
    }
    @Override
    public  void jump(double heigth){
        if (heigth>0.5&&heigth<0.7)
        System.out.println("Собака "+ name+ " подпрыгнулa");
    }
}
