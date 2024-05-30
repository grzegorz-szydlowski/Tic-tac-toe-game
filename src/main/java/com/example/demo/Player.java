package com.example.demo;

import java.io.*;
/**
 * Represents a player in the Tic-Tac-Toe game.
 */
public class Player implements Serializable {
    private int wins;
    private String name;
    /**
     * Default constructor.
     */
    public Player(){}
    /**
     * Constructs a Player with the specified number of wins and name.
     *
     * @param wins the number of wins
     * @param name the player's name
     */
    public Player(int wins, String name)
    {
        this.wins = wins;
        this.name = name;
    }
    /**
     * Increases the win count by one.
     */
    public void updateWins()
    {
        this.wins += 1;
    }
    /**
     * Gets the player's name.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }
    /**
     * Gets the player's win count.
     *
     * @return the player's win count
     */
    public int getWins() {
        return wins;
    }
    /**
     * Saves the player object to a file in JSON format.
     *
     * @param filePath the path to the file where the player object will be saved
     */
    public void SaveJSON(String filePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException("Saving error!", e);
        }
    }
    /**
     * Reads a player object from a file in JSON format.
     *
     * @param filePath the path to the file from which the player object will be read
     * @return the player object
     */
    public static Player ReadJSON(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Player) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Reading error!", e);
        }
    }

}
