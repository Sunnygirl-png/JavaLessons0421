package ru.JavaLessons0421;

import java.util.Arrays;

public class lesson2 {
    //1 Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static void changeArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
    }

    //2 Задать пустой целочисленный массив размером 8.
    // Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

    public static void fillArray(int[] myArray1) {
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = i * 3 + 1;
        }
    }

    //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    // написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2;
    public static void doubleArray(int[] myArray3) {
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] < 6) {
                myArray3[i] *= 2;
            }
        }
    }

    //Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static int maxArray(int[] myArray3) {
        int i = 0;
        for (i = 0; i < myArray3.length - 1; i++) {
            if (myArray3[i] > i) {
                i = myArray3[i];
            }
        }
        return i;
    }

    public static void minArray(int[] myArray3) {
        int min = myArray3[0];
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] < min) {
                min = myArray3[i];
            }
        }
    }

    //5* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    // заполнить его диагональные элементы единицами, используя цикл(ы);
    public static void fillCrossArray(int[][] myArray5){
        for(int i = 0; i < myArray5.length; i++){
            myArray5[i][i] = 1;
            myArray5[i][myArray5.length - 1 - i] = 1;
        }
    }


    public static void main (String[]args) {
        int[] myArray =  { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        changeArray(myArray);
        System.out.println(Arrays.toString(myArray));
        int [] myArray1 = new int[8];
        fillArray(myArray1);
        System.out.println(Arrays.toString(myArray1));
        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleArray(myArray3);
        System.out.println(Arrays.toString(myArray3));
        int i = maxArray(myArray3);
        System.out.println(i);

    }
}
