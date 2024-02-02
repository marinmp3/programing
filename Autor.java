import java.util.ArrayList;
// clase autor
public class Autor{
    //A.Instancia
    private String nombre;
    private String nacionalidad;
    private int agnoNacimiento;
    private int agnoMuerte;
    private ArrayList<String> librosEscritos;

    //A.Clase
    private static int numMaximoLetras = 5;

// Constructores

    public Autor(String nombre, ArrayList<Libro> librosEscritos){
        this.nombre = nombre;
        this.nacionalidad = ""; //variables vacías porque no las voy a usar
        this.agnoNacimiento = null;
        this.agnoMuerte = null;
        /**this.librosEscritos = new ArrayList<Libro>();**/
        this.librosEscritos = librosEscritos.clone(); //lo clona en el atributo especificado (como hacer un bucle)

    }
    public Autor(String nombre, String nacionalidad, ArrayList<Libro> librosEscritos, int agnoMuerte, int agnoNacimiento){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.agnoNacimiento = agnoNacimiento;
        this.agnoMuerte = agnoMuerte;
        this.librosEscritos = (ArrayList)librosEscritos.clone();
    }
    public Autor(Autor a){
        this.nombre = a.nombre;
        this.nacionalidad = a.nacionalidad;
        this.agnoNacimiento = a.agnoNacimiento;
        this.agnoMuerte = a.agnoMuerte;
        this.librosEscritos = a.librosEscritos.clone();

    }                                                                                    //se refiere al array de libros
    public Autor(String nombre, String nacionalidad, int agnoNacimiento, int agnoMuerte, Libro libro){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.agnoNacimiento = agnoNacimiento;
        this.agnoMuerte = agnoMuerte;
        this.librosEscritos.add(libro);
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public int getAgnoNacimiento(){
        return this.agnoNacimiento;
    }
    public int getAgnoMuerte(){
        return this.agnoMuerte;
    }
    public ArrayList<Libro> getLibrosEscritos(){
        return this.librosEscritos;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
        if (nombre.length() > this.numMaximoLetras){
            this.nombre = "";
            String nombrePorPalabras = nombre.split(" "); //coge el argumento para separar el string
            for (int i = 0 ; i <nombrePorPalabras.length() ; i++){
                this.nombre += nombrePorPalabras[i].charAt(0);
            }  
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public void setAgnoNacimiento(int agnoNacimiento){
        this.agnoNacimiento = agnoNacimiento;
    }
    public void setAgnoMuerte(int agnoMuerte){
        this.agnoMuerte = agnoMuerte;
    }
    public void setLibrosEscritos(ArrayList<Libro> librosEscritos){
        this.librosEscritos = (ArrayList)librosEscritos.clone();
    }

    public String toString(){
        String salida = "El autor " + this.nacionalidad + " " + this.nombre + ", nacido en " 
        + this.agnoNacimiento;
        if (this.agnoMuerte != 0) salida += " ( " + this.agnoNacimiento + "-" + this.agnoMuerte + " ) ";
        else salida += ", nacido en: " + this.agnoNacimiento;

        salida += "ha escrito los siuientes libros: ";

        for(int = 0 ; i < librosEscritos.size() ; i++){
            salida += librosEscritos.get(i).getNombre  () + " ";
        }
        return salida;
    }

    public static void main(String[] args){

        Libro libro1 = new Libro("Las tempestalidas",123456789);
        Libro libro2 = new Libro("Juego de tronos", "R.R.Martin", 987654321,568);
        Libro libro3 = new Libro("Los Demonios", "F.Dostoyevski", 2575368);
        ArrayList<Libro> listaLibros = new ArrayList<Libro>();

        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);

    }
}