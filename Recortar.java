public class Recortar {
        public static String tamaPalabra(String palabra){
            int longitudPalabra = palabra.length();
     
            if (longitudPalabra > 20){
                String palabraRecortada = "";
                for (int i = 0 ; i < 20 ; i++){
                    palabraRecortada += palabra.charAt(i);
                }
                palabra = palabraRecortada;
        }

        Libro libro1 = new Libro("Las tempestalidas",123456789);
        Libro libro2 = new Libro("Juego de tronos", "R.R.Martin", 987654321,568);
        Libro libro3 = new Libro("Los Demonios", "F.Dostoyevski", 2575368);

        System.out.println("libro1 -> " + libro1);
        System.out.println("libro2 -> " + libro2);
        System.out.println("libro3 ->" + libro3);
    
            return palabra;
    } 
}