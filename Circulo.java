public class Circulo {

    /* --- DOCUMENTACIÓN --- */

    //comentario con doble línea
    /* comentario con asterisco*/
    
    /** con doble *  
     * Define un círculo con su radio y color.
     * @author Marina Cañas
     * @version 1.0.
     */

    //1. definir características - atributos de la clase (son privados en lenguages
    // de programación estructurados)
    private int radio;
    private String color;

    //Métodos de la clase

    // Constructor() -> por defecto
    //Constructor por defecto
    /**
    * Crea un círculo con radio 1 y de color blanco.
    */
    public Circulo(){
        this.radio = 1;         //this. se utiliza para identificar el expreso en dicho constructor
        this.color = "Blanco";
    }

    /** // Constructor con parámetros
    * Crea un círculo con radio y color especificados. (se crea con un radio(2) y color(azul))
    * @param radio El radio del círculo 
    * @param color El color del círculo.
    */
    public Circulo(int radio, String color){
    this.setRadio(radio); //lo llamo con la función setRadio porque quiero que respete la comprobación
    this.color = color;

    }

    // Constructor de copia
    /**
     * Crea un círculo con un radio y color en base a otro círculo
     * @param c El círculo a copiar.
     */
    public Circulo(Circulo c){
        this.radio = c.radio;
        this.color = c.color;
    }

    // Get -> Consigue la info de los atributos
    /** 
     * Obtener el radio actual de círculo.
     * @return el radio del círculo
     * 
     */
    public int getRadio(){
        return this.radio;
    }

    /**
     * Obtener el color actual del círculo
     * @return el color actual del círculo
     */

    public String getColor(){
        return this.color;
    }

    // Set -> Establece la info a los atributos
    /**
     * Establece el radio del círculo.
     * En caso de que el radio sea menor que 0, lo establece a 1.
     * @param radio el nuevo radio del círculo.
     * @todo -> comprobar que el radio no puede ser negativo (cualquier proceso por hacer).
     * @code -> (sirve para escribir un trozo de código)  if (radio > 1) this.radio = radio.
     */
    public void setRadio(int radio){
        this.radio = 1; 
        if (radio > 1) this.radio = radio;  //más simplificado:
                                            // this.radio = radio;
                                            // if (radio <= 0 // >=1) this.radio = 1;
    }

    /**
     * Establece el color del círculo
     * @param color el nuevo color del círculo.
     */

    public void setColor(String color){
        this.color = color;
    }

    // Para mostrar las clases (o info de ellas) se crea la función toString
    /**
     * Devuelve la representación en formato de cadena (String) del objeto circulo.
     * @return una cadena que representa el objeto círculo en forma de texto.
     */
    /**
     * Calcular el area del circulo
     * @return area Area del circulo calculada como pi*r^2
     */
    public double calcularArea(){
        return Math.PI*this.radio*this.radio; //^2 -> Math.pow(this.radio, 2);
    }

    /**
     * Calcular el perímetro del círculo
     * @return perímetro 2*Math.PI*this.radio;
     */
    public double calcularPerimetro(){
        return 2*Math.PI*this.radio;
    }

    public String toString(){
        return "el radio es " + this.radio + " y el color " + this.color + ".";
    }

    public static void main (String[] args){ // es un main para probar la clase
        System.out.println("radio");

        
        Circulo circuloNormal = new Circulo ();  
        Circulo circuloParametros = new Circulo(2,"azul");
        Circulo circuloCopia = new Circulo(circuloParametros);

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(3,"marrón");
        Circulo circulo3 = new Circulo(7, "azul");
        Circulo circulo4 = new Circulo(10, "verde");
        Circulo circulo5 = new Circulo();
        Circulo circulo6 = new Circulo();
        Circulo circulo7 = new Circulo(circulo2);
        Circulo circulo8 = new Circulo(circulo3);
        Circulo circulo9 = new Circulo(circulo4);
        Circulo circulo10 = new Circulo(12, "gris");

        System.out.println(circuloNormal.toString());

        circuloCopia.setColor("rojo");
        circuloCopia.setRadio(5);

        System.out.println(circuloCopia);

        System.out.println("¿El circuloNormal tiene el mismo radio que el circuloCopia?: ");
        System.out.println(circuloNormal.getRadio() == circuloCopia.getRadio());       
        
        
    }
}
