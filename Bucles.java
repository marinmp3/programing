import java.util.Scanner;
public class Bucles{
    public static void main (String [] args){
        // bucle for each in... EN JAVA NECESITAN UNA LISTA PREVIA

        Scanner sc = new Scanner(System.in);
        String[] ListaColores = {"Rojo", "Rosa", "Verde", "Amarillo", "Marrón", "Negro"};
        boolean salir = false;
        String palabra = "";

        // Inicializar la variable del for
        for (String color : ListaColores){
            System.out.println(color);
        }
        System.out.println("-----------------------");

        // RECORRER lista de strings - bucle no each
        for (int i = 0; i < ListaColores.length; i++){
            System.out.println(i);
        }

        System.out.println("-----------------------");

        // Para IMPRIMIR un string
        // for (color : ListaColores)
        //     System.out.println(color);

        System.out.println("-----------------------");

        // For - NO el que se usa en Python
        // se inicializa el contador,
        // establecemos que llega hasta 50 (mientras que / condición while) y suma de 1 en 1 (si quiero
        // que sume de 2 en 2 -> +=2)
        for (int contador = 0; contador < 10; contador++){
            System.out.println(contador);
        }
        System.out.println("-----------------------");

        // i de Iterador - se utilizan en matrices
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("-----------------------");

        // Bucles for anidados
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("" + i + j + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        // Bucle for como while
        
        System.out.println("Bucle for como while");
        // Cuidado con los huecos
        for (palabra = ""; !palabra.equals("salir"); ){
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        }
        

        // Bucle while - se utilizan en booleanos
        System.out.println("Bucle while");

        while (!palabra.equals("salir")){
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        }   

        System.out.println("Bucle while refactorizado");
        while (!palabra.equals("salir"))

        System.out.println("-----------------------");

        // Bucle doWhile
        System.out.println("Bucle doWhile")
        do {
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine;

        }while (!palabra.equals("salir"));

        do{
            System.out.println("Introduce un número entre 1 y 50: ");
            numero = sc.nextInt;
        } while (numero<1 || numero>50); 
}
    
