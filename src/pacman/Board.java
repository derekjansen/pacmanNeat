package pacman;

import Characters.Blinky;
import Characters.Clyde;
import Characters.Inky;
import Characters.Pacman;
import Characters.Pinky;
import java.awt.*;
import java.awt.event.KeyListener;
import javafx.scene.input.KeyEvent;
import javax.swing.JPanel;

/**
 *
 * @author DerekGrove
 */
public class Board extends JPanel implements KeyListener{
    
    public static Pacman pacman;
    public static Pinky pinky;
    public static Blinky blinky;
    public static Inky inky;
    public static Clyde clyde;
    private static final Integer WIDTH = 28;
    private static final Integer HEIGHT = 31;
    
    public Cell[][] theBoard;
    
    //constructor
    public Board(){      //row,column
        
        this.setBackground(Color.black);
        setFocusable(true); 
        this.addKeyListener(this);
        
        //create the board
        theBoard = new Cell[HEIGHT][WIDTH];
        
        //set up each cell
        for(int y = 0; y < HEIGHT; y++){
            for(int x = 0; x < WIDTH; x++){
                theBoard[y][x] = new Cell(y,x);
           }
        }
        
        initCharacters();
        
    }
    
    
    //calls to paint the graphic on the screen
    //call repaint each time to repaint the entire board
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2D = (Graphics2D) g;
                
        for(int y = 0; y < HEIGHT; y++){
            for(int x = 0; x < WIDTH; x++){
                theBoard[y][x].draw(g2D);
           }
        }
        
        pacman.draw(g2D);
        
    }
    

    public void initCharacters(){

       pacman = new Pacman(100,100,this);
       
       // pinky = new Pinky();
       // inky = new Inky();
       // blinky = new Blinky();
       // clyde = new Clyde();
    }
    
    public Cell getCell(int row, int column){
        return theBoard[row][column];
    }

    public boolean hasDots() {        
        return true;
    }
    
    public Pacman getPacman(){
        return pacman;
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        pacman.changeDirection(e.getKeyCode());
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
    }
    
    
}
