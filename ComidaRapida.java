import java.util.Scanner;
import java.util.ArrayList;

public class ComidaRapida{
    public static void ImprimirArray(String[] lista){
    for (String elemento : lista){
            System.out.println(elemento);
    }
}

    public static void Main (String[] args){
        int hamburguesa = 6;  //se declaran las variables de enteros
        int pizza = 12;
        int helado = 3;
        Scanner sc = new Scanner (System.in);
        ArrayList<String> pedidoTotal = new ArrayList<String>();
        ArrayList<String>  ingrHamburguesa = new ArrayList<String>(); //creamos con ellas listas dinámicas pues las podremos modificar
        ArrayList<String>  ingrPizza = new ArrayList<String>();
        ArrayList<String>  ingrHelado = new ArrayList<String>();
        String continuarPedido; //una variable para las opciones que nos permiten terminar la orden
        String seleccionarPedido; //otra única para la comida a ordenar
        String preguntarContinuar = "¿Quieres pedir algo más?: ";
        String preguntarIngrediente;
        String pedidoHamb;
        String pedido_Pizza;
        String pedido_Helado;

        ingrHamburguesa.add("tomate"); //añadimos en las listas cada elemento con .add
        ingrHamburguesa.add("lechuga");
        ingrHamburguesa.add("mayonesa");

        ingrPizza.add("salsa");
        ingrPizza.add("extra de queso");

        ingrHelado.add("chispitas");
        ingrHelado.add("sirope");
        ingrHelado.add("cucurucho o tarrina");

    
        while (continuarPedido == "si"){ //bucle while para iterar sobre la condición continuarPedido
            System.out.println("¿Qué quiere pedir? (Hamburguesa, pizza o helado): ");
            seleccionarPedido = sc.nextLine();
                if (seleccionarPedido == "Hamburguesa"){ //MEJOR HACER CON SWITCH(COMIDA)
                    pedidoHamb = imprimirArray("¿Quiere" + ingrHamburguesa.get(0) + "?");
                    preguntarIngrediente = sc.nextLine();
                    if (preguntarIngrediente == "si")
                    pedidoTotal.add(pedidoHamb);

                } else if (seleccionarPedido == "pizza"){
                    pedido_Pizza = imprimirArray("¿Quiere" + ingrPizza + "?");
                    preguntarIngrediente = sc.nextLine();
                    if (preguntarIngrediente == "si")
                    pedidoTotal.add(pedido_Pizza);

                } else if (seleccionarPedido == "helado"){
                    pedido_Helado = imprimirArray("¿Quiere" + ingrHelado + "?");
                    preguntarIngrediente = sc.nextLine();
                    if (preguntarIngrediente == "si")
                    pedidoTotal.add(pedido_Helado);

                } else {
                    System.out.println("No tenemos ese producto. Elije otro: ");
                } 
            }  

            System.out.println("Tu orden final es: " + pedidoTotal);
        }
    }   





// A terminar mostrará el pedido numerando el número de alimentos que queremos y su información.
// Podemos eliminar el alimento que queramos de la lista.
// Finalmente mostrará el número de productos, el precio final y nos pedirá un nombre para escribirlo en
// las pantallas cuando esté preparado el pedido.

// Ejemplo de ejecución:
// ¿Qué quiere pedir? Hamburguesa, Pizza o Helado.

// Helado.
// ¿Quiere chispitas?
// Si.
// ¿Quiere sirope?
// No.

// ¿Quiere cucurucho o tarrina?
// Cucurucho.
// ¿Quiere algo más?
// Si.

// ¿Qué quiere pedir? Hamburguesa, Pizza o Helado.

// Pizza.
// ¿Quiere salsa?
// Si.
// ¿Quiere extra de queso?
// No.
// ¿Quiere algo más?
// No.

// Va a comprar:
// 1. Un helado con chispitas, sin sirope y en
// cucurucho.
// 2. Una pizza con salsa y sin extra de queso.
// ¿Desea eliminar algo del pedido?

// Si.

// ¿Indica el número del producto desea eliminar?

// 2
// Va a comprar:
// 1. Un helado con chispitas, sin sirope y en
// cucurucho.
// ¿Desea eliminar algo del pedido?

// No.
// Son un producto y 3€.
// Introduzca el nombre de la persona que recogerá el
// pedido.

// Celia.
// Muchas gracias, Celia!