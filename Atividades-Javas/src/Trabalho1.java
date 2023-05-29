import java.util.Scanner;

public class Trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enter ="o";
        int resposta =0;
        String item ="";
        String comida;
        int n = 0;
        int p = 0;

        
        String[] cardapio = new String[n]; 

        while (resposta != 5){

            System.out.println("--------------------------------------------------");
            System.out.println("|          O que você gostaria de fazer?         |");
            System.out.println("--------------------------------------------------");
            System.out.println("|                1 - ver cardápio                |");
            System.out.println("|                2 - remover item                |");
            System.out.println("|              3 - adicionar um item             |");
            System.out.println("|           4 - Buscar item por número           |");
            System.out.println("|                    5 - sair                    |");
            System.out.println("--------------------------------------------------");
            System.out.print("Resposta..:");
            resposta = scanner.nextInt();
            System.out.println("");
            System.out.println("--------------------------------------------------");
            switch (resposta){
                case 1:
                int j = 1; 
                System.out.println("");
                System.out.println("Cardápio:");
                System.out.println("");

               for (int i = 0; i < n ; i++) {

                System.out.println(cardapio[i]);   
               }
                System.out.println();
                System.out.println("--------------------------------------------------");
                System.out.println();
                System.out.println("           Pressione <Enter> para voltar          ");
                System.out.println();
                System.out.println("--------------------------------------------------");
                System.out.println("Gostaria de repetir? Sim ou não");
                enter = scanner.next();
                break;

             case 3:
                System.out.println("");
                System.out.println(" Qual item gostaria de adicionar?");
                System.out.println("");
                System.out.print("Resposta: ");
                comida = scanner.nextLine();
                cardapio[p] = comida;
                System.out.println("Gostaria de repetir? Sim ou não");
                enter = scanner.next();
                break;

            };

            
            
            
            


            



            
        }
      
        



    }
}