package com.example.wvand.tictactoe;

public class Game {
    final private int BOARD_SIZE = 3;
    private TileState[][] board;

    private Boolean playerOneTurn;  // true if player 1's turn, false if player 2's turn
    private int movesPlayed;
    private Boolean gameOver;

    public Game() {
        board = new TileState[BOARD_SIZE][BOARD_SIZE];
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                board[i][j] = TileState.BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    public TileState choose(int row, int column) {

        //TileState Bonkers = board[row][column];

        // if tile is blank, fill it
        if (TileState.BLANK == board[row][column]) {


            if (playerOneTurn == true) {
                board[row][column] = TileState.CROSS;

                // move turn to player two
                playerOneTurn = false;
                return TileState.CROSS;

            }
            else {
                board[row][column] = TileState.CIRCLE;

                // move turn back to player one
                playerOneTurn = true;
                return TileState.CIRCLE;

            }
        }
        else{
                return TileState.INVALID;

            }
        }

        //public GameState won(){
        //break;



}
