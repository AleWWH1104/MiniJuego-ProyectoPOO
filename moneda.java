import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;

public class moneda extends Actor{
    // diccionario preguntas y respuestas 
    private HashMap<String, String> preguntasYRespuestas;
    private int widthOriginal;
    private int heightOriginal;
    
    
    public moneda(){
        GreenfootImage image = getImage();
        widthOriginal = image.getWidth();
        heightOriginal = image.getHeight();
        int nuevoAncho = 30; 
        int nuevoAlto = 30; 
        image.scale(nuevoAncho, nuevoAlto);
        
        // preguntas y respuestas del dic
        preguntasYRespuestas = new HashMap<>();
        preguntasYRespuestas.put("¿Cuánto es 1 + 1?", "2");
        preguntasYRespuestas.put("¿Cuál es el río más largo del mundo?", "Amazonas");
        preguntasYRespuestas.put("¿En qué país se encuentra la torre de Pisa?", "Italia");
        preguntasYRespuestas.put("¿Qué año llegó Cristóbal Colón a América?", "1492");
        preguntasYRespuestas.put("¿Qué producto cultiva más Guatemala?", "cafe");
        preguntasYRespuestas.put("¿Cuál es el país más grande del mundo?", "Rusia");
        preguntasYRespuestas.put("¿Cuánto es 7(3^2 - 5) - 7+3 = ?", "24");
        preguntasYRespuestas.put("¿Cuál es el valor de x, 5x - 2 = 3x + 4 ?", "3");
        preguntasYRespuestas.put("¿Qué cantidad expresa el número romano V?", "5");
        preguntasYRespuestas.put("¿Cuánto es un lustro?", "5");
        preguntasYRespuestas.put("Si tienes un billete de 100€, dos billetes de 20€ y cuatro monedas de 1 €, ¿cuánto dinero tienes en total?", "144");
        preguntasYRespuestas.put("¿Cuál es la raíz cuadrada de 81?", "9");

    }
    public void act()
    {
        // Add your action code here.
        monedaAgarrada();
    }
    
    public void monedaAgarrada() {
        if (isTouching(Purple.class)) {
            World miMundo = getWorld();
            if (miMundo instanceof MyWorld) {
                MyWorld myWorld = (MyWorld) miMundo;
                if (myWorld.etiquetaPuntosM != null) {
                    myWorld.puntosM++;
                    myWorld.etiquetaPuntosM.actualizarCM("Monedas: " + myWorld.puntosM);
                }
                myWorld.removeObject(this);
                ganarEstrellas(myWorld);
            } else if (miMundo instanceof lvl2) {
                lvl2 level2 = (lvl2) miMundo;
                if (level2.etiquetaPuntosM != null) {
                    level2.puntosM++;
                    level2.etiquetaPuntosM.actualizarCM("Monedas: " + level2.puntosM);
                }
                level2.removeObject(this);
                ganarEstrellaslvl2(level2);
            }
        }
    }
    
    
    // sistema para ganar estrellas
    public void ganarEstrellas(MyWorld miMundo){
        
        if (miMundo instanceof MyWorld){
            MyWorld myWorld = (MyWorld) miMundo;
            
            // Obtener una pregunta aleatoria del HashMap
            String preguntaAleatoria = getRandomKey(preguntasYRespuestas);
    
            // Obtener la respuesta correcta de la pregunta
            String respuestaCorrecta = preguntasYRespuestas.get(preguntaAleatoria);
    
            //Validar la pregunta y respuesta
            String input = obtenerEntrada(preguntaAleatoria);
            if (input.equalsIgnoreCase(respuestaCorrecta)){
                //System.out.println("sisisis"+ input);
                miMundo.puntosE++;
                miMundo.etiquetaPuntosE.actualizarCME("Estrellas: " + miMundo.puntosE);
            } else{
                //System.out.println();
                miMundo.etiquetaPuntosE.actualizarCME("Estrellas: " + miMundo.puntosE);
            }
        }
        
        
    }
    public void ganarEstrellaslvl2(lvl2 miMundo){
        lvl2 level2 = miMundo;
        if (miMundo instanceof lvl2){
            
            // Obtener una pregunta aleatoria del HashMap
            String preguntaAleatoria = getRandomKey(preguntasYRespuestas);
    
            // Obtener la respuesta correcta de la pregunta
            String respuestaCorrecta = preguntasYRespuestas.get(preguntaAleatoria);
    
            //Validar la pregunta y respuesta
            String input = obtenerEntrada(preguntaAleatoria);
            if (input.equalsIgnoreCase(respuestaCorrecta)){
                //System.out.println("sisisis"+ input);
                miMundo.puntosE++;
                miMundo.etiquetaPuntosE.actualizarCME("Estrellas: " + miMundo.puntosE);
            } else{
                //System.out.println();
                miMundo.etiquetaPuntosE.actualizarCME("Estrellas: " + miMundo.puntosE);
            }
        }
        
        
        
    }
    
    private String getRandomKey(HashMap<String, String> map) {
        int randomIndex = Greenfoot.getRandomNumber(map.size());
        return (String) map.keySet().toArray()[randomIndex];
    }
    public String obtenerEntrada(String mensaje){
        String input = Greenfoot.ask(mensaje);
        return input;
    }
    
}
