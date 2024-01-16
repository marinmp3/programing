import java.util.Random;
public class Random_Funciones {

    public static boolean métodoEsPar(int numero){
        System.out.println("Función esPar");
        return numero%2 == 0;
    }

     
     
    public static void main (String[] args){
        Random rand = new Random();
        int numero;
        double numeroDouble;
        boolean esPar;
    System.out.println("-------------------");
    // opc 1. Generar un número random
        numero = rand.nextInt(); //funciona como sc.
        System.out.println(numero);

        System.out.println("-------------------");

    // Número entre 0 y 4:
        numero = rand.nextInt(5);
        System.out.println();

        System.out.println("-------------------");
    
    // Número entre 0 y 5
        numero = rand.nextInt(5+1);
        System.out.println();

        System.out.println("-------------------");
    
    // Número entre 1 y 5
        numero = rand.nextInt(5)+1;
        System.out.println();

        System.out.println("-------------------");

    // opc 2. 
    // Número entre 0 y 1
        numeroDouble = Math.random();
        System.out.println(numeroDouble);

        System.out.println("-------------------");

    // Número aleatorio double entre 0 y 20 con decimales
        numeroDouble = Math.random()*20;
        System.out.println(numeroDouble);

        System.out.println("-------------------");

    // Número aleatorio entero entre 0 y 20
        numero = (int)Math.floor(Math.random()*20);
        System.out.println(numero);

        System.out.println("-------------------");

    // Número aleatorio int entre 5 y 20
        int minimo = 5;
        int maximo = 20;
        int diferencia = maximo-minimo;

        numero = (int)Math.floor((Math.random()*diferencia)+minimo);
        System.out.println(numero);
        

    //Generar pruebas
        for (int i = 0 ; i<100 ; i++){
            numero = (int)Math.floor(Math.random()*100);
            esPar = métodoEsPar(numero);
            System.out.println("¿" + numero + "es par?");
        }
    
    }

}