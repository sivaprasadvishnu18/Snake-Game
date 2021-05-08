package controller;
import model.*;
import view.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class SnakeController{
    SnakeModel snake;
    Coin coin;
    GraphicBoard board;
    SnakeInterface userInterface;
    int score = 0;
    //set everything except MenuGUI visible(false) in respective class upon creation
    MenuGUI menuGUI = new MenuGUI;
    GraphicBoard graphicBoard = new GraphicBoard;
    SnakeGUI snakeGUI = new SnakeGUI;


    public SnakeController(SnakeModel snake, Coin coin, GraphicBoard board, SnakeInterface userInterface){
        this.snake = snake;
        this.coin = coin;
        this.board = board;
        this.userInterface = userInterface;
    }

    public void startNewGame(){
        userInterface.reset();
        snake.setPosX(100);
        snake.setPosY(255);
        coin.setPosX(400);
        coin.setPosY(255);
    }

    public void endGame(){
        //When user obstacle, a pop up appears
        //User can choose to start new game or go to menu
        //If user chose to start new game, startNewGame() is called
        //If user chooses to go to menu, user goes to menu
        //If score is highest, the score is saved to highScore
        if(snake.hitSelf() || snake.hitWall()){
            snake.setSpeed(0);
            int choice = JOptionPane.showConfirmDialog(mainFrame, "You "+"score:2500  "+" Play again?", "Results", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                startNewGame();
            }else{
                //Go to MenuGUI
                menuGUI.setVisible(true);
                snakeGUI.setVisible(false);
                graphicBoard.setVisible(false);

            }

        }
    }

    public void moveDirection(KeyEvent e) {
        //Allows user to move the snake in any direction
        if(e.getKeyCode() == KeyEvent.VK_Right){
            if(snake.getDirection() = DIRECTION.UP || snake.getDirection() == DIRECTION.DOWN)){
                snake.direction() = DIRECTION.RIGHT();
            }
        }
            
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(snake.getDirection() = DIRECTION.UP || snake.getDirection() == DIRECTION.DOWN)){
                snake.direction() = DIRECTION.LEFT();
            }   
        } 

        if(e.getKeyCode() == KeyEvent.VK_UP){
            if(snake.getDirection() = DIRECTION.LEFT || snake.getDirection() == DIRECTION.RIGHT)){
                snake.direction() = DIRECTION.UP();
            }
        }
                
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            if(snake.getDirection() = DIRECTION.LEFT || snake.getDirection() == DIRECTION.RIGHT)){
                snake.direction() = DIRECTION.DOWN();
            }   
        }

    }

    public void enterOptions() {
        //Allows user to select difficulty, such as easy, medium, hard
        if(userInterface.selectDifficulty().setOption(optionButton1)){
            snake.setSpeed(2);
        }

        if(userInterface.selectDifficulty().setOption(optionButton2)){
            snake.setSpeed(4);
        }

        if(userInterface.selectDifficulty().setOption(optionButton3)){
            snake.setSpeed(8);
        }

    }
    public void scoreTracker(){
        //Keeps track of current score of the game.
        //Increments by 1 as the user collects the coins
        if(snake.hitCoin()){
            score++;
        }
    }
}
