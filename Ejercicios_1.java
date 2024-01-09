import java.util.Scanner;
class Ejercicios_1 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int numero = 5;
        String palabra;
        int numero1;
        int numero2;
        String operacion;
        String color;
        String color2;
        String dia;
        int numero3;

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

        //0. Solicita por teclado un color. Guárdalo para más tarde
        System.out.println("Dime un color: ");
        color = sc.nextLine();
        System.out.println(color);

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

        //11. Solicita por teclado dos numeros. Escribe "El primer número es mayor" o "El primer número es menor" segun corresponda.
        System.out.println("Dime un número: ");
        numero1 = sc.nextInt();
        System.out.println("Dime otro número: ");
        numero2 = sc.nextInt();

        if (numero1>numero2){
            System.out.println("El primer número es mayor");
        }else {
            System.out.println("El segundo número es mayor");
        }

        //12. Solicita por teclado dos numeros. Escribe "Has ganado" si el segundo número menos el primero da un valor positivo.
        System.out.println("Dime un número: ");
        numero1 = sc.nextInt();
        System.out.println("Dime otro número: ");
        numero2 = sc.nextInt();

        if (numero2-numero1>0){
            System.out.println("Ganaste");
        }else {
            System.out.println("Perdiste :(");
        }
        //13. Solicita por teclado un color. Si coincide con el color del ejercicio #0 escribe "¿Cómo sabías que era mi color favorito?
        System.out.println("Dime un color: ");
        color2 = sc.nextLine();

        if (color2==color){
            System.out.println("¿Cómo sabías que era mi color favorito? :o");
        } else {
            System.out.println("Ese no es mi color favorito :´(");
        }

        //14. Solicita por teclado un día de la semana y un número. Si el número coincide con su día de la semana o el día introducido es viernes escribe "¡Has ganado!"
        System.out.println("Dime un día de la semana: ");
        dia = sc.nextLine();
        System.out.println("Dime un número: ");
        numero3 = sc.nextInt();

        if (dia == "lunes" && numero3 == 1 || dia == "martes" && numero3 == 2 || dia == "miércoles" && numero3 == 3 || dia == "jueves" && numero3 == 4 || dia == "sábado" && numero3 == 6 || dia == "domingo" && numero3 == 7){
            System.out.println("¡Has ganado!");
        } else if (dia == "viernes"){
            System.out.println("¡Has ganado!");
        } else {
            System.out.println("Has perdido...");
        }
        //15. Solicita por teclado tres números. Si los dos primeros son mayores que el tercero, escribe "Mayores"; si los dos son menores que el tercero, escribe "Menores"; para cualquier otro caso, escribe "¿Iguales?"
        System.out.println("Dime un número: ");
        numero1 = sc.nextInt();

        System.out.println("Dime otro número: ");
        numero2 = sc.nextInt();

        System.out.println("Otro: ");
        numero3 = sc.nextInt();

        if (numero1 > numero3 && numero2 > numero3){
            System.out.println("Son mayores");
        } else if (numero1 < numero3 && numero2 < numero3){
            System.out.println("Son menores");
        } else {
            System.out.println("Son iguales?");
        }
    }
}



 



    







