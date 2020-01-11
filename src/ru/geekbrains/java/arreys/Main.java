package ru.geekbrains.java.arreys;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

/* Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0  */

        int[] ZeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив ZeroOne изначально = " + Arrays.toString(ZeroOne));
        for (int i = 0; i < ZeroOne.length; i++) {
            if (ZeroOne[i] == 0) {
                ZeroOne[i] = 1;
            } else ZeroOne[i] = 0;
        }
        System.out.println("Массив ZeroOne после замены: " + Arrays.toString(ZeroOne));

        //System.out.println(Arrays.toString(ZeroOne));

//Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] PlusThree = new int[8];
        PlusThree[0] = 0;
        for (int i = 1; i < PlusThree.length; i++) {
            PlusThree[i] = PlusThree[i - 1] + 3;
        }
        System.out.println("Массив PlusTree = " + Arrays.toString(PlusThree));

//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    int[] redouble = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println("Массив redouble изначально:   "+ Arrays.toString(redouble));
        for (int i = 0; i < redouble.length; i ++) {
        redouble[i] = redouble[i] * 2;
    }
    System.out.println("Числа меньше 6 умножили на 2: "+ Arrays.toString(redouble));

//Задать одномерный массив и найти в нем минимальный и максимальный элементы
int [] myArrey = new int [10];
    for (int i = 0; i < myArrey.length; i ++) {
        myArrey [i] = (int)(Math.random() * 50);
    }
    System.out.println("Заполняем массив: " + Arrays.toString(myArrey));
    int max = myArrey [0];
    int min = myArrey [0];
    for (int i = 0; i < myArrey.length; i ++){
        max = Math.max(max,myArrey[i]);
        min = Math.min(min,myArrey[i]);
    }
    System.out.println("Максимальный элемент массива: " + max);
    System.out.println("Минимальный элемент массива: "+ min);
    }
}

