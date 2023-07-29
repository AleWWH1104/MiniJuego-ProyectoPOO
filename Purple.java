import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Purple extends Actor
{
    private int widthOriginal;
    private int heightOriginal;
    
    public Purple(){
    //Tamano del objeto
    GreenfootImage image = getImage();
    widthOriginal = image.getWidth();
    heightOriginal = image.getHeight();
    int nuevoAncho = 100; 
    int nuevoAlto = 110; 
    image.scale(nuevoAncho, nuevoAlto);
    
    }

    public void act()
    {
        checkKeyPress();
    }
    
     public void checkKeyPress() {
         
          int velocidad = 5; // Ajusta la velocidad de movimiento según lo desees

    if (Greenfoot.isKeyDown("up")) {
        setLocation(getX(), getY() - velocidad);
    }
    if (Greenfoot.isKeyDown("down")) {
        setLocation(getX(), getY() + velocidad);
    }
    if (Greenfoot.isKeyDown("left")) {
        setLocation(getX() - velocidad, getY());
    }
    if (Greenfoot.isKeyDown("right")) {
        setLocation(getX() + velocidad, getY());
    }
        }
}
