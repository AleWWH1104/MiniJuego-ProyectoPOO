import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class contadorEstrellas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contadorEstrellas extends Actor
{
    /**
     * Act - do whatever the contadorEstrellas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // Codigo copiado de ejemplos de clase
    private String texto;
    private int tamañoFuente;
    private Color colorTexto;
    public contadorEstrellas(String texto, int tamañoFuente, Color colorTexto){
        this.texto = texto;
        this.tamañoFuente = tamañoFuente;
        this.colorTexto = colorTexto;
        actualizarCM(texto);
    }
    
    public void act()
    {
        // Add your action code here.
        
    }
    public void actualizarCM(String texto) {
        GreenfootImage imagen = new GreenfootImage(texto, tamañoFuente, colorTexto, null);
        setImage(imagen);
    }
    
}
