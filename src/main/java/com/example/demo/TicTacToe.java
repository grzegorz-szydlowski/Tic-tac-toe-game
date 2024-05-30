package com.example.demo;
/**
 * Represents a game of Tic-Tac-Toe.
 */
public class TicTacToe {
    private static final int EMPTY = 0;
    private static final int X = 1;
    private static final int O = -1;
    private int winner = 10;

    private int currentPlayer = X;
    private int[][] board = new int[3][3];

    /**
     * Gets the winner of the game.
     *
     * @return the winner: 1 for X, -1 for O, 0 for draw (10 acts as a placeholder)
     */
    public int getWinner()
    {
        return winner;
    }
    /**
     * Gets the current player.
     *
     * @return the current player: 1 for X, -1 for O
     */
    public int getCurrentPlayer()
    {
        return currentPlayer;
    }
    /**
     * Makes a move on the board at the specified indexes (row and column) of the board array and changes between players.
     *
     * @param row the row of the move
     * @param col the column of the move
     */
    public void makeMove(int row, int col)
    {
        if (board[row][col] == EMPTY)
        {
            board[row][col] = currentPlayer;
            if (checkWinner(currentPlayer))
            {
                winner = currentPlayer == X ? 1 : -1;
            } else if (isFull())
            {
                winner = 0;
            } else
            {
                currentPlayer = -currentPlayer;
            }
        }
    }

    /**
     * Checks if the specified player has won the game.
     *
     * @param player the player to check
     * @return true if the player has won, false if there's no winner yet
     */
    public boolean checkWinner(int player)
    {
        for (int i = 0; i < 3; i++)
        {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
            {
                return true;
            }
        }
        for (int j = 0; j < 3; j++)
        {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player)
            {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
        {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
        {
            return true;
        }
        return false;
    }

    /**
     * Checks if the board is full.
     *
     * @return true if the board is full, false if it isn't
     */
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
