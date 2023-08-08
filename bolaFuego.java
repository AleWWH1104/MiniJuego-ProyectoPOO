import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bolaFuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bolaFuego extends Actor
{
    /**
     * Act - do whatever the bolaFuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int widthOriginal;
    private int heightOriginal;
    
    public bolaFuego(){
        GreenfootImage image = getImage();
        widthOriginal = image.getWidth();
        heightOriginal = image.getHeight();
        int nuevoAncho = 70; 
        int nuevoAlto = 30; 
        image.scale(nuevoAncho, nuevoAlto);
    }
    {
        // Add your action code here.
    }
}
