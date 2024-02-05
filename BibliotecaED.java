import java.util.ArrayList;
public class BibliotecaED {
    // Variables de instancia
    private String nombre;
    private String ciudad;
    private int anio;
    private int adscritos;
    private ArrayList<Libro> listaLibros;

    // Atributos de clase
    private static double presupuestoPorPersona = 0.75;

    /**
     * Constructor con parámetros
     * Crea una bibliioteca con nombre, ciudad y año especificados
     * @param nombre El nombre de la biblioteca
     * @param ciudad El nombre de la ciudad
     * @param anio El año de inauguración
     * Su año de inauguracion se establece a 2024 con el metodo set
     */
    public BibliotecaED (String nombre, String ciudad, int anio){
        this.nombre = nombre;
        this.ciudad = ciudad;

        this.anio = 2024;
        setAnio(anio);

        this. adscritos = 0;
        this.listaLibros = new ArrayList<Libro>();
    }

    /**
     * Constructor con parámetros
     * Crea una bibliioteca con nombre, ciudad, año de inauguración, número de adscritos y una lista de libros especificados.
     * @param nombre El nombre de la biblioteca
     * @param ciudad El nombre de la ciudad
     * @param anio El año de inauguración
     * @param adscritos El número de personas adscritas a la biblioteca
     * @param listaLibros La lista de libros pertenceciente a dicha biblioteca
     * Su año de inauguracion se establece a 2024 con el metodo set
     * Clona una lista de libros
     */
    public BibliotecaED (String nombre, String ciudad, int anio, int adscritos, ArrayList<Libro> listaLibros){
        this.nombre = nombre;
        this.ciudad = ciudad;

        this.anio = 2024;
        this.setAnio(anio);

        this.adscritos = 0;
        this.setAdscritos(adscritos);

        this.listaLibros = (ArrayList)listaLibros.clone();
    }
     /**
     * Obtener el nombre actual de la biblioteca.
     * @return El nombre de la biblioteca.
     */
    public String getNombre(){
        return this.nombre;
    /**
     * Obtener la ciudad actual de la biblioteca.
     * @return La ciudad de la biblioteca.
     */
    }
    public String getCiudad(){
        return this.ciudad;
    }
    /**
     * Obtener el año de inaguración actual de la biblioteca.
     * @return El año de inauguración de la biblioteca.
     */
    public int getAnio(){
        return this.anio;
    }
    /**
     * Obtener el número de adscritos actual de la biblioteca.
     * @return El número de adscritos de la biblioteca.
     */
    public int getAdscritos(){
        return this.adscritos;
    }
    /**
     * Obtener la lista de libros actual de la biblioteca.
     * @return La lista de libros de la biblioteca.
     */
    public ArrayList<Libro> getListaLibros(){
        return this.listaLibros;
    }

    /**
     * Establecer el nombre de la biblioteca.
     * @param nombre El nuevo nombre de la biblioteca.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     /**
     * Establecer la ciudad de la biblioteca.
     * @param ciudad La nueva ciudad de la biblioteca.
     */
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
     /**
     * Establecer el año de inaguracon de la biblioteca.
     * @param anio El nuevo año de inauguración de la biblioteca.
     */
    public void setAnio(int anio){
        if (anio >= 1218 && anio <= 2024) this.anio = anio;
    }
     /**
     * Establecer el número de adscritos de la biblioteca.
     * @param adscritos El nuevo número de adscritos de la biblioteca.
     * Establece que si el número es mayor a 0, se mantiene el anterior.
     */
    public void setAdscritos(int adscritos){
        if (adscritos >= 0) this.adscritos = adscritos;
    }
     /**
     * Establecer la lista de libros de la biblioteca.
     * @param listaLibros La nueva lista de libros de la biblioteca.
     */
    public void setListaLibros(ArrayList<Libro> listaLibros){
        this.listaLibros = listaLibros;
    }

    /**Método para calcular el presupuesto
     * @return El presupuesto de la biblioteca
     */

    public double calcularPresupuesto(){
        return this.adscritos*presupuestoPorPersona;
    }
    /**
     * Devolver la representación en formato de cadena (String) del objeto biblioteca.
     * @return Una cadena que representa el objeto biblioteca.
     */
    public String toString(){
        return "La biblioteca " + this.nombre + " de " + this.ciudad + " (" + this.anio + ") tiene adscritas " + this.adscritos + " personas y cuenta con " + this.listaLibros.size() + " libros.";
    }


    public static void main (String[] args){
        Libro libro1 = new Libro("Las tempestálidas","Georgi Gospodinov", 841761,2020,400);
        Libro libro2 = new Libro("Como matar a tu familia","Bella Mackie",849129,2021,400);
        Libro libro3 = new Libro("Oso","Marian Engel",841597,1976,168);
        
        ArrayList<Libro> librosSalon = new ArrayList<Libro>();
        librosSalon.add(libro1);
        librosSalon.add(libro2);

        BibliotecaED biblio1 = new BibliotecaED("Salon","Granada",1917,32916,librosSalon);
        BibliotecaED biblio2 = new BibliotecaED("Nueva","Granada",2023);
        System.out.println(biblio1);
        System.out.println(biblio2);

        double presupuesto1 = biblio1.calcularPresupuesto();
        double presupuesto2 = biblio2.calcularPresupuesto();

        System.out.println("El presupuesto de la biblioteca1 es: " + presupuesto1 + " euros");
        System.out.println("El presupuesto de la biblioteca2 es: " + presupuesto2 + " euros");

    }
}