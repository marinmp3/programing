public class Ventanilla {

    private boolean transparencia; // Trasnparente o tintado
    private double tamanio;
    private boolean estado; // Subida o bajada

    /** Cosntructor por defecto
     */
    public Ventanilla(){
        this.transparencia = true;
        this.tamanio = 15;
        this.estado = true;
    }

    /**Constructor por parámetros */
    public Ventanilla(boolean transparencia, double tamanio){
        this.transparencia = transparencia;
        this.tamanio = tamanio;
        this.estado = true;
    }

    public Ventanilla(Ventanilla v){
        this.transparencia = v.transparencia;
        this.tamanio = v.tamanio;
        this.estado = v.estado;
    }

    public boolean getTransparencia(){
        return this.transparencia;
    }
    public double getTamanio(){
        return this.tamanio;
    }
    public boolean getEstado(){
        return this.estado;
    }

    public void setTransparencia(boolean transparencia){
        this.transparencia = transparencia;
    }
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public void subirVentanilla(){
        this.setEstado(true);
    }

    public void bajarVentanilla(){
        this.setEstado(false);
    }

    public void tintarCristales(){
        this.setTransparencia(true);
    }

    public void destintarCristales(){
        this.setTransparencia(false);
    }

    public String toString(){
        String salida = "La ventanilla es: ";
        
        if (this.transparencia) salida += "transparente.";
        else salida += "tintada,";

        salida += " es de tamaño: " + this.tamanio;

        salida += " y está: ";
        if(this.estado) salida += "subida";
        else salida += "bajada";

        return salida;
    }

    
    
    public static void main(String[] args) {
        Ventanilla v1 = new Ventanilla();
        Ventanilla v2 = new Ventanilla(false, 20.4);

        System.out.println("La ventanilla 1 -> " + v1);
        System.out.println("La ventanilla 2 -> " + v2);
    }

}