import java.util.Scanner;
public class EjerciciosBásicos {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int numero1 = 4;
        int numero2;
        String operación;
    // 1
        if (numero1<5){
            System.out.println("Es menor que 5");
        } else if (numero1>5){
            System.out.println("Es mayor a 5");
        } else {
            System.out.println("Es igual a 5");
        }

    // 2
        System.out.println("Introduce un número: ");
        numero1 = sc.nextInt();

        if (numero1 < 0){
            System.out.println("Es negativo");   
        } else {
            System.out.println("Es positivo");
        }
    
    // 3
    System.out.println("Introduce un número: "); 
        numero1 = sc.nextInt();
        numero1 = Integer.parseInt(args[0]);
            if (numero1>=0){
                System.out.println(numero1 + "Es positivo");
            } else if (numero1 < 0) {
                System.out.println(numero1 + "Es negativo");
            } else {
                System.out.println("No has escrito bien los argumentos. Escribe un solo número: ");
                numero1 = sc.nextInt();
                if (numero1>=0){
                System.out.println(numero1 + "Es positivo");
            } else {
                System.out.println(numero1 + "Es negativo");
            }
        }
    // 4
    System.out.println("Introduce un número: "); 
        numero1 = sc.nextInt();
        numero1 = Integer.parseInt(args[0]);

    System.out.println("Introduce otro número: ");
        numero2 = sc.nextInt();
        numero2 = Integer.parseInt(args[1]);
            if (numero1>numero2){
                System.out.println(numero1 + "es mayor que" + numero2);
            } else if (numero2 > numero1) {
                System.out.println(numero2 + "es mayor que" + numero1);
            } else {
                System.out.println("No has escrito bien los argumentos. Escribe solo dos números: ");
                numero1 = sc.nextInt();
                numero2 = sc.nextInt();

                if (numero1>numero2){
                System.out.println(numero1 + "es mayor que" + numero2);
            } else if (numero2 > numero1) {
                System.out.println(numero2 + "es mayor que" + numero1);
            }
        }

        // 5
        System.out.println("Dime un número: ");
        numero1 = sc.nextInt();
        System.out.println("Dime el segundo número: ");
        numero2 = sc.nextInt();
        System.out.println("¿Qué operación quieres realizar?: ");
        operación = sc.nextLine();

        switch (operación) {
            case "suma":
                System.out.println(numero1 + numero2);
                break;
            case "resta":
                System.out.println(numero1 - numero2);
                break;
            case "multiplicación":
                System.out.println(numero1*numero2);
                break;
            case "división":
                System.out.println(numero1/numero2);
                break;
            default:
                break;
        }
    }
}



// 5.- Calculadora en Switch.
// Solicita por teclado dos números y la palabra operación (suma, resta, multiplicación, división). El programa debe realizar la operación correspondiente. Modifícalo para que pueda funcionar tanto los datos introducidos por teclado como introduciendole argumentos al main.

// Ejercicios Básicos.
// .- Numero natural: Solicita un número, si es menor que 0 imprime que no es un número natural.
// .- Hora: Solicita una hora (hora,minutos,segundos) en una única línea, separada por espacios. Si los datos son incorrectos, lanza un mensaje de error.
// .- Par: Solicita un número par, si el número introducido no es un número par lanza un mensaje de error.
// .- Pasar a par: Solicita un número par, si el número introducido es impar súmale uno.
// .- Positivo: Solicita un número positivo, si el número introducido no es un número positivo lanza un mensaje de error.
// .- Pasar a positivo: Solicita un número positivo, si el número introducido es negativo pásalo a positivo.
// .- Rango de edad: Solicita una edad y asegúrate de que está comprendida entre 0 y 120 años, si el número introducido no cumple la condición, lanza un mensaje de error.
// .- Vocal: Solicita una vocal, si dato introducido no es una vocal, lanza un mensaje de error. [!] Ascii.
// .- Letra: Solicita una letra, si dato introducido no es una letra, lanza un mensaje de error.
// .- Mayúscula: Solicita una letra mayúscula, si dato introducido no es una letra mayúscula, lanza un mensaje de error.
// .- Pasar a mayúscula: Solicita una letra mayúscula, si dato introducido no es una letra mayúscula, pero si una letra minúscula, pasalá a mayúscula.
// .- Dígito: Solicita un dígito, si dato introducido no es un dígito, lanza un mensaje de error.
