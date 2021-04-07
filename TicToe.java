package ru.JavaLessons0421;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;


public class TicToe {

    public static class MyTicToc {

        private static final char DOT_HUMAN = 'X';
        private static final char DOT_AI = 'O';
        private static final char DOT_EMPTY = '_';

        private static int fieldSizeX;
        private static int fieldSizeY;
        private static char[][] field;

        private static final Scanner SCANNER = new Scanner(in);
        private static final Random RANDOM = new Random();

        private static void initField() {
            fieldSizeY = 5;
            fieldSizeX = 5;
            field = new char[fieldSizeY][fieldSizeX];
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    field[y][x] = DOT_EMPTY;
                }
            }
        }

        private static void printField() {
            out.println("------");
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    out.print(field[y][x] + "|");
                }
                out.println();
            }
        }

        private static boolean isValidCell(int x, int y) {

            return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
        }

        private static boolean isEmptyCell(int y, int x) {

            return field[y][x] == DOT_EMPTY;
        }

        private static void humanTurn() {
            int x;
            int y;
            do {
                out.println("Введите координаты хода X и Y (от 1 до 5) через пробел >>> ");
                x = SCANNER.nextInt() - 1;
                y = SCANNER.nextInt() - 1;
            } while (!isValidCell(x, y) || !isEmptyCell(x, y));
            field[y][x] = DOT_HUMAN;
        }

        private static void aiTurn() {
            int x;
            int y;
            do {
                x = RANDOM.nextInt(fieldSizeX);
                y = RANDOM.nextInt(fieldSizeY);
            } while (!isEmptyCell(x, y));
            field[y][x] = DOT_AI;

        }

        private static boolean isFieldFull() {
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    if (field[y][x] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        private static boolean checkWin(char c) {
            char c1 = c;
            char c2 = c;
            char c3 = c;
            char winner;
            String simString = Arrays.toString(field);
            for (int y = 0; y < field.length; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    if (simString.equals(String.valueOf(c + c1 + c2 + c3))) {
                        if (c == DOT_HUMAN) {
                            return checkWin('X');
                            System.out.println("Congrats to winner! " + winner);
                            break;
                        } else if (c == DOT_AI) {
                            return checkWin('O');
                            System.out.println("Congrats to winner! " + winner);
                            break;
                        }
                    }
                }
            }
        }

        public static void main(String[] args) {
            while (true) {
                playOneRound();
                System.out.println("Play again?");
                if (SCANNER.next().equals("no"))
                    break;
            }
        }

        private static void playOneRound() {
            initField();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (checkWin(DOT_HUMAN)) {
                    out.println("Выиграл игрок!");
                    break;
                }
                if (isFieldFull()) {
                    out.println("Ничья!");
                    break;
                }
                aiTurn();
                printField();
                if (checkWin(DOT_AI)) {
                    out.println("Выиграл компьютер!");
                    break;
                }
                if (isFieldFull()) {
                    out.println("Ничья!");
                    break;
                }
            }
        }

    }

}
