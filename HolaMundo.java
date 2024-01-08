// # print hola mundo en java
import java.util.Scanner;
class HolaMundo {

    public static void main(String[] args){
        //Solicitar args al ejecutar el código
        if (args.length == 1) {
            System.out.print("Hola " + args[0] + "!");
        }
        else{
            System.out.print("Hola mundo!");
        }
        //prinln es equivalente a \n
        System.out.print("Utilizando print...");
        System.out.println("Después del print...");
        System.out.println("Utilizando println...");
        System.out.println("Después del println...");

        //Hacer operaciones en el print:
        System.out.print("3+3: ");
        System.out.println(3+3);
        System.out.print("3+3: " + (3+3) );
        System.out.print("3+3: " + 3+3 );
        System.out.print("3+3: " + (3*3));
        // System.out.print("'3'*n: " + ("3"*"n"));

        // Tipos de datos
        // Int
        int numero = 5;
        System.out.println(numero);
        System.out.println("El número es: " + numero + ".");
        // Double
        double numero2 = 5/2;
        System.out.println("El número de tipo double es: " + numero2 + ".");
        // Float
        float numero3 = 5/2.0f;
        System.out.println("El número de tipo float es: " + numero3 + ".");
        
        //numeroSTR a numeroINT
        // System.out.println("Int: " + numeroINT + "\nString" + numeroSTR);
        // numeroINT = 1;
        // numeroSTR = "1";

        // Castings: definir de qué tipo es una variable
        // Declarar es darle tipo y definir es darle valor
        // para pasar de un valor a otro -> Parse

        int numeroINT;
        String numeroSTR;
        double numeroDouble;
        float numeroFloat; 

        boolean esFacil = true;
        System.out.println(esFacil);
        System.out.println(!esFacil);
        boolean esBonito = true;
        System.out.println(esBonito);

        double notacionCientifica = 12E2; //escribir un num en not_cient = 12*10/2 -> sirve para quitar decimales
        System.out.println(notacionCientifica);

        //Se puede declarar en una sola sentencia - solo variables que estén relacionadas
        System.out.println("--- Declaración de variables ---");
        int x,y,z;
        x = 10;
        y = 20;
        z = 30;
        System.out.println(x + " - " + y + " - " + z);

        int a = 10, b = 20, c = 30;
        System.out.println(a + " - " + b + " - " + c);

        System.out.println("--- Declaración de CONSTANTES - se escriben en mayus. ---");
        final int TAMAÑOMAX = 100; //son variables que no van a cambiar

        System.out.println("final INT:" + TAMAÑOMAX);

        // Introducir datos por pantalla - input

        System.out.println("--- input - Scanner ---");
        Scanner sc = new Scanner(System.in);
        String palabra;
        int numero4;
        System.out.print("Introduce una palabra: ");   
        palabra = sc.nextLine();
        System.out.println(palabra);
        System.out.print("Introduce un número: ");   
        numero4 = sc.nextInt();
        System.out.println(numero4);



    } 

}

// class Repeticion {
//     public static void main(Integer[] args){
//         System.out.println(4);
// }



// }
