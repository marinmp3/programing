import java.util.ArrayList;
import java.util.Scanner;



import java.util.Random;

public class Pregunta{

    // ATRIBUTOS
    private String enunciado;
    private String respuestaCorrecta;
    private int puntuacion;

    private Scanner sc;
    private Random rand;
    private String preguntaAleatoria;


    // CONSTRUCTOR

    public Pregunta(String enunciado, String respuestaCorrecta, int puntuacion){
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntuacion = puntuacion;
    }

    // GETS
    public String getEnunciado(){
        return this.enunciado;
    }

    public String getRespuestaCorrecta(){
        return this.respuestaCorrecta;
    }

    public int getPuntuacion(){
        return this.puntuacion;
    }
    // SETS

    public void setEnunciado(String enunciado){
        this.enunciado = enunciado;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta){
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setPuntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }

    // MÉTODOS

    // public boolean respuestaEsCorrecta(){
    //    return this.respuestaCorrecta;
    // }

    // public void cambiarRespuestaCorrecta(String respuesta){
    //     if (!this.respuestaEsCorrecta()) 
    //     System.out.println("Cambia tu respuesta: ");
    //     this.respuestaCorrecta = sc.nextLine();
    // }

    public String toString(){
        return this.enunciado;
    }

    public static void main(String[] args){
        Pregunta p1 = new Pregunta("¿Cuál es la capital de Francia?", "París", 0);
        Pregunta p2 = new  Pregunta("¿Quién es el protagonista en Piratas del Caribe", "Jack Sparrow", 0);
        Pregunta p3 = new Pregunta("¿Cuál fue el primer espécimen de homínido en descubrirse?", "Australopitecus Afarensis", 0);
        Pregunta p4 = new Pregunta("¿Cómo se llama el actor principal de la película Oppenheimer?", "Cillian Murphy", 0);
        Pregunta p5 = new Pregunta("¿Cuál es el nombre del personaje principal jugable en la saga Red Dead Redemption?", "John Marston ", 0);
        ArrayList<Pregunta> listaPreguntas = new ArrayList<Pregunta>();

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        listaPreguntas.add(p1);
        listaPreguntas.add(p2);
        listaPreguntas.add(p3);
        listaPreguntas.add(p4);
        listaPreguntas.add(p5);

        // preguntaAleatoria = listaPreguntas.get(0);
        // System.out.println(preguntaAleatoria);
    }
}