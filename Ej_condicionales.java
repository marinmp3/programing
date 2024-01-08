import java.util.Scanner;
public class Ej_condicionales {

    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int numero = 5;
        String palabra;
        int numero1;
        int numero2;
        String operacion;

        System.out.println("Introduce un número: "); 
        numero = sc.nextInt();
        numero = Integer.parseInt(args[0]);
            if (numero>=0){
                System.out.println(numero + "Es positivo");
            } else {
                System.out.println(numero + "Es negativo");
            }
        
        if (numero >= 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }

        sc.nextLine(); //coge el salto de línea que ha dejado nextInt
            System.out.println("Introduce una palabra y la repito: ");
            palabra = sc.nextLine();
            System.out.println(palabra);

        //10. Solicita por teclado dos numeros y la palabra 'suma' o 'resta'. Realiza la operación correspondiente.
        System.out.println("Introduce el primer número: ");
        numero1 = sc.nextInt();  

        System.out.println("Introduce el segundo número: ");   
        numero2 = sc.nextInt();

        System.out.println("Quieres realizar suma o resta?: ");
        operacion = sc.nextLine();

        if (operacion == "suma"){
            System.out.println(numero1+numero2);
        } else if (operacion == "resta"){
            System.out.println(numero1-numero2);
        } else {
            System.out.println("Introduce una operación válida: ");
        }

        }


    }


//11. Solicita por teclado dos numeros. Escribe "El primer número es mayor" o "El primer número es menor" segun corresponda.
//12. Solicita por teclado dos numeros. Escribe "Has ganado" si el segundo número menos el primero da un valor positivo.
//13. Solicita por teclado un color. Si coincide con el color del ejercicio #0 escribe "¿Cómo sabías que era mi color favorito?
//14. Solicita por teclado un día de la semana y un número. Si el número coincide con su día de la semana o el día introducido es viernes escribe "¡Has ganado!"
//15. Solicita por teclado tres números. Si los dos primeros son mayores que el tercero, escribe "Mayores"; si los dos son menores que el tercero, escribe "Menores"; para cualquier otro caso, escribe "¿Iguales?"


