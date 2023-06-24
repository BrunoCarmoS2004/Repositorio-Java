package estudojava;
import java.util.Scanner;
public class Atividade10{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        int j = 0;
        int i = 0;
        int escol1 = 0;

        System.out.println();
        System.out.println("Olá seja bem vindo(a) a Computadores C-137");
        System.out.println();
        System.out.println("Como gostaria de ser chamado(a)?");
        System.out.print("Resposta: ");
        String nome = scanner.next();
        System.out.println();
        System.out.println();
        System.out.println("Ok...");
        System.out.println();
        System.out.println(nome+" Esta é sua lista de comprar totalmente ONLINE!!");
        System.out.println();
        System.out.println("Aqui você podera adicionar, ver os produtos já colocados, ver o valor final e MUITO MAIS!!");
        System.out.println();

        while (escol1 !=5){
            String[][] itens;
            int t_itens = 0;
            System.out.println(""
            + "1 - Adicionar Item\n"
            + "2 - Ver Coisas dos itens\n"
            + "3 - Ver Lista\n"
            + "4 - Renover item"
            + "5 - Editar Coisas do item\n"
            + "6 -  Sair");
    
            System.out.println("Escolha uma das opções");
            System.out.println("Resposta: ");
    
            escol1 = scanner.nextInt();
            switch (escol1) {
                case 1:
                    t_itens = t_itens + 1;
                    itens = new String[t_itens][3];
                    for (i = 0; i < itens.length; i++) {
                        System.out.print("Insira o nome do item: ");
                        itens[i][j] = scanner.nextLine();
                        for (j = 0; j < itens.length; j++) {
                            System.out.print("Insira a quantidade: ");
                            Integer.parseInt(itens[i][j]);
                            int quant = scanner.nextInt();
                        }
                    }
                    break;
                case 3:
                    itens = new String[t_itens][3];
                    for (i=0; i< itens.length; i++){
                        for (j=0; j< itens.length; j++){
                            System.out.println(itens[i][j]);
                        }
                        System.out.print("\n");
                    }
                        
    
            }
        }
        
    }
}


