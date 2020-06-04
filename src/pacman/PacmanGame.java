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
        setSize(448, 496);
        setLocationRelativeTo(null);
        
    }
    
    //is this needed. I need some sync for moving right?
    public static void initTimer(){
        timer = new Timer();
        timer.schedule(new GameTimer(), 0,250);
    }
    
    public static class GameTimer extends TimerTask {
        public void run(){
            System.out.println("BEEP");
        }
    }
    
    public void runGame(){            
        //do I do it like this or add a timer???
        //game goes until pacman is alive OR all dots are eaten.
        while(gameBoard.getPacman().getIsAlive() && gameBoard.hasDots()){    
           // System.out.println("PacMAN is alive");
           // System.out.println("THE GAME BOARD HAS DOTS");
            //gameBoard.getPacman().move();
            //all ghosts move
        }
    }
    
    
    
    
}
