import java.util.ArrayList;;
public class Lista {
    ArrayList<Integer> listaNumeros;

    public Lista(){
        listaNumeros = new ArrayList<Integer>();
    }
    public ArrayList<Integer> getListaNumeros(){
        return this.listaNumeros;
    }
    public void setListaNumeros(){
        this.listaNumeros = (ArrayList<Integer>)listaNumeros.clone();
        
    }

    public void aniadirNumero(int numero){
        this.listaNumeros.add(numero);
    }
    public int buscarNumero(int numero){
        int posicion = -1;
        boolean encontrado = false;
        for (int i = 0 ; i < listaNumeros.size() && !encontrado ; i++){
            if(this.listaNumeros.get(i) == numero){
                posicion = i;
                encontrado = true;
            }
        }
        return posicion;
        
    }
    public boolean eliminarNumero(int numero){
    int posicion = this.buscarNumero(numero);
    boolean eliminado = false;
    if (posicion != -1){
        this.eliminarPosicion(posicion);
        eliminado = true;
        }
        return eliminado;
    }
    public boolean eliminarPosicion(int posicion){
        boolean eliminado = false;
        posicion = 0;
        for (int i = 0 ; i < listaNumeros.size() ; i++){
            listaNumeros.remove(posicion);
        }
        return eliminado;
    }
    public int contarElementos(){
        int contador = 0;
        for (int numero : listaNumeros){
            contador++;
        }
        return contador;
    }

    public int sumarElementos(){
        int suma = 0;
        for (int numero : listaNumeros){
            suma+=numero;
        }
        return suma;
    }
    public int sumarElementosPositivos(){
        int suma = 0;
        for (int numero : listaNumeros){
            if (numero > 0) suma+=numero;
        }
        return suma;

    }
    public boolean comprobarVacio(){
        return listaNumeros.size() == 0;
    }

    public double hacerMedia(){
        double suma = this.sumarElementos();
        double numeroElementos = this.contarElementos();
        return suma/numeroElementos;
    }

    public String toString(){
        return listaNumeros.toString();
    }
    public static void main(String[] args) {
        

        
    }




}