import java.util.Scanner;
public class EjerciciosBucles{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        String palabra;
        char letra;

// 0 - Solicita un número natural. Vuelve a solicitarlo hasta que efectivamente sea un º natural
        
        do{
            System.out.println("Dime un número natural: ");
            numero = sc.nextInt();
        } while(numero<0);


// 1. Solicita un número entre 0 y 100 y asegúrate de ello.

    do{
        System.out.println("introduce un número: ");
        numero = sc.nextInt();
    }while(numero>=0 && numero<=100);

// 2. Solicita una letra. Asegúrate de que es una letra (a in lista)

    sc.nextLine();
    do{
        System.out.println("Introduce una letra: ");
        // palabra = sc.nextLine();
    // se introduce una palabra porque el programa no puede leer UNA sola letra como conjunto de strings
    // sc.nextLine devuelve string. Con un str podemos llamar a la función charAt(index), que devuelve
    // el caracter que hay en la posición index // String -> "" // char -> ''
        letra = sc.nextLine().charAt(0); 
    } while(!(letra >= 'a' && letra <= 'z' || letra >= 'A' && letra <= 'Z'));
    
    } 
}
