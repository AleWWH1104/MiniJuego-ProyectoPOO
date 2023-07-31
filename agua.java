import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class agua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class agua extends Actor
{
    private int widthOriginal;
    private int heightOriginal;
    
    public agua(){
    GreenfootImage image = getImage();
    widthOriginal = image.getWidth();
    heightOriginal = image.getHeight();
    int nuevoAncho = 100; 
    int nuevoAlto = 50; 
    image.scale(nuevoAncho, nuevoAlto);
    
    }
    public void act()
    {
        // Add your action code here.
    }
}
