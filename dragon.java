import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dragon extends Actor
{
    /**
     * Act - do whatever the dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int widthOriginal;
    private int heightOriginal;
    
    public dragon(){
        GreenfootImage image = getImage();
        widthOriginal = image.getWidth();
        heightOriginal = image.getHeight();
        int nuevoAncho = 90; 
        int nuevoAlto = 90; 
        image.scale(nuevoAncho, nuevoAlto);
    }
    
    public void act()
    {
        lvl2 miMundo = (lvl2)this.getWorld();
        perseguirAlPersonaje(miMundo.getProtagonista());
    }
    private void perseguirAlPersonaje(Purple prota){
        int posXprotagonista = prota.getX();
        int posYprotagonista = prota.getY();
        
        if (this.getX() < posXprotagonista){
            this.setLocation(this.getX() + 1, this.getY());
        } else if (this.getX() > posXprotagonista){
            this.setLocation(this.getX() - 1, this.getY());
        }
        
        if (this.getY() < posYprotagonista){
            this.setLocation(this.getX(), this.getY() + 1);
        } else {
            this.setLocation(this.getX(), this.getY() - 1);
        }
        
    }
}
