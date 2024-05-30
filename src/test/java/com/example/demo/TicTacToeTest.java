package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void getWinner() {
        assertEquals(10, ticTacToe.getWinner());
    }

    @Test
    void getCurrentPlayer() {
        assertEquals(1, ticTacToe.getCurrentPlayer());
    }

    @Test
    void isFull() {
        assertFalse(ticTacToe.isFull()); //Plansza pusta na początku
        ticTacToe.makeMove(0, 0);
        ticTacToe.makeMove(0, 1);
        ticTacToe.makeMove(0, 2);
        ticTacToe.makeMove(1, 0);
        ticTacToe.makeMove(1, 1);
        ticTacToe.makeMove(1, 2);
        ticTacToe.makeMove(2, 0);
        ticTacToe.makeMove(2, 1); //wypelnienie 8/9 miejsc planszy
        assertFalse(ticTacToe.isFull()); //plansza nie powinna byc pelna
        ticTacToe.makeMove(2, 2);//wypelnienie ostatniego pola
        assertTrue(ticTacToe.isFull());//plansza powinna byc pelna
    }
}