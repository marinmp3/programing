import java.util.ArrayList;
public class Arrays{
    public static void imprimirArray(String[] lista){
        for (String elemento : lista){
            System.out.println(elemento);
        }
    }

    public static void imprimirArrayInt(int[] lista){
        for (int elemento : lista){
            System.out.println(elemento);
        }
    }

    public static void imprimirArrayChar(char[] lista){
        for (int elemento : lista){
            System.out.println(elemento);
        }
    }
    public static void main (String [] args){
        // ARRAYS ESTÁTICAS - LISTAS NO MODIFICABLES
        // Creación de arrays estáticas - Forma 1:

        String [] Colores = {"Azul", "Rojo", "Negro", "Púrpura"}; //for each para leer sus elementos
        int[] numeros;
        String color;

        for (String Color : Colores){
            System.out.println(Color);
        }

        // Forma 2:

        numeros = new int[10];  //array vacío con 10 huecos
                                    // declaramos y luego lo creamos
        char[] letras = new char[10]; //lo creamos durante la declaración

        String[] colores2 = Colores;
        System.out.println(colores2);

        System.out.println("Imprimo colores");
        imprimirArray(Colores);
        System.out.println("Imprimo colores2");
        imprimirArray(colores2);

        Colores[1] = "Rojo";

        System.out.println("Imprimo colores");
        imprimirArray(Colores);
        System.out.println("Imprimo colores2");
        imprimirArray(colores2);

        // Sacar valor de una posición
        color = Colores[0];
        System.out.println("El color que hay en la primera posición es: " + color);

        // Comprobar lista de números

        System.out.println("Imprimo lista de números");
        imprimirArrayInt(numeros); //por defecto son 0´s

        System.out.println("Imprimo lista de letras");
        imprimirArrayChar(letras); //por defecto son espacios

        // ARRAYS DINÁMICAS - LISTAS MODIFICABLES
        // Creación de arrays dinámicas - Forma 1:
        //tipo de lista     nombre     nueva lista<tipo variable>

        ArrayList<String> arrayColores = new ArrayList<String>();
        ArrayList<String> arrayColores2 = arrayColores;
        arrayColores.add("Azul");
        arrayColores.add("Rojo");
        arrayColores.add("Negro");

        // El tamaño de la lista
        // Eliminar elemento
        System.out.println("La lista tiene : " + arrayColores.size() + " elementos");

        System.out.println("Imprimo el array list de colores: ");
        System.out.println(arrayColores);
        System.out.println("Imprimo el array list de colores2: ");
        System.out.println(arrayColores2);

        //Mostrar o recoger valores de un ArrayList
        color = arrayColores.get(0); // = array[0]
        System.out.println("El color que hay en la primera posición es: " + color);

        // Cambiar un valor del ArrayList
                        //posición, valor a cambiar
        arrayColores.set(1, "Amarillo");
        System.out.println("imprimo arrCol1");
        System.out.println(arrayColores);
        System.out.println("imprimo arrCol2");
        System.out.println(arrayColores2);

        // Eliminar elemento
        arrayColores.remove(1);
        System.out.println("Elimino 'amarillo': ");
        System.out.println(arrayColores);

        // Elimino todo con clear
        // Eliminar elemento
        arrayColores.clear();
        System.out.println("Utilizo clear para eliminar los valores del array: ");
        System.out.println(arrayColores);

        

    
        }

        
       
    
}