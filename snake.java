import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int widthOriginal;
    private int heightOriginal;
    public snake(){
    //Tamano del objeto
    GreenfootImage image = getImage();
    widthOriginal = image.getWidth();
    heightOriginal = image.getHeight();
    int nuevoAncho = 35; 
    int nuevoAlto = 50; 
    image.scale(nuevoAncho, nuevoAlto);
    
    }
    public void act()
    {
        // Add your action code here.
        turn(2);
        move(2);
    }
}
