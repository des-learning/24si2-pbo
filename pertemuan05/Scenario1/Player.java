import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int arah; // 0 - kanan, 1 - atas, 2 - kiri, 3 - bawah
    
    public Player() {
        arah = Greenfoot.getRandomNumber(4);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        String tombol = Greenfoot.getKey();
        if (tombol.equals("up")) {
            arah = 1;
        }
        if (tombol.equals("down")) {
            arah = 3;
        }
        if (tombol.equals("right")) {
            arah = 0;
        }
        if (tombol.equals("left")) {
            arah = 2;
        }
        
        if (arah == 0) {
            setLocation(getX()+1, getY());
        } else if (arah == 1) {
            setLocation(getX(), getY()-1);
        } else if (arah == 2) {
            setLocation(getX()-1, getY());
        } else {
            setLocation(getX(), getY()+1);
        }
        
        if (isAtEdge()) {
            // geser player supaya tidak menyentuh edge
            /*if (arah == 0) {
                setLocation(getX()-1, getY());
            } else if (arah == 1) {
                setLocation(getX(), getY()+1);
            } else if (arah == 2) {
                setLocation(getX()+1, getY());
            } else {
                setLocation(getX(), getY()-1);
            }*/
            
            /*arah = arah + 1;
            if (arah > 3) {
                arah = 0;
            }*/
            arah = Greenfoot.getRandomNumber(4);
        }
    }
    
    public boolean isAtEdge() {
        if (arah == 0 && getX() >= getWorld().getWidth() - 1) {
            return true;
        }
        
        if (arah == 1 && getY() <= 0) {
            return true;
        }
        
        if (arah == 2 && getX() <= 0) {
            return true;
        }
        
        if (arah == 3 && getY() >= getWorld().getHeight() - 1) {
            return true;
        }
        
        return false;
    }
    
    
}
