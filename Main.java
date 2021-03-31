package ru.JavaLessons0421.lesson1;

public class Main {
   public static float firstMethod(int a, int b, int c, int d){
        float result =(float) (a*(b+(c/d)));
        return result;
    };
   public static boolean secondMethod(int a, int b){
       int result = a + b;
       if (result >= 10 & result <= 20){
           return true;
       }
       return false;
   };
   public static void thirdMethod(int a){
       if(a >= 0){
           System.out.println("Число положительное");
       }else {
           System.out.println("Число отрицательное");
       }
   };
   public static String forthMethod(String name){
       System.out.println("Привет, " + name);
       return name;
   }
    public static void main (String[]args) {
       System.out.println(firstMethod(1, 2, 4, 2));
        System.out.println(secondMethod(5,2));
        thirdMethod(-1);
        forthMethod("Галя");
    }
}

