import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pruebaEscalera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pruebaEscalera extends Actor
{
    /**
     * Act - do whatever the pruebaEscalera wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int widthOriginal;
    private int heightOriginal;
    public pruebaEscalera(){
    //Tamano del objeto
    GreenfootImage image = getImage();
    widthOriginal = image.getWidth();
    heightOriginal = image.getHeight();
    int nuevoAncho = 30; 
    int nuevoAlto = 120; 
    image.scale(nuevoAncho, nuevoAlto);
    }
    public void act()
    {
        // Add your action code here.
    }
}
