
package Characters;

import java.awt.Graphics2D;

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
    
    Direction directionFacing;
    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }
    
    
    public Pacman(Integer xpos, Integer ypos){
        isAlive = true;
        isPoweredUp = false;
        directionFacing = Direction.EAST;
        xPosition = xpos;
        yPosition = ypos;
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
    
    public void move(){
        this.move(null);
    }
    
    public void move(Integer key){
        
        //37 is left, 38 is up, 39 is right, 40 is down
       if(key != null){ 
            switch(key){
                case 37:
                    xPosition--;
                    directionFacing = directionFacing.WEST;
                    break;
                case 38:
                    yPosition--;
                    directionFacing = directionFacing.NORTH;
                    break;
                case 39:
                    xPosition++;
                    directionFacing = directionFacing.EAST;
                    break;
                case 40:
                    yPosition++;
                    directionFacing = directionFacing.SOUTH;
                    break;
                default:
                    break;
            }
       }
        
        
      
        //if it is a wall, stop moving
        switch(directionFacing){
            case NORTH:{
                yPosition--;
                break;
            }   
            case SOUTH: {
                yPosition++;                
                break;
            }
            
            case EAST: {
                xPosition++;
                break;
            }   
            
            case WEST:{
                xPosition--;
                break;
            }
            
            default:
                break;
        }
        
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
