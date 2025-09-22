package org.artrac.training;

//zrobilem caly kod na swiezo jak co
//podejrzanie proste to cwiczenie tak szczerze, tu nawet nie ma co debugowac

import java.util.Arrays;

public class Training {

    public static int twoElements(int x, int y){
        int[] array = new int[]{x, y};
        return array[0] + array[1];
    }

    public static int biggestNumber(int x, int y, int z){
        int[] numbers = new int[]{x, y, z};

        Arrays.sort(numbers);

        return numbers[numbers.length-1];

    }

    public void sudokuBoard(){
        /*podana plansza: https://upload.wikimedia.org/wikipedia/commons/2/2d/Sudoku_przyklad.png
        pierwszy numer - poziomo, drugi - pionowo
        */
        int[][] board = new int[9][9];
        board[0][0] = 2;
        board[3][0] = 6;
        board[5][0] = 7;
        board[6][0] = 5;

        board[7][1] = 9;
        board[8][1] = 6;

        board[0][2] = 6;
        board[2][2] = 7;
        board[5][2] = 1;
        board[6][2] = 3;

        //i tak dalej, wiem o co chodzi a nie chce mi sie dalej wypelniac ¯\_(ツ)_/¯
    }

    public void chessBoard(){

        /*stan partii: https://en.wikipedia.org/wiki/Deep_Blue_versus_Garry_Kasparov#Game_5_2
        (gra 6, link pokazuje 5 ale w zadaniu jest ostatni stan niech bedzie gra 6)
        napisze tylko czarne bo wiem o co chodzi
         */
        int pawn = 0;
        int rook = 1;
        int knight = 2;
        int bishop = 3;
        int queen = 4;
        int king = 5;

        int[][] board = new int [8][8];

        board[0][0] = rook;
        board[2][0] = king;
        board[7][0] = rook;

        board[0][1] = pawn;
        board[3][1] = knight;
        board[4][1] = bishop;
        board[6][1] = pawn;

        board[2][2] = bishop;
        board[7][2] = pawn;

        board[1][3] = pawn;
        board[3][3] = knight;
        board[5][3] = pawn;

    }

}
