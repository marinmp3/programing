import java.util.ArrayList;
public class Cocodrilo {

   private int numDientes;
   private int peso;
   private double longitud;

   /**
    * Constuctor por defecto
    * Crea un cocodrilo con 77 dientes, 1200kg, y de 6,5 metros.
    *  */ 
   public Cocodrilo(){
      this.numDientes = 77;
      this.peso = 1200;
      this.longitud = 6.5;
   }
   /**Constructor con parámetros
    * Crea un cocodrilo con dientes, peso y long especificados
    * @param numDientes El número de dientes
    * @param peso El peso
    * @param longitud La longitud
    */
   public Cocodrilo(int numDientes, int peso, double longitud){
      this.numDientes = numDientes;
      this.peso = peso;
      this.longitud = longitud;
   }
   /**
    * Constructor de copia
    * Crea un cocodrilo en base a otro
    * @param c El cocodrilo a copiar
    */
   public Cocodrilo(Cocodrilo c){
      this.numDientes = c.numDientes;
      this.peso = c.peso;
      this.longitud = c.longitud;
   }
   
    /** 
     * Obtener el numDientes actual del cocodrilo.
     * @return el numDientes del cocodrilo
     * 
     */
   public int getNumDientes(){
      return this.numDientes;
   }
   /** 
     * Obtener el peso actual del cocodrilo.
     * @return el peso del cocodrilo
     * 
     */
   public int getPeso(){
      return this.peso;
   }
   /** 
     * Obtener la longitud actual del cocodrilo.
     * @return la longitud del cocodrilo
     * 
     */
   public double getLongitud(){
      return this.longitud;
   }
   /**
    * Establece el numDientes del cocodrilo
    * @param numDientes El nuevo numDientes del cocodrilo
    */
   public void setNumDientes(int numDientes){
      this.numDientes = numDientes;
   }
   /**
    * Establece el peso del cocodrilo
    * @param peso El nuevo peso del cocodrilo
    */
   public void setPeso(int peso){
      this.peso = peso;
   }
   /**
    * Establece la longitud del cocodrilo
    * @param longitud La nueva longitud del cocodrilo
    */
   public void setLongitud(double longitud){
      this.longitud = longitud;
   }
   /**
    * toString -> devuelve la representación en formato de cadena
    * @return Una cadena que representa el objeto cocodrilo
    */
   public String toString(){
      return "El cocodrilo tiene " + this.numDientes + " dientes " + " | pesa " + this.peso + " | mide " + this.longitud;
   }

   public static void main(String[] args){
      Cocodrilo cocodrilo1 = new Cocodrilo();
      Cocodrilo cocodrilo2 = new Cocodrilo(89, 1500, 8.2);
      Cocodrilo cocodrilo3 = new Cocodrilo(cocodrilo1);

      System.out.println("Cocodrilo 1: " + cocodrilo1);
      System.out.println("Cocodrilo 2: " + cocodrilo2);
      System.out.println("Cocodrilo 3: " + cocodrilo3);

   }
}