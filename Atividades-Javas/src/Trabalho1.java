import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int resposta = 0;
        int n = 0;
        int lista[];
        int i = 0;
        String enter = "";

        System.out.print("Escreva um numero para o tamanho do Vetor: ");
        n = scanner.nextInt();
        lista = new int[n];
        while (resposta != 5) {
            
            
            
            System.out.println("--------------------------------------------------");
            System.out.println("|          O que você gostaria de fazer?         |");
            System.out.println("--------------------------------------------------");
            System.out.println("|                1 - ver cardápio                |");
            System.out.println("|                2 - remover item                |");
            System.out.println("|              3 - adicionar um item             |");
            System.out.println("|           4 - Buscar item por número           |");
            System.out.println("|          4 - Aumentar o tamanho máx da Lista   |");
            System.out.println("|                    5 - sair                    |");
            System.out.println("--------------------------------------------------");
            System.out.print("Resposta..:");
            resposta = scanner.nextInt();
            System.out.println("");
            System.out.println("--------------------------------------------------");
            
                if (resposta == 1){
                        System.out.println(lista[i]);
                
            }
                else if (resposta == 3){
                    System.out.print("Escreva o numero "+i+" da lista: ");
                    lista[i] = scanner.nextInt();
                }
                
            
            
            System.out.println("Precione qual quer tecla para continuar");
            enter = scanner.next();

        }
    }
}
