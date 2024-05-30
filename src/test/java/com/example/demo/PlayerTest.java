package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;

    @BeforeEach
    void setUp() {
        player = new Player(0,"John");
    }

    @Test
    void updateWins() {
        player.updateWins();
        assertEquals(1, player.getWins());
    }

    @Test
    void getName() {
        assertEquals("John", player.getName());
    }

    @Test
    void getWins() {
        assertEquals(0, player.getWins());
    }
}