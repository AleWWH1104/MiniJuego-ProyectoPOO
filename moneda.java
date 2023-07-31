import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class moneda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moneda extends Actor
{
    private int widthOriginal;
    private int heightOriginal;
    
    public moneda(){
    GreenfootImage image = getImage();
    widthOriginal = image.getWidth();
    heightOriginal = image.getHeight();
    int nuevoAncho = 50; 
    int nuevoAlto = 50; 
    image.scale(nuevoAncho, nuevoAlto);
    
    }
    public void act()
    {
        // Add your action code here.
        monedaAgarrada();
    }
    
    public void monedaAgarrada(){
        if (isTouching(Purple.class)){
            MyWorld miMundo = (MyWorld) getWorld();
            miMundo.puntos++;  //Incremento los puntos
            miMundo.etiquetaPuntos.actualizarCM("" + miMundo.puntos);  //Actualizo la imagen
            miMundo.removeObject(this); //Elimino al arbol que esta siendo llamado
        }
    }
}
