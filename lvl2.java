import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends World{
    

    public int puntosM; //Lleva la cantidad de puntos
    public contadorMonedas etiquetaPuntosM;  //Sirve para mostrar la cantidad de puntos
    
    public int puntosE; //Lleva la cantidad de puntos
    public contadorEstrellas etiquetaPuntosE;
    /**
     * Constructor for objects of class lvl2.
     * 
     */
    public lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        // Crear e inicializar las etiquetas
        etiquetaPuntosM = new contadorMonedas("Monedas: " + puntosM, 25, Color.WHITE);
        addObject(etiquetaPuntosM, 500, 20);
        etiquetaPuntosE = new contadorEstrellas("Estrellas: " + puntosE, 25, Color.WHITE);
        addObject(etiquetaPuntosE, 500, 50);
        
        // plataformas de roca
        addObject(new roca(), 330, 380);
        addObject(new roca(), 250, 120);
        addObject(new roca(), 100, 250);
        addObject(new roca(), 550, 310);
        
        // puente
        addObject(new puente(), 450, 310);
        
        // escaleras
        addObject(new pruebaEscalera(), 180, 100);
        addObject(new pruebaEscalera(), 180, 180);
        
        //canon
        addObject(new canon(), 560, 250);
        
        //monedas
        addObject(new moneda(), 70, 200);
        addObject(new moneda(), 270, 330);
        addObject(new moneda(), 220, 70);
        
        //bola fuego
        addObject(new bolaFuego(), 100, 370);
        
        //dragon
        addObject(new dragon(), 70, 70);
        
        // purple
        addObject(new Purple(), 340, 315);
    }
}
