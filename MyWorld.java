import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    public int puntosM; //Lleva la cantidad de puntos
    public contadorMonedas etiquetaPuntosM;  //Sirve para mostrar la cantidad de puntos
    
    public int puntosE; //Lleva la cantidad de puntos
    public contadorEstrellas etiquetaPuntosE;
    
    
    private GreenfootSound music;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //music = new GreenfootSound("https://drive.google.com/file/d/1RHgfsFarAeI4n6p7Du4JWlJjN8LOPwGr/view?usp=sharing"); // Reemplaza con la URL del enlace de la canción
        //music.play(); // Iniciar la reproducción de la música
        
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
        addObject(new snake(), 540, 5);
        //Cohete
        addObject(new cohete(), 0, 200);
        
        //escalreas
        addObject(new pruebaEscalera(), 524, 285);
        
        addObject(new pruebaEscalera(), 247, 265);
        addObject(new pruebaEscalera(), 247, 200);
        
        addObject(new pruebaEscalera(), 463, 160);
        addObject(new pruebaEscalera(), 463, 110);
        
        //puentes
        addObject(new puente(), 370, 270);
        addObject(new puente(), 192, 330);
        
        // Monedas
        puntosM = 0;
        etiquetaPuntosM = new contadorMonedas("Monedas: "+"" + puntosM, 25, Color.BLACK);
        addObject(etiquetaPuntosM, 60, 20);
        
        //Estrellas
        puntosE = 0;
        etiquetaPuntosE = new contadorEstrellas("Estrellas: "+"" + puntosE, 25, Color.BLACK);
        addObject(etiquetaPuntosE, 60, 50);
    }
    
}
