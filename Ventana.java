public class Ventana{
    private double tamano;
    public int transparencia;
    private boolean estaAbierta;
    private Persiana persiana;

    public Ventana(){
        this.tamano = tamano;
        this.transparencia = 100;
        this.estaAbierta = false;
        this.persiana = new Persiana();
    }

    public Ventana(double tamano, int transparencia, boolean estaAbierta){
        this.tamano = 0;
        this.setTamano(tamano);
        this.estaAbierta = estaAbierta;
        this.setEstaAbierta(estaAbierta);
        this.transparencia = 100;
        this.setTransparencia(transparencia);
        this.persiana = new Persiana(this.tamano);
    }

    public Ventana(double tamano, int transparencia, boolean estaAbierta, Persiana persiana){
        this.tamano = 0;
        this.setTamano(tamano);
        this.transparencia = transparencia;
        this.setTransparencia(transparencia);
        this.estaAbierta = estaAbierta;
        this.persiana = new Persiana(this.tamano);
        this.setPersiana(persiana);
    }

    public Ventana(Ventana v){
        this.tamano = v.tamano;;
        this.transparencia = v.transparencia;
        this.estaAbierta = v.estaAbierta;
        this.persiana = v.persiana;
    }

    public double getTamano(){
        return this.tamano;
    }

    public int getTransparencia(){
        return this.transparencia;
    }

    public boolean getEstaAbierta(){
        return this.estaAbierta;
    }

    public Persiana getPersiana(){
        return this.persiana;
    }


    public void setTamano(double tamano){
        if (tamano>0) this.tamano = tamano;
    }

    public void setTransparencia(int transparencia){
        if(transparencia >= 0 && transparencia <=100) this.transparencia = transparencia;
    }
        
    public void setEstaAbierta(boolean estaAbierta){
        this.estaAbierta = estaAbierta;
    }

    public void setPersiana(Persiana persiana){
        if (persiana.getTamano() <= this.tamano){
            // No hacer this.persiana = persiana porque copiamos solo el puntero 
            this.persiana.setTamano(persiana.tamano);
            this.persiana.setEstaSubida(persiana.getEstaSubida());
        } 
    }

    public void abrir(){
        this.setEstaAbierta(true);
    }

    public void cerrar(){
        this.setEstaAbierta(false);
    }

    public String toString(){
        String salida = "La ventana de cristal " + this.transparencia + "% transparentes está ";

        if (this.estaAbierta) salida += "abierta.";
        else salida += "cerrada. \n";

        salida += this.persiana.toString();

        return salida;
    }

    public static void main(String[] args){
        Persiana persiana1 = new Persiana();
        Ventana ventana1 = new Ventana(1.54, 40, true);
        Ventana ventana2 = new Ventana(2.33, 60, false, persiana1);
        Ventana ventana3 = new Ventana();
        Ventana ventana4 = new Ventana(ventana3);

        System.out.println("La ventana 1: " + ventana1);
        System.out.println("La ventana 2: " + ventana2);
        System.out.println("La ventana 3: " + ventana3);
        System.out.println("La ventana 4: " + ventana4);

        ventana3.cerrar();
        System.out.println("Cerramos la ventana 3: " + ventana3);
        ventana3.abrir();
        System.out.println("Abrimos la ventana 3: " + ventana3);

        ventana3.getPersiana().bajar();
    }
}