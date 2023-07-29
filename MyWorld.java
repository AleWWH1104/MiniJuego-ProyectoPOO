import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //Personaje
        addObject(new Purple(), 560, 300);
        //Monedas
        addObject(new moneda(), 460, 200);
        addObject(new moneda(), 540, 40);
        addObject(new moneda(), 90, 130);
        addObject(new moneda(), 230, 130);
        addObject(new moneda(), 100, 330);
        //Agua
        addObject(new agua(), 410, 360);
        //Serpiente
        addObject(new snake(), 490, 40);
        //Cohete
        addObject(new cohete(), 0, 200);
        
    }
}
