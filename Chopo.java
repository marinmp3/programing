public class Chopo {
    private double altura; //3, 6, 9
    private double grosor; //15,30,45
    private int edad; // 1,2,3

    public Chopo(){
        this.altura=0;
        this.grosor=0;
        this.edad=0;
    }

    public Chopo(double altura, double grosor, int edad){
        this.altura = altura;
        this.grosor = grosor;
        this.edad = edad;
    }

    public double getAltura(){
        return this.altura;
    }
    public double getGrosor(){
        return this.grosor;
    }
    public double getEdad(){
        return this.edad;
    }

    public void setAltura(double altura){
        if (altura > 0)this.altura = altura;
    }
    public void setGrosor(double grosor){
        if (grosor > 0)this.grosor = grosor;
    }
    public void setEdad(int edad){
        if (edad > 0) this.edad = edad;
    }

    public String toString(){
        return "El chopo de " + this.edad + " de edad, mide " + this.altura + " y tiene un grosor de " + this.grosor;
    }

    public static void main(String[] args){
        Chopo chopo1 = new Chopo();
        Chopo chopo2 = new Chopo(15, 30, 2);

        System.out.println("El chopo 1: " + chopo1);
        System.out.println("El chopo 2: " + chopo2);
    }
    
     
}