import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roca extends Actor{
    private int widthOriginal;
    private int heightOriginal;
    
    public roca(){
        GreenfootImage image = getImage();
        widthOriginal = image.getWidth();
        heightOriginal = image.getHeight();
        int nuevoAncho = 230; 
        int nuevoAlto = 100; 
        image.scale(nuevoAncho, nuevoAlto);
    }
    public void act()
    {
        // Add your action code here.
    }
}
