package com.example.wvand.tictactoe;

import android.view.View;

import java.io.Serializable;

public class Game implements Serializable {
    final private int BOARD_SIZE = 3;
    private TileState[][] board;

    private Boolean playerOneTurn;  // true if player 1's turn, false if player 2's turn
    private int movesPlayed;
    private Boolean gameOver;

    public Game() {
        board = new TileState[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++)
            for (int j = 0; j < BOARD_SIZE; j++)
                board[i][j] = TileState.BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    //public getStates() {
    //    for (int i; i < BOARD_SIZE; i++) {
    //        for (int j; j < BOARD_SIZE; j++) {
    //            return (TileState Smash = TileState[i][j]);
    //        }
    //    }
    //}


    public TileState choose(int row, int column) {

        // if tile is blank, fill it
        if (TileState.BLANK == board[row][column]) {


            if (playerOneTurn == true) {
                board[row][column] = TileState.CROSS;

                // move turn to player two
                playerOneTurn = false;
                return TileState.CROSS;

            } else {
                board[row][column] = TileState.CIRCLE;

                // move turn back to player one
                playerOneTurn = true;
                return TileState.CIRCLE;

            }
        } else {
            return TileState.INVALID;

        }
    }

    public GameState won() {

        int xcounter = 0;
        int ocounter = 0;

        // Initialize variables X, O and b for more succinct loop
        TileState X = TileState.CROSS;
        TileState O = TileState.CIRCLE;
        TileState Blank = TileState.BLANK;
        int b = BOARD_SIZE;

        // Loop over horizontal wins: rows increase by loop, columns hardcoded
        int j = 0;
        for (int i = 0; i < b; i++) {
            if ((board[i][j] == X) && (board[i][j + 1] == X) && (board[i][j + 2] == X)) {
                System.out.println("WINNING");
                return GameState.PLAYER_ONE;
            } else if ((board[i][j] == O) && (board[i][j + 1] == O) && (board[i][j + 2] == O)) {
                System.out.println("WINNING2");
                return GameState.PLAYER_TWO;
            }
        }

        // Loop over vertical wins: columns increase by loop, rows hardcoded
        int i = 0;
        for (int k = 0; k < b; k++)
            if ((board[i][k] == X) && (board[i + 1][k] == X) && (board[i + 2][k] == X)){
                System.out.println("WINNORZ");
                return GameState.PLAYER_ONE;
            }
            else if ((board[i][k] == O) && (board[i + 1][k] == O) && (board[i + 2][k] == O)){
                System.out.println("WINNORZ2");
                return GameState.PLAYER_TWO;
            }

        // Loop over diagonal wins left-right-down with a counter
        xcounter = 0;
        ocounter = 0;
        for (int l = 0; l < b; l++)
            if (board[l][l] == X) {
                xcounter++;
                if (xcounter == 3) {
                    System.out.println("DIAGONALTESTWIN");
                    return GameState.PLAYER_ONE;
                }
            }
            else if (board[l][l] == O) {
                ocounter++;
                if (ocounter == 3){
                    System.out.println("DIAGONALTESTWINO");
                    return GameState.PLAYER_TWO;
                }
            }

         // Loop over diagonal wins left-right-up with a counter
        int m = 0;
        int o = 0;
        xcounter = 0;
        ocounter = 0;
        for (int l = 2; l >= 0; l--) {
            if (board[l][m] == X) {
                xcounter++;
                m++;
                if (xcounter == 3) {
                    System.out.println("DIAGONALTESTWIN2");
                    return GameState.PLAYER_ONE;
                }
            }
            if (board[l][o] == O) {
                ocounter++;
                o++;
                if (ocounter == 3) {
                    System.out.println("DIAGONALTESTWIN2o");
                    return GameState.PLAYER_TWO;
                }
            }
        }
        if (!(board[0][0] == Blank) && !(board[0][1] == Blank) && !(board[0][2] == Blank) &&
                !(board[1][0] == Blank) && !(board[1][1] == Blank) && !(board[1][2] == Blank)
                && !(board[2][0] == Blank) && !(board[2][1] == Blank) && !(board[2][2] == Blank)){
            System.out.println("SHEIZEdraw");
            return GameState.DRAW;
        }
        return GameState.IN_PROGRESS;
    }
}
