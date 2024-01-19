import java.util.Scanner;
import java.util.Random;

// Para terminar.- Se decide preservar la anonimidad de los integrantes por lo que, en vez de mostrar por
// pantalla su nombre completo, se mostrarán las tres primeras letras y el resto de letras en forma de ***.
// El nombre del jefe de equipo si debe conocerse.
// El equipo nombreDelEquipo está compuesto por numIntegrantes integrantes, a saber: Int*********,
// Int*********, Int********* e Int*********. El jefe de equipo es Integrante_2.

public class PlataformaDeRegistro{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);  //inicialización de varibales
        Random rand = new Random();
        String NombreDelEquipo;
        int NumIntegrantes;
        int JefeEquipo;
        
        
            System.out.println("Introduce el nombre del equipo: "); //solicitmos por pantalla nombre del equipo y sus integrantes
            NombreDelEquipo = sc.nextLine();

            System.out.println("Introduce su número de miembros: ");
            NumIntegrantes = sc.nextInt();

            for (int ContadorIntegrantes = 0 ; ContadorIntegrantes < NumIntegrantes ; ContadorIntegrantes++){
                System.out.println("El equipo " + NombreDelEquipo + "está compuesto por " + NumIntegrantes + " integrantes, a saber: " + ContadorIntegrantes); //creamos un for para iterar sobre el número de integr introducidos
            }

            System.out.println("---------------------");

            JefeEquipo = rand.nextInt(NumIntegrantes);
            System.out.println("El jefe del equipo es el integrante número " + JefeEquipo); //generamos un jefe de forma aleatoria

        }
       
    }
        
