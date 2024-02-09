 import java.util.ArrayList;

public class Libro {
    // Atributo de instancia.
    private String titulo;
    private String autor;
    private final String ISBN;
    private int numPaginas;
    private int fechaPublicacion; // año.
    // Atributo de clase -> 
    // Es propio de la clase y no de cada uno de los objetos que la componen.
    private static int numMaximoLetras = 15;

    /**
     * Constructor con parámetros. 
     * Crear un libro con un título y ISBN especificados.
     * @param titulo El título del libro.
     * @param ISBN El ISBN del libro.
     */
    public Libro(String titulo, String ISBN){
        this.setTitulo(titulo);
        this.autor = "";
        this.ISBN = ISBN;
        this.numPaginas = 0;
        this.fechaPublicacion = 0;
    }
    /**
     * Constructor con parámetros. 
     * Crear un libro con un título, autor, ISBN y número de páginas especificados.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param ISBN El ISBN del libro.
     * @param numPaginas El número de páginas del libro.
     * @param fechaPublicacion Fecha en la que se publicó el libro
     */
    public Libro(String titulo, String autor, String ISBN, int numPaginas, int fechaPublicacion){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.ISBN = ISBN;
        // Opción 1:
        this.numPaginas = 0;
        this.setNumPaginas(numPaginas); //if (numPaginas > 0) this.numPaginas = numPaginas;
        /*
        // Opción 2:
        this.numPaginas = numPaginas;
        if (numPaginas <= 0)  this.numPaginas = 0;
        // Opción 3:
        if (numPaginas <= 0) numPaginas = 0;
        this.numPaginas = numPaginas;
        */
       this.fechaPublicacion = fechaPublicacion;
        
    }

    /**
     * Obtener el título actual del libro.
     * @return El título del libro.
     */
    public String getTitulo(){
        return this.titulo;
    }
    /**
     * Obtener el autor actual del libro.
     * @return El autor del libro.
     */
    public String getAutor(){
        return this.autor;
    }
    /**
     * Obtener el ISBN actual del libro.
     * @return El ISBN del libro.
     */
    public String getISBN(){
        return this.ISBN;
    }
    /**
     * Obtener el número de páginas actual del libro.
     * @return El número de páginas del libro.
     */
    public int getNumPaginas(){
        return this.numPaginas;
    }
    public int getFechaPublicacion(){
        return this.fechaPublicacion;
    }

    /**
     * Establecer el título del libro. 
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
        if (titulo.length() > this.numMaximoLetras) this.titulo = titulo.substring(0,this.numMaximoLetras);
    }

    /**
     * Nuestro substring() - no necesita que se le pase un libro, sino un str
     * por lo que es estático (es independiente de la clase Libro)
     *  
     */
    private static String nuestroSubstring(String palabra, int inicio, int fin){
        int longitud = palabra.length();
        String subPalabra = "";
        for (int i = inicio ; i < fin && i < longitud ; i++){ //se puede escribir más de una cond.
            subPalabra+=palabra.charAt(i);
        }
        return subPalabra;
    }

    /**
     * Nuestro SPLIT()
     * @since 09/02/2024
     */
    private static void nuestroSplit(String frase, char separador){
        ArrayList<String> listaPalabras = new ArrayList<String>();
        String palabra = "";
        for(int i = 0; i < frase.length() ; i++){
            if (frase.charAt(i) != separador){
                palabra += frase.charAt(i);
            } else {
                listaPalabras.add(palabra);
                palabra = "";
            }
        }
        if (!palabra.equals("")) listaPalabras.add(palabra);

        System.out.println(listaPalabras);
    }
    /**
     * Establecer el autor del libro. 
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor){
        this.autor = autor;
        if (autor.length() > this.numMaximoLetras){
            this.autor = "";
            String[] autorPorPalabras = autor.split(" ");
            for (int i = 0 ; i < autorPorPalabras.length ; i++){
                this.autor += autorPorPalabras[i].charAt(0) + ".";
            }
        }
    }
    /**
     * Establecer el número de páginas del libro. 
     * @param numPaginas El nuevo número de páginas del libro.
     */
    public void setNumPaginas(int numPaginas){
        if (numPaginas >= 0 ) this.numPaginas = numPaginas;
    }
    // Asumo que el dato es correcto.
    public void setFechaPublicacion(int fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Devolver la representación en formato de cadena (String) del objeto libro.
     * @return Una cadena que representa el objeto libro.
     */
    public String toString(){
        return  "El libro " + this.titulo + ", de " + this.autor + 
                ", con ISBN: " + this.ISBN + ". Tiene " + this.numPaginas + 
                " páginas.";
    }
    

    public static void main(String[] args){
        // Prueba los dos constructores.
        Libro libro1 = new Libro("Las tempestálidas","Georgi Gospodinov", "841761",2020,400);
        Libro libro2 = new Libro("Como matar a tu familia","Bella Mackie","849129",2021,400);
        Libro libro3 = new Libro("Oso","Marian Engel","841597",1976,168);
 
        System.out.println("libro1 -> " + libro1);
        System.out.println("libro2 -> " + libro2);
        System.out.println("libro3 -> " + libro3);
        // Prueba setNumPaginas con un valor válido.
        libro1.setNumPaginas(400);
        System.out.println("libro1 -> " + libro1);
        // Prueba setNumPaginas con un valor inválido.
        libro1.setNumPaginas(-200);
        System.out.println("libro1 -> " + libro1);
        /*// Prueba setAutor con un nombre largo.
        libro1.setAutor("Gabriel García Marquez");
        System.out.println("libro1 -> " + libro1);*/

        nuestroSplit("la casa verde",' ');
        System.out.println(nuestroSubstring("la casa verde", 1, 20));
    }
}

/**
 * El número de páginas introducidas no puede ser menor que 0. 
 * Si al crear el objeto, se introduce un número de páginas negativa, se cambia a 0.
 * Si al cambiar el valor del número de páginas es negativa, se deja el que estaba.
 * 
 * Tanto el título como el autor no pueden tener más de 20 carácteres.
 * En caso de que tengan más, el título se trunca y en el autor se ponen las iniciales.
 * 
 * La fecha de publicación no puede ser posterior al año actual.
 * Hacer el constructor de copia.
 */