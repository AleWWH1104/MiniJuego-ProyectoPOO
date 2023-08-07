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
        preguntasYRespuestas.put("Cuánto es 1 + 1", "2");
    }
    public void act()
    {
        // Add your action code here.
        monedaAgarrada();
    }
    
    public void monedaAgarrada(){
        if (isTouching(Purple.class)){
            MyWorld miMundo = (MyWorld) getWorld();
            if (miMundo != null) {
                miMundo.puntosM++;
                miMundo.etiquetaPuntosM.actualizarCM("Monedas: " + miMundo.puntosM);
                miMundo.removeObject(this);
                ganarEstrellas(miMundo);
            }
        }
    }
    
    // sistema para ganar estrellas
    public void ganarEstrellas(MyWorld miMundo){
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
    private String getRandomKey(HashMap<String, String> map) {
        int randomIndex = Greenfoot.getRandomNumber(map.size());
        return (String) map.keySet().toArray()[randomIndex];
    }
    public String obtenerEntrada(String mensaje){
        String input = Greenfoot.ask(mensaje);
        return input;
    }
    
}
