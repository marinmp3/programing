import java.util.Scanner;
class pt_T2_1_MarinaCañas  {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int azules = 10;
        int azulesIntro;
        int amarillas = 10;
        int amarillasIntro;
        int rojas = 10;
        int rojasIntro;
        int verdes = 10;
        int verdesIntro;
    //1
        System.out.println("¿Cuántas piezas tienes?" +
                         );
        azulesIntro = sc.nextInt;
        amarillasIntro = sc.nextInt;
        rojasIntro = sc.nextInt;
        verdesIntro = sc.nextInt;
        
        if (azulesIntro > azules || amarillasIntro > amarillas || rojasIntro > rojas || verdesIntro > verdes){
            System.out.println("Tienes piezas de sobra...");

        } else if (azulesIntro < azules || amarillasIntro < amarillas || rojasIntro < rojas || verdesIntro < verdes){
            System.out.println("Te faltan piezas...");

        } else {
            System.out.println("Parece que tienes todas las piezas :)");
        }
        
        
    //2
        // azules = Integer.parseInt(args[0]);

        // amarillas = Integer.parseInt(args[1]);

        // rojas = Integer.parseInt(args[2]);

        // verdes = Integer.parseInt(args[3]);

        if (args.length != 4){ 
             System.out.println("¿Cuántas piezas tienes?: ");
            azulesIntro = sc.nextInt;
            amarillasIntro = sc.nextInt;
            rojasIntro = sc.nextInt;
            verdesIntro = sc.nextInt;
            
        }else{
            
            System.out.println("¿Cuántas piezas tienes?: ");  
            azulesIntro = Integer.parseInt ("Azules " + args[0]);
            amarillasIntro = Integer.parseInt ("Amarillas " + args[1]);
            rojasIntro = Integer.parseInt ("Rojas " + args[2]);
            verdesIntro = Integer.parseInt("Verdes " + args[3]);
            
        
        if (azulesIntro > azules or amarillasIntro > amarillas or rojasIntro > rojas or verdesIntro > verdes){
            System.out.println("Tienes piezas de sobra...");

        } else if (azulesIntro < azules or amarillasIntro < amarillas or rojasIntro < rojas or verdesIntro < verdes){
            System.out.println("Te faltan piezas...");
        } else {
            System.out.println("Parece que tienes todas las piezas :)");
        } 
        }  
        
        //3
        if (azulesIntro < azules){
            System.out.println("Te faltan piezas azules...");

        }else if (azulesIntro > azules){
            System.out.println("Te sobran azules");
        }
        if (amarillasIntro < amarillas){
            System.out.println("Te faltan piezas amarillas...");

        }else if (amarillasIntro > amarillas){
            System.out.println("Te sobran amarillas");
        }
        if (rojasIntro < rojas){
            System.out.println("Te faltan piezas rojas...");

        }else if (rojasIntro > rojas){
            System.out.println("Te sobran rojas");
        }
        if (verdesIntro > verdes){
            System.out.println("Te faltan piezas verdes...");

        }else if (verdesIntro > verdes){
            System.out.println("Te sobran verdes");
        }

    }

}