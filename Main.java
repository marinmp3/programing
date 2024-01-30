 // Solicita 10 círculos y los mete en un array list de Circulos
// muESTRA POR pantalla los circulos introducidos

import java.util.ArrayList;
import java.util.Scanner;
public class Main { // es el main principal
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Circulo> arrayCirculos = new ArrayList<Circulo>();
        int radio; //no tienen por qué llamarse igual que en la clase
        String color;
        Circulo circulo1;

    for (int i = 0 ; i < 10 ; i++){
        System.out.println("Solicita el radio del círculo: ");
        radio = Integer.parseInt(sc.nextLine());

        System.out.println("Solicita el color del círculo: ");
        color = sc.nextLine();

        circulo1 = new Circulo(radio,color);

        arrayCirculos.add(circulo1);
    }
        for (Circulo c : arrayCirculos){
            System.out.println(c);
        }
        
    }   
}