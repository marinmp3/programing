import java.util.ArrayList;

public class Chopera {
    private int numFilas;
    private int numColumnas;
    private int edadChopera;
    private ArrayList<ArrayList<Chopo>> matrizChopos;

    // 2 formas de hacer un Arraylist de 2 dimensiones:
    // 1: private ArrayList<ArrayList<Chopo>> chopera;
    // 2: private ArrayList<Chopo>[][] chopera;

    // --- CONSTRUCTORES ---

    public Chopera(){
        this.numFilas = 0;
        this.numColumnas = 0;
        this.edadChopera = 0;
        this.matrizChopos = new ArrayList<ArrayList<Chopo>>();
    }

    public Chopera(int numFilas, int numCol,int edadChopera){
        this.numFilas = 0;
        this.setNumFilas(numFilas);
        this.numColumnas = 0;
        this.setNumColumnas(numCol);
        this.edadChopera = 0;
        this.setEdadChopera(edadChopera);
        this.matrizChopos = new ArrayList<ArrayList<Chopo>>();

        Chopo chopoGenerico = new Chopo(3,30,1); // Chopo genérico que recibe directamente los valores de la clase "Chopo"
        for (int i = 0 ; i<numFilas ; i++){ //Por cada fila creo un Array
            matrizChopos.add(new ArrayList<Chopo>()); // Aquí no se declara <ArrayList<Arraylist... porque voy a crear las filas y cols de 0
            for (int j = 0 ; j<numCol ; j++){
                matrizChopos.get(i).add(chopoGenerico); // Por cada fila (i) añadimos columnas en base a las que tenga que tener la fila

            }
        }
    }

    public Chopera(Chopera c){
        this.numFilas = c.numFilas;
        this.numColumnas = c.numColumnas;
        this.edadChopera = c.edadChopera;
        this.matrizChopos = (ArrayList<ArrayList<Chopo>>)c.matrizChopos.clone();
    }

    // --- GETS ---

    public int getNumFilas(){
        return this.numFilas;
    }
    public int getNumColumnas(){
        return this.numColumnas;
    }
    public int getEdadChopera(){
        return this.edadChopera;
    }
    private ArrayList<ArrayList<Chopo>> getmatrizChopos(){
        return this.matrizChopos;
    }

    // --- SETS ---

    public void setNumFilas(int numFilas){
        if (numFilas > 0) this.numFilas = numFilas;
    }
    public void setNumColumnas(int numColumnas){
        if (numColumnas > 0) this.numColumnas = numColumnas;
    }
    public void setEdadChopera(int edadChopera){
        if (edadChopera > 0) this.edadChopera = edadChopera;
    }
    public void setMatrizChopos(ArrayList<ArrayList<Chopo>> matrizChopos){
        // Está igualando las direcciones de memoria, no copiando los datos
        // this.matrizChopos = matrizChopos;
        this.matrizChopos = (ArrayList<ArrayList<Chopo>>)matrizChopos.clone();
        this.numFilas = matrizChopos.size();
        this.numColumnas = matrizChopos.get(0).size();
        
    }

    // --- MÉTODOS ---

    public String toString(){
        String salida = "";
        for (ArrayList<Chopo> fila : matrizChopos){
            for (Chopo columna : fila){
                salida+=columna + "\t"; //tabular
            }
            salida+="\n";
        }
        return salida;
    }

    public static void main(String[] args) {
        int numFil = 10;
        int numCol = 10;
        ArrayList<ArrayList<Integer>> numeros = new ArrayList<ArrayList<Integer>>();

        // Una matriz es una lista de listas
        //Tenemos una lista 1 con 3 elementos. 

        numeros.add(new ArrayList<Integer>()); // Tenemos una lista 1
        numeros.get(0).add(1); // Con 3 elementos
        numeros.get(0).add(2);
        numeros.get(0).add(3);

        System.out.println(numeros.size()); // Devuelve el número de filas
        System.out.println(numeros.get(0).size()); // Devuelve el número de elementos dentro de la fila 0

        Chopera chopera1 = new Chopera(3, 3, 1);
        System.out.println(chopera1);
    }
}
