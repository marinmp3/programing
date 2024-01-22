import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
// caso #1.- Introduciendo, al ejecutar el sistema, el nombre del equipo y el número de miembros que lo
// componen. El nombre de los integrantes se debe solicitar a posteriori.
// plataformaDeRegistro nombreDelEquipo numIntegrantes

// caso #2.- Introduciendo, al ejecutar el sistema, el nombre del equipo, el número de miembros que lo
// componen y el nombre de cada uno de los (en caso de ser compuesto, con _ en lugar de espacios.
// Asumimos que los nombres son introducidos correctamente).
// plataformaDeRegistro nombreDelEquipo 4 Integrante_1 Integrante_2 Integrante_3 Integrante_4


// En ambos casos #1 y #2.- Se debe mostrar por pantalla un mensaje con la siguiente estructura:
// El equipo nombreDelEquipo está compuesto por numIntegrantes integrantes, a saber: Integrante_1,
// Integrante_2, Integrante_3 e Integrante_4.
// PISTA: No podéis crear una variable por cada integrante porque no sabéis cuántos son, menos mal
// que sabemos manejar Strings.
// En ambos casos #1 y #2.- Se debe elegir de manera aleatoria un único jefe de equipo entre los
// integrantes del mismo.
// El equipo nombreDelEquipo está compuesto por numIntegrantes integrantes, a saber: Integrante_1,
// Integrante_2, Integrante_3 e Integrante_4. El jefe de equipo es Integrante_2.
// Para terminar.- Se decide preservar la anonimidad de los integrantes por lo que, en vez de mostrar por
// pantalla su nombre completo, se mostrarán las tres primeras letras y el resto de letras en forma de ***.
// El nombre del jefe de equipo si debe conocerse.
// El equipo nombreDelEquipo está compuesto por numIntegrantes integrantes, a saber: Int*********,
// Int*********, Int********* e Int*********. El jefe de equipo es Integrante_2.

public class PT2_Arrays{
        public static void main (String [] args){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String nombreDelEquipo;
        int numIntegrantes;
        String jefeEquipo= "";
        int numJefe;
        String nombreIntegrante = "";
        ArrayList<String> listaIntegrantes = new ArrayList<String>();
       

            if (args.length > 2){
                System.out.println("Introduce el número de argumentos correcto [2].");
            } else {
                System.out.println("Correcto.");
                nombreDelEquipo = args[0];
                numIntegrantes = Integer.parseInt(args[1]);

                for (int i = 0 ; i < numIntegrantes ; i++){
                System.out.println("Introduce el nombre del integrante " + (i+1) + ": ");
                nombreIntegrante = sc.nextLine();
                listaIntegrantes.add(nombreIntegrante);
                // if (numJefe == i) jefeEquipo = nombreIntegrante;
            }
        }

            numJefe = rand.nextInt(numIntegrantes);
            jefeEquipo = listaIntegrantes.get(numJefe);

            System.out.println("---------------------");

            System.out.println ("El equipo " + nombreDelEquipo + 
                                " está compuesto por " + numIntegrantes + 
                                " integrantes, a saber: " + listaIntegrantes);

            
            System.out.println("El jefe del equipo es el integrante número " + jefeEquipo); //generamos un jefe de forma aleatoria

        }
    }
        
