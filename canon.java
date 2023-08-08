import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class canon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class canon extends Actor
{
    /**
     * Act - do whatever the canon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int widthOriginal;
    private int heightOriginal;
    
    public canon(){
        GreenfootImage image = getImage();
        widthOriginal = image.getWidth();
        heightOriginal = image.getHeight();
        int nuevoAncho = 70; 
        int nuevoAlto = 70; 
        image.scale(nuevoAncho, nuevoAlto);
    }
    public void act()
    {
        // Add your action code here.
    }
    
    
}
