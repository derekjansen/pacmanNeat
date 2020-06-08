package pacman;

import Characters.Blinky;
import Characters.Clyde;
import Characters.Inky;
import Characters.Pacman;
import Characters.Pinky;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * @author DerekGrove
 */
public class PacmanGame extends JFrame{

    public static Board gameBoard;
    public static Timer timer;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PacmanGame p = new PacmanGame();
      p.setVisible(true);
      p.runGame();
    }
    
    //construct the game
    public PacmanGame(){
        initBoard();
        initGraphics();
        initTimer();
    }
    
    
    public  void initBoard(){
        gameBoard = new Board();
        add(gameBoard);
    }
    
    public void initGraphics(){
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(452, 494);
        setLocationRelativeTo(null);
        
    }
    
    //is this needed. I need some sync for moving right?
    public static void initTimer(){
        timer = new Timer();
        timer.schedule(new GameTimer(), 0,16);
    }
    
    public static class GameTimer extends TimerTask {
        public void run(){
            
            //this repraints on a timer
            
            //System.out.println("REPAINT");
            gameBoard.getPacman().move();

            gameBoard.repaint();
        }
    }
    
    
    
    //runs the game
    public void runGame(){            
        //game goes until pacman is alive OR all dots are eaten.
        while(gameBoard.getPacman().getIsAlive() && gameBoard.hasDots()){ 
           //THIS IS A CHECK TO STOP THE GAME
        }
    }
    
    
    
    
}
