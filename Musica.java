import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musica extends Actor
{
    private GreenfootSound musica;
    
    public Musica()  
    {  
        // Ruta al archivo de música que importaste
        musica = new GreenfootSound("ruta/al/archivo/musica.mp3");  
    }  
    public void act()
    {
        // Add your action code here.
    }
}
