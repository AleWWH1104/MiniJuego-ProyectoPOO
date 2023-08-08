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
    
    private int desplazamiento = 0; // var entera incrementa al llamar el metodo act
    private int rotation = -45;
    
    public bolaFuego(){
        GreenfootImage image = getImage();
        widthOriginal = image.getWidth();
        heightOriginal = image.getHeight();
        int nuevoAncho = 70; 
        int nuevoAlto = 30; 
        image.scale(nuevoAncho, nuevoAlto);
    }
    public void act()
    {
        // Add your action code here.
        desplazamiento = desplazamiento + 4; //incremento var 1 en 1
        setRotation(rotation);
        if(desplazamiento >= 300){
            rotation = rotation + 180;
            rotation = rotation % 360;
            desplazamiento = 0;
            setRotation(rotation);
        }
        move(8);
        //setRotation(90);
    }
}
