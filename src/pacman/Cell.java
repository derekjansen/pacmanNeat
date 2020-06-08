
package pacman;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DerekGrove
 */
class Cell {
    
    private final Color DOT_COLOR = new Color(192, 192, 0);
    private boolean isWall;
    private boolean hasDot;
    private boolean isEaten;
    private boolean isBigDot;
    private int xPosition;
    private int yPosition;
    
    public Cell(int y, int x){
        this.isWall = false;
        this.hasDot = true;
        this.xPosition = x;
        this.yPosition = y;
    }
    
    //walls
    public void setIsWall(boolean isWall){
        this.isWall = isWall;
    }
    
    public boolean getIsWall(){
        return isWall;
    }
    
    //dots
    public void setHasDot(boolean hasDot){
        this.hasDot = hasDot;
    }
    
    public boolean getHasDot(){
        return hasDot;
    }
    
    //bigdots
    public void setIsBigDot(boolean isBigDot){
        this.isBigDot = isBigDot;
    }
    
    public boolean getIsBigDot(){
        return isBigDot;
    }
    
    public void setIsEaten(boolean isEaten){
        this.isEaten = isEaten;
    }
    
    public boolean getIsEaten(){
        return isEaten;
    }
    
    public void draw(Graphics g){

        if(hasDot){
            g.setColor(DOT_COLOR);
            g.fillOval(yPosition * 16 + 8, xPosition * 16 + 8, 3, 3);
            
            
           
            
        }
    }
    
}
