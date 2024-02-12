package com.stem;
import java.util.Scanner;

public class Nube {

    //LOS ENUM SON UN TIPO DE CLASE
    public enum TiposNubes{
        CIRROS,
        CUMULOS,
        ESTRATOS,
        NIMBOS; //si no le hacemos toString, no acaba en ;

    public static String mostrar(){
            return "[CIRROS, CÚMULOS, ESTRATOS, NIMBOS]";
        }
    }
    
    private TiposNubes tipo;
    private double altura;
    private double tamanio;

    /**
     * Constructor por parámetros
     * @param tipo
     * @param altura
     * @param tamanio
     */
    public Nube(TiposNubes tipo, double altura, double tamanio){
        this.tipo = tipo;
        this.altura = altura;
        this.tamanio = tamanio;
    } 

    /**
     * Constructor por defecto
     */
    public Nube(){
        this.tipo = TiposNubes.NIMBOS;
        this.altura = 3000.50;
        this.tamanio = 1000.50;
    }

    /**
     * Constructor de copia
     * @param n
     */
    public Nube(Nube n){
        this.tipo = n.tipo;
        this.altura = n.altura;
        this.tamanio = n.tamanio;
    }

    /**
     * Recoge la altura actual de la nube
     * @return La altura de la nube
     */
    public double getAltura(){
        return this.altura;
    }

    /**
     * Recoge el tamaño actual de la nube
     * @return El tamaño de la nube
     */
    public double getTamanio(){
        return this.tamanio;
    }

    public String toString(){
        return "altura: " + this.altura + "tamaño: " + this.tamanio;
    }

    public double unir(Nube n){
        if (this.altura == n.altura){
            this.tamanio += n.tamanio;
            n.tamanio = 0;
            n.altura = 0;
        }
    }

    public static void main(String[] args) {
        Nube nube1 = new Nube();
        

        Scanner sc = new Scanner(System.in);

        // Al haber creado toString, lo añadimos
        // Si no, para mostrar un enum usamos TiposNubes.values()
        System.out.println("Introduce el tipo de nube [" + TiposNubes.mostrar() + "]" + ": ");
        String tipoString = sc.nextLine().toUpperCase(); //el tipo de nube en f.String

        //--> tipoString = tipoString.toUpperCase();

        TiposNubes tipoEnum = TiposNubes.valueOf(tipoString);

        Nube nube2 = new Nube(tipoEnum, 4000, 200);
        Nube nube3 = new Nube(nube2);
    }
}
