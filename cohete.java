import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cohete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cohete extends Actor
{
    /**
     * Act - do whatever the cohete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int desplazamiento = 0; // var entera incrementa al llamar el metodo act
    private int rotation = 0;
    
    public void act()
    {
        desplazamiento = desplazamiento + 1; //incremento var 1 en 1
        if (desplazamiento >= 100){ // condicion si 
            rotation = rotation + 180;
            rotation = rotation % 360;
            desplazamiento = 0;
            setRotation(rotation);
        }
        move(5);
    }
}
