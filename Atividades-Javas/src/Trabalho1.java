import java.util.Scanner;

public class Trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cardapio[];
        int i = 0;
        int resposta =0;


        while (resposta != 0){

            System.out.println("--------------------------------------------------");
            System.out.println("|          O que você gostaria de fazer?         |");
            System.out.println("--------------------------------------------------");
            System.out.println("|                1 - ver cardápio                |");
            System.out.println("|                2 - remover item                |");
            System.out.println("|              3 - adicionar um item             |");
            System.out.println("|           4 - Buscar item por número           |");
            System.out.println("|                    5 - sair                    |");
            System.out.println("--------------------------------------------------");
            resposta = scanner.nextInt();
            System.out.println("");
            System.out.println("--------------------------------------------------") 

        }
        System.out.println();
        



    }
}