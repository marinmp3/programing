public class Persiana {
    // Se inicializan en los constructores
    private double tamano;
    private boolean estaSubida;
     
     // Cons. por defecto
    public Persiana(){
        this.tamano = 0;
        estaSubida = false;
    }

    public Persiana(double tamano){
        this.tamano = 0;
        this.setTamano(tamano);
        this.estaSubida = false;
    }
    
    public Persiana(double tamanio, boolean estaSubida){
        this.tamano = tamano;
        estaSubida = estaSubida;
    }

     public Persiana(Persiana p){
        this.tamano = p.tamano;
        estaSubida = p.estaSubida;
    }

    public double getTamano(){
        return this.tamano; //los métodos siempre usan return y no print (porque están en la clase)
    }

    public boolean getEstaSubida(){
        return this.estaSubida;
    }

    public void setTamano(double tamano){
        if (tamano>0) this.tamano = tamano;
       
    }

     // Podemos hacer privado el set, porque tenemos los metodos subir() y bajar() realizan su función
    private void setEstaSubida(boolean estaSubida){
        this.estaSubida = estaSubida;
    }

    public void subir() {
        //this.estaSubida = true (si hay alguna comprobación en el set, no la hace)
        this.setEstaSubida(true);
    }

    public void bajar() {
        this.setEstaSubida(false);
    }

    public String toString(){
        String salida = "La persiana está ";
        if(this.estaSubida) salida += "subida.";
        else salida += "bajada.";

        return salida;
    }

    public static void main(String[] args){
        Persiana persiana1 = new Persiana();
        Persiana persiana2 = new Persiana(1.33, true);
        Persiana persiana3 = new Persiana(persiana2);

        System.out.println("La persiana 1: " + persiana1);
        System.out.println("La persiana 2: " + persiana2);
        System.out.println("La persiana 3: " + persiana3);

        persiana3.bajar();
        System.out.println(persiana3);
        persiana3.subir();
        System.out.println(persiana3);


    }
}