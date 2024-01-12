import java.util.Scanner;
class pt.T2.1.MarinaCañas  {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int azules = 10;
        int amarillas = 10;
        int rojas = 10;
        int verdes = 10;
    //1
        System.out.println("¿Cuántas piezas tienes?: ");
        azulesIntro = sc.nextInt;
        amarillasIntro = sc.nextInt;
        rojasIntro = sc.nextInt;
        verdesIntro = sc.nextInt;
        
        if (azulesIntro > azules or amarillasIntro > amarillas or rojasIntro > rojas or verdesIntro > verdes){
            System.out.println("Tienes piezas de sobra...");

        } else if (azulesIntro < azules or amarillasIntro < amarillas or rojasIntro < rojas or verdesIntro < verdes){
            System.out.println("Te faltan piezas...");
        } else if (){

        } else {
            System.out.println("Parece que tienes todas las piezas :)");
        }
        
        
    //2
        azules = Integer.parseInt(args[0]);

        amarillas = Integer.parseInt(args[1]);

        rojas = Integer.parseInt(args[2]);

        verdes = Integer.parseInt(args[3]);

        if (args.length <4){
            System.out.println("¿Cuántas piezas tienes?: ");
            System.out.println("Azules " + args[0]);
            System.out.println("Amarillas " + args[1]);
            System.out.println("Rojas " + args[2]);
            System.out.println("Verdes " + args[3]);
        }else{
            System.out.println("¿Cuántas piezas tienes?: ");
        azulesIntro = sc.nextInt;
        amarillasIntro = sc.nextInt;
        rojasIntro = sc.nextInt;
        verdesIntro = sc.nextInt;
        
        if (azulesIntro > azules or amarillasIntro > amarillas or rojasIntro > rojas or verdesIntro > verdes){
            System.out.println("Tienes piezas de sobra...");

        } else if (azulesIntro < azules or amarillasIntro < amarillas or rojasIntro < rojas or verdesIntro < verdes){
            System.out.println("Te faltan piezas...");
        } else {
            System.out.println("Parece que tienes todas las piezas :)");
        }

    //3 No me dió tiempo a hacerlo
        }  
        


    }

}