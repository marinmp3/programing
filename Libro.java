public class Libro{

    private String titulo;
    private String autor;
    private final int ISBN; //va en mayús por ser final (el valor no puede cambiar)
    private int numPaginas;


// CONSTRUCTORES LIBRO
/**
 * Constructor con parámetros
 * Crear un libro con un título y ISBN especificados
 * @param titulo El título del libro
 * @param ISBN El ISBN del libro
 */
    public Libro(String titulo, int ISBN){
        this.titulo = titulo;
        this.autor = "";
        this.ISBN = ISBN;
        this.numPaginas = 0;
    }

/**
 * Constuctor con parámetros.
 * Crear un libro con título, autor, ISBN y número de páginas especificadas
 * @param titulo
 * @param autor
 * @param ISBN
 * @param numPaginas
 */
    public Libro(String titulo, String autor, int ISBN, int numPaginas){
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = "";
        this.numPaginas = 0;
    }

    /**
     * Obtener el título actual del libro
     * @return El título del libro 
     */
    public String getTitulo(){
        return this.titulo;
    }

    /**
     * Obtener el autor actual del libro
     * @return El autor del libro
     */
    public String getAutor(){
        return this.autor;
    }

    /**
     * Obtener el ISBN actual del libro
     * @return El ISBN del libro
     */
    public int getISBN(){
        return this.ISBN;
    }

    /**
     * Obtener el número de páginas actual del libro
     * @return El número de páginas del libro
     */
    public int getNumPaginas(){
        return this.numPaginas;
    }

    /**
     * Establece eñ título del libro
     * @param titulo El nuevo título del libro
     */
    public void setTitulo(String titulo){
        return this.titulo;
    }

    /**
     * Establece el autor del libro
     * @param autor El nuevo autor del libro
     */
    public void setAutor(String autor){
        return this.autor;
    }

    /**
     * Establece el número de páginas del libro
     * @param numPaginas El nuevo número de páginas del libro
     */
    public void setNumPaginas(int numPaginas){
        return this.numPaginas;
    }

    /**
     * Devolver la representación en formato de cadena (String) del objeto libro.
     * @return Una cadena que representa el objeto libro.
     */
    public String toString(){
        return this.titulo + "| de " + this.autor + "| con ISBN " + this.ISBN + " | tiene " + this.numPaginas + " páginas.";
    }

    public static void main(String [] args){
        Libro libro1 = new Libro("Crime and Punishment",1234567);
        Libro libro2 = new Libro("Los Demonios", "F.Dostoyevski", 8901234, 780);
        Libro libro3 = new Libro("Metamorfósis", "F.Kafka", 567890, 500);

        System.out.println("El libro 1 es: " + libro1 + " | El libro 2 es: " + libro2 + " | El libro 3 es: " + libro3);
    }
}


// --- TAREA --- trabajar en la misma clase con set y get
/**
 * 1. # de páginas introducidas no puede ser menor a 0
 * 2. Si al crear el objeto se introduce un número de páginas negativo se cambia a 0
 * 3. Si al cambiar el valor del numPaginas este es negativo, se deja el que estaba
 * 4. Tanto el títlo como el autor no pueden tener más de 20 caracteres. Si tienen más, 
 * // el título se recorta y en el autor se ponen las iniciales
 */