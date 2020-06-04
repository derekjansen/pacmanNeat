
package Characters;

import java.util.Vector;

/**
 *
 * @author DerekGrove
 */
public class Pacman {
    
    private boolean isAlive;
    private boolean isPoweredUp;
    
    Direction directionFacing;
    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }
    
    
    public Pacman(){
        isAlive = true;
        isPoweredUp = false;
        directionFacing = Direction.EAST;
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
    
    
    public void move(){
        
        //implement continuous moving 
            //move in the direction facing
                //if it is a wall, stop moving
        
        switch(directionFacing){
            case NORTH:{
                    //animate north
                break;
            }   
            case SOUTH: {
                    //animate south
                break;
            }
            
            case EAST: {
                    //animate east
                break;
            }   
            
            case WEST:{
                    //animate west 
                break;
            }
            
            default:
                break;
        }
        
    }
    
}
