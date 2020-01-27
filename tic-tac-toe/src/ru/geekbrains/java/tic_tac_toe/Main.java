package ru.geekbrains.java.tic_tac_toe;

public class Main {

    public static void main(String[] args) {
	public static char [][] map;
	public static final int SIZE = 3;
	public static final int DOTS_TO_WIN = 3;
	public static final char DOT_EMPTY = '*';
	public static final char DOT_X = 'X';
	public static final char DOT_O = 'O';

	    public static void initMap() {
	        map = new char [SIZE] [SIZE];
	        for (int i = 0; i < SIZE; i ++) {
	            for (int j = 0; j < SIZE; j ++) {
	            map [i][j] = DOT_EMPTY;
                }
            }
        }
    }
}
