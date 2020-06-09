
package Characters;

import java.awt.Graphics2D;
import pacman.Board;

/**
 *
 * @author DerekGrove
 */
public class Pacman {
    
    private boolean isAlive;
    private boolean isPoweredUp;
    private Integer xPosition;
    private Integer yPosition;
    private Integer chompPosition = 0;
    public Board gameBoard;
    
    Direction directionFacing;
    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }
    
    
    public Pacman(Integer xpos, Integer ypos, Board gameBoard){
        isAlive = true;
        isPoweredUp = false;
        directionFacing = Direction.EAST;
        xPosition = xpos;
        yPosition = ypos;
        this.gameBoard = gameBoard;
    }
    
    public void setIsPoweredUp(boolean isPoweredUp){
        this.isPoweredUp = isPoweredUp;
    }
    
    public boolean getIsPoweredUp(){
        return isPoweredUp;
    }
    
    public void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }
    
    public boolean getIsAlive(){
        return isAlive;
    }
    
    public void setXPosition(Integer xPosition){
        this.xPosition = xPosition;
    }
    
    public Integer getXPosition(){
        return xPosition;
    }
    
    public void setYPosition(Integer yPosition){
        this.yPosition = yPosition;
    }
    
    public Integer getYPosition(){
        return yPosition;
    }
    
    public void changeDirection(Integer key){
       System.out.println("xPosition is: " + xPosition); 
       System.out.println("yPosition is: " + yPosition);  
       
       //Need to determine if it can change direction
       //implement cornering. 
       //should always be able to reverse direction regardless
       
       
       //37 is left, 38 is up, 39 is right, 40 is down
       if(key != null){ 
            switch(key){
                case 37:
                    directionFacing = directionFacing.WEST;
                    break;
                case 38:
                    directionFacing = directionFacing.NORTH;
                    break;
                case 39:
                    directionFacing = directionFacing.EAST;
                    break;
                case 40:
                    directionFacing = directionFacing.SOUTH;
                    break;
                default:
                    break;
            }
       }
    }
    
    public void move(){
        
        
        //TODO implement the check if wall method. need to pass direction and coordinate
        switch(directionFacing){
            case NORTH:{
                checkIfWall();
                yPosition--;
                break;
            }   
            case SOUTH: {
                checkIfWall();
                yPosition++;               
                break;
            }
            
            case EAST: {
                checkIfWall();
                xPosition++;
                break;
            }   
            
            case WEST:{
                checkIfWall();
                xPosition--;
                break;
            }
            
            default:
                break;
        }
        
        //see if the current spot has a dot
        checkIfDot();

    }
    
    //TODO
    //PASS DIRECTION AND COORDINATE PLUS ONE THEN CHECK THAT SPOT TO SEE IF IT IS A WALL
    public boolean checkIfWall(){
        //gameBoard.getCell(xPosition,yPosition).getIsWall();
        return true;
    }
    
    public void checkIfDot(){

    }
    
    public void isImportantSpot(){
        
    }
    
    public void draw(Graphics2D g2D){
        
        //draw pacman position
        switch(directionFacing){
            case EAST:
               g2D.fillArc(xPosition, yPosition, 20, 20, 25, 315);
               break;
            case SOUTH:
                g2D.fillArc(xPosition, yPosition, 20, 20, 295, 315);
                break;
            case WEST:
                g2D.fillArc(xPosition, yPosition, 20, 20, 205, 315);
                break;
            case NORTH:
                g2D.fillArc(xPosition, yPosition, 20, 20, 115, 315);
                break;
            default:              
                break;
        }
        
        //315, 330, 345, 360
                 
    }   
    
}
