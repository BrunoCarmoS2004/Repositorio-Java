import java.util.Scanner;

public class Trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enter = "o";
        int resposta = 0;
        int n = 1;
        int[] cardapio = new int[n];
        

        while (resposta != 5) {
            
            n = n + 1;
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
            switch (resposta) {
                case 1:
                System.out.println("Cardápio");
                for (int i = 0; i < cardapio.length; i++) {
                    System.out.println(cardapio);
                }
                System.out.println("Precione qual quer coisa para voltar!");
                scanner.next();

                case 3:

                System.out.println("Digite o numero a ser adicionado: ");
                int num = scanner.nextInt();
                cardapio[i] = num;
                System.out.println("Precione qual quer coisa para voltar!");
                scanner.next();
            }

             


        }
    }
}
