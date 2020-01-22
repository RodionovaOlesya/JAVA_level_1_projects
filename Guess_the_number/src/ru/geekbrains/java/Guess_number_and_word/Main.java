package ru.geekbrains.java.Guess_number_and_word;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
/* Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
 При каждой попытке компьютер должен сообщить, больше или меньше указанное пользователем число, чем загаданное.
 После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
        System.out.println("Попробуйте отгадать число.");
        int range = 9;
        int number = (int) (Math.random() * range);
        int MaxAttemptCounter = 3;
        System.out.println("Количество попыток: " + MaxAttemptCounter);
        System.out.println("Угадайте число от 0 до " + range);
        boolean WinGame = false;

        for (int AttemptCounter = 1; AttemptCounter <= MaxAttemptCounter; AttemptCounter++) {
            int inNum = scanner.nextInt();
            if (inNum == number) {
                WinGame = true;
                System.out.println("Вы угадали!");
                break;
            } else if (inNum < number) {
                System.out.println("Загаданное число больше, у вас осталось попыток " + (MaxAttemptCounter - AttemptCounter));
            } else {
                System.out.println("Загаданное число меньше, у вас осталось попыток " + (MaxAttemptCounter - AttemptCounter));
            }
        }

        if (!WinGame)
            System.out.println("Вы не угадали число с " + MaxAttemptCounter + " попыток");

        System.out.println("Игра окончена");

        scanner.close();
    }
}
