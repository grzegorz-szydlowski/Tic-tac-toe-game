package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * JavaFX Controller class for handling the Tic-Tac-Toe game user interface.
 */
public class Controller {

    private TicTacToe game = new TicTacToe();
    private Player x = Player.ReadJSON("x.json");
    private Player o = Player.ReadJSON("o.json");
    private String directory = "file:/" + System.getProperty("user.dir").replace("\\", "/") + "/src/main/resources/images/ttcO2.png";

    @FXML
    private Text txtResult;
    @FXML
    private Text txtOWins;
    @FXML
    private Text txtXWins;
    @FXML
    private Image ttcO = new Image(directory);
    @FXML
    private Image ttcX = new Image(directory.replace("ttcO2","ttcX2"));

    @FXML
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;


    @FXML
    private Button btnPlay;

    @FXML
    private AnchorPane pnlBoard;

    @FXML
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    /**
     * Makes the board invisible.
     */
    protected void RemoveBoard()
    {
        pnlBoard.setVisible(false);
    }
    /**
     * Displays the scores of the players.
     */
    protected void DisplayScores()
    {
        txtOWins.setVisible(true);
        txtXWins.setVisible(true);
        txtOWins.setText("O wins: " + o.getWins());
        txtXWins.setText("X wins: " + x.getWins());
    }
    /**
     * Checks the winner and updates the interface accordingly.
     */
    protected void CheckWinner()
    {
        if(game.getWinner() == 0)
        {
            txtResult.setVisible(true);
            txtResult.setText("It's a draw!");
            RemoveBoard();
            DisplayScores();
        }
        if(game.getWinner()==1)
        {
            RemoveBoard();
            txtResult.setVisible(true);
            txtResult.setText("X has won!");
            x.updateWins();
            x.SaveJSON("x.json");
            DisplayScores();
        }
        if(game.getWinner()==-1)
        {
            RemoveBoard();
            txtResult.setVisible(true);
            txtResult.setText("O has won!");
            o.updateWins();
            o.SaveJSON("o.json");
            DisplayScores();
        }
    }
    @FXML
    protected void Btn1Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img1.setImage(ttcX);
        }
        else
        {
            img1.setImage(ttcO);
        }
        game.makeMove(0,0);
        btn1.setDisable(true);
        CheckWinner();
    }
    @FXML
    protected void Btn2Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img2.setImage(ttcX);
        }
        else
        {
            img2.setImage(ttcO);
        }
        game.makeMove(0,1);
        btn2.setDisable(true);
        CheckWinner();
    }
    @FXML
    protected void Btn3Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img3.setImage(ttcX);
        }
        else
        {
            img3.setImage(ttcO);
        }
        game.makeMove(0,2);
        btn3.setDisable(true);
        CheckWinner();
    }
    @FXML
    protected void Btn4Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img4.setImage(ttcX);
        }
        else
        {
            img4.setImage(ttcO);
        }
        game.makeMove(1,0);
        btn4.setDisable(true);
        CheckWinner();
    }
    @FXML
    protected void Btn5Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img5.setImage(ttcX);
        }
        else
        {
            img5.setImage(ttcO);
        }
        game.makeMove(1,1);
        btn5.setDisable(true);
        CheckWinner();
    }
    @FXML
    protected void Btn6Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img6.setImage(ttcX);
        }
        else
        {
            img6.setImage(ttcO);
        }
        game.makeMove(1,2);
        btn6.setDisable(true);
        CheckWinner();
    }
    @FXML
    protected void Btn7Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img7.setImage(ttcX);
        }
        else
        {
            img7.setImage(ttcO);
        }
        game.makeMove(2,0);
        btn7.setDisable(true);
        CheckWinner();
    }
    @FXML
    protected void Btn8Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img8.setImage(ttcX);
        }
        else
        {
            img8.setImage(ttcO);
        }
        game.makeMove(2,1);
        btn8.setDisable(true);
        CheckWinner();
    }
    @FXML
    protected void Btn9Click() {

        if(game.getCurrentPlayer() == 1)
        {
            img9.setImage(ttcX);
        }
        else
        {
            img9.setImage(ttcO);
        }
        game.makeMove(2,2);
        btn9.setDisable(true);
        CheckWinner();
    }
    @FXML
    public void PlayBtnClick(ActionEvent e) {
        pnlBoard.setVisible(true);
        btnPlay.setDisable(true);
        btnPlay.setVisible(false);

    }
}