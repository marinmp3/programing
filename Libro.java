public class Libro {

    private String titulo;
    private String autor;
    private final int ISBN;
    private int numPaginas;
     

    /**
     * Constructor con parámetros. 
     * Crear un libro con un título y ISBN especificados.
     * @param titulo El título del libro.
     * @param ISBN El ISBN del libro.
     */
    public Libro(String titulo, int ISBN){
        this.titulo = titulo;
        this.autor = "";
        this.ISBN = ISBN;
        this.numPaginas = 0;
    }

    /**
     * Constructor con parámetros. 
     * Crear un libro con un título, autor, ISBN y número de páginas especificados.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param ISBN El ISBN del libro.
     * @param numPaginas El número de páginas del libro.
     */
    public Libro(String titulo, String autor, int ISBN, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
        if (numPaginas < 0) numPaginas = 0; //2
    }

    /**
     * Constructor con parámetros. 
     * Crear un libro con un título, autor e ISBN.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param ISBN El ISBN del libro.
     */
    public Libro(String titulo, String autor, int ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = 0;
        if (numPaginas < 0) numPaginas = 0; //2
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
    public int getISBN(){
        return this.ISBN;
    }
    /**
     * Obtener el número de páginas actual del libro.
     * @return El número de páginas del libro.
     */
    public int getNumPaginas(){
        return this.numPaginas;
    }

    /**
     * Establecer el título del libro. 
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    /**
     * Establecer el autor del libro. 
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor){
        this.autor = autor;
    }

    /**
     * Establecer el número de páginas del libro. 
     * @param numPaginas El nuevo número de páginas del libro.
     */
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
        if (numPaginas < 0) this.numPaginas =1; //1
        if (this.numPaginas < 0) this.numPaginas = this.numPaginas; //3
    }

    /**
     * Devolver la representación en formato de cadena (String) del objeto libro.
     * @return Una cadena que representa el objeto libro.
     */
    public String toString(){
        return  "El libro " + Recortar(this.titulo) + ", de " + this.autor + 
                ", con ISBN: " + this.ISBN + ". Tiene " + this.numPaginas + 
                " páginas.";
    }
    

    public static void main(String[] args){
        Libro libro1 = new Libro("Las tempestalidas",123456789);
        Libro libro2 = new Libro("Juego de tronos", "R.R.Martin", 987654321,568);
        Libro libro3 = new Libro("Los Demonios", "F.Dostoyevski", 2575368);

        System.out.println("libro1 -> " + libro1);
        System.out.println("libro2 -> " + libro2);
        System.out.println("libro3 ->" + libro3);
    }
}


/**
 * El número de páginas introducidas no puede ser menor que 0. 
 * Si al crear el objeto, se introduce un número de páginas negativa, se cambia a 0.
 * Si al cambiar el valor del número de páginas es negativa, se deja el que estaba.
 * 
 * Tanto el título como el autor no pueden tener más de 20 carácteres.
 * En caso de que tengan más, el título se trunca y en el autor se ponen las iniciales.
 */