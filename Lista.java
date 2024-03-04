import java.util.ArrayList;

public class Lista{

    private ArrayList<Integer> listaNumeros;

    public Lista(){
        this.listaNumeros = new ArrayList<Integer>();
    }
    public ArrayList<Integer> getListaNumeros() {
        return this.listaNumeros;
    }
    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = (ArrayList<Integer>)listaNumeros.clone();
    }

    /**
     * Añade un número a la lista de números.
     * @param numero Número que se quiere añadir a la lista.
     */
    public void aniadirNumeroALista(int numero){
        this.listaNumeros.add(numero);
    }
    /**
     * Busca un número en la lista de números. -> indexOf(Object o)
     * @param numero Número que se quiere buscar.
     * @return La posición en la que se ha encontrado el número. Si no se ha encontrado devuelve -1.
     */
    public int buscarNumeroEnLista(int numero){
        int posicion = -1;
        boolean encontrado = false;
        for (int i = 0 ; i < this.listaNumeros.size() && !encontrado ; i++){
            if (this.listaNumeros.get(i) == numero){
                posicion = i;
                encontrado = true;
            } 
        }
        return posicion;
    }
    /**
     * Elimina el elemento que se encuentra en la posición dada.
     * @param posicion Número de la posición que se quiere eliminar.
     * @return Si se ha eliminado (true) o no (false).
     */
    public boolean eliminarPosicion(int posicion){
        boolean eliminado = false;
        if (posicion >= 0 && posicion < this.listaNumeros.size()){
            this.listaNumeros.remove(posicion);
            eliminado = true;
        }
        return eliminado;
    }
    /**
     * Elimina un número de la lista de números. -> remove(Object o)
     * @param numero Número que quiere eliminar.
     * @return Si se ha eliminado (true) o no (false).
     */
    public boolean eliminarNumeroDeLista(int numero){
        int posicion = this.buscarNumeroEnLista(numero);
        boolean eliminado = false;
        if (posicion != -1) {
            this.eliminarPosicion(posicion);
            eliminado = true;
        }
        return eliminado;
    }
    /**
     * Cuenta el número de elementos que tiene la lista de números. -> size()
     * @return el número de elementos que tiene la lista.
     */
    public int contarElementos(){
        int contador = 0;
        for (int numero : listaNumeros){
            contador++;
        }
        return contador;
    }
    /**
     * Suma todos los elementos que hay en la lista de números.
     * @return Suma total de todos los elementos.
     */
    public int sumarElementos(){
        int suma = 0;
        for (int numero : listaNumeros){
            suma += numero;
        }
        return suma;
    }
    /**
     * Suma todos los elementos positivos que hay en la lista de números.
     * @return  Suma total de todos los elementos positivos.
     */
    public int sumarElementosPositivos(){
        int suma = 0;
        for (int numero : listaNumeros){
            if (numero > 0) suma += numero;
        }
        return suma;
    }
    /**
     * Devuelve si la lista de números está vacía o no. -> isEmpty().
     * @return  Si está vacía (true) o llena (false).
     */
    public boolean estaVacia(){
        return listaNumeros.size() == 0; // this.contadorElementos() == 0;
    }
    /**
     * Hace la media de todos los números de lista de números.
     * @return La media aritmética de los números.
     */
    public double hacerMedia(){
        double suma = this.sumarElementos();
        double numeroElementos = this.contarElementos();
        return suma/numeroElementos;
    }
    
    /**
     * Devuelve el valor máximo de los números de la lista de números.
     * @return El valor máximo.
     */    
    public int valorMaximo(){
        int valorMaximo = this.listaNumeros.get(0); // Valor máximo inicializado al primer número de la lista.
        for(int num : this.listaNumeros){
            if (num > valorMaximo) valorMaximo = num;
        }
        return valorMaximo;
    }
    /**
     * Devuelve el valor minimo de los números de la lista de números.
     * @return El valor mínimo.
     */    
    public int valorMinimo(){
        int valorMinimo = this.listaNumeros.get(0); // Valor minimo inicializado al primer número de la lista.
        for(int num : this.listaNumeros){
            if (num < valorMinimo) valorMinimo = num;
        }
        return valorMinimo;
    }
    /**
     * Devuelve el número de veces que aparece un número en la lista.
     * @param numero Número que se va a buscar en la lista de números.
     * @return Número de veces que aparece el número en la lista.
     */
    public int contarOcurrencias(int numero){
        int numOcurrencias = 0;
        for(int num : this.listaNumeros){
            if (num == numero) numOcurrencias++;
        }
        return numOcurrencias;
    }
    /**
     * Devuelve una lista con todas las posiciones en las que aparece un número dado.
     * @param numero Número que se va a buscar en la lista de números.
     * @return Lista con todas las posiciones en las que aparece el número.
     */
    public ArrayList<Integer> buscarTodasLasOcurrencias(int numero){
        ArrayList<Integer> listaPosiciones = new ArrayList<Integer>();
        for (int i = 0 ; i < this.listaNumeros.size() ; i++){
            if (this.listaNumeros.get(i) == numero){
                listaPosiciones.add(i);
            } 
        }
        return listaPosiciones;
    }
    /**
     * Ordena la lista de menor a mayor. No la modifica directamente.
     * @return La lista ordenada.
     */
    public Lista ordenarListaMenorAMayor(){
        Lista listaCopia = new Lista();
        listaCopia.setListaNumeros(this.listaNumeros);
        Lista listaFinal = new Lista();

        int numeroMinimo;

        while(listaCopia.getListaNumeros().size() > 0){
            numeroMinimo = listaCopia.valorMinimo();
            listaCopia.eliminarNumeroDeLista(numeroMinimo);
            listaFinal.aniadirNumeroALista(numeroMinimo);
        }

        return listaFinal;
    }
    /**
     * Ordena la lista de mayor a menor. No la modifica directamente.
     * @return La lista ordenada.
     */
    public ArrayList<Integer> ordenarListaMayorAMenor(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        return lista;
    }

    private static ArrayList<Integer> darLaVuelta(ArrayList<Integer> a){
        ArrayList<Integer> volteado = new ArrayList<Integer>();
        for(int i = a.size()-1 ; i >= 0 ; i--){
            volteado.add(a.get(i));
        }
        return volteado;
    }
    /**
     * Comprueba si la lista de números introducidos dan lugar a un número capicúa.
     * @return Si el número es capicúa (true) o no (false).
     */
    public boolean esCapicua(){
        ArrayList<Integer> listaNumerosVolteada = darLaVuelta(listaNumeros);
        boolean correcta = true;
        for (int i = 0 ; i < listaNumeros.size() && correcta ; i++){
            correcta = listaNumeros.get(i) == listaNumerosVolteada.get(i);
        }

        return correcta;
    }
    /**
     * Recibe una lista estática de elementos que se deben introducir dentro del arrayList de núemros.
     * @param l Lista estática con los elementos que queremos añadir al arrayList.
     * @return arrayList relleno de los elementos pasados por parámetro.
     */
    public ArrayList<Integer> rellenarArrayList(int[] l){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        return lista;
    }
    public String toString(){
        return this.listaNumeros.toString();
    }
    public static void main(String[] args) {
        Lista miLista = new Lista();
        int miNumero = 5;

        miLista.getListaNumeros().add(5);
        miLista.getListaNumeros().add(7);
        miLista.getListaNumeros().add(8);
        miLista.getListaNumeros().add(5);
        miLista.getListaNumeros().add(6);
        miLista.getListaNumeros().add(5);
        miLista.getListaNumeros().add(3);

        System.out.print("El valor máximo de la lista es: ");
        System.out.println(miLista.valorMaximo());
        System.out.print("El valor mínimo de la lista es: ");
        System.out.println(miLista.valorMinimo());
        System.out.println("El valor " + miNumero + " aparece: " + miLista.contarOcurrencias(miNumero) + " veces.");
        System.out.print("El valor " + miNumero + " aparece en las posiciones: " );
        System.out.println(miLista.buscarTodasLasOcurrencias(miNumero));
        System.out.print("La lista ordenada queda: " );
        System.out.println(miLista.ordenarListaMenorAMayor());
        

    }
}