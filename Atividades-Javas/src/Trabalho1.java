import java.util.Scanner;

public class Trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resposta = 0;
        int n = 0;
        int lista[];
        int i = 0;
        String enter = "";
        int j = 0;
        int resposta3;

        System.out.print("Escreva um numero para o tamanho do Vetor: ");
        n = scanner.nextInt();
        lista = new int[n];
        while (resposta != 6) {

            System.out.println("--------------------------------------------------");
            System.out.println("|          O que você gostaria de fazer?         |");
            System.out.println("--------------------------------------------------");
            System.out.println("|                1 - ver cardápio                |");
            System.out.println("|                2 - remover item                |");
            System.out.println("|              3 - adicionar um item             |");
            System.out.println("|           4 - Buscar item por número           |");
            System.out.println("|          5 - Aumentar o tamanho máx da Lista   |");
            System.out.println("|                    6 - sair                    |");
            System.out.println("--------------------------------------------------");
            System.out.print("Resposta..:");
            resposta = scanner.nextInt();
            System.out.println("");
            System.out.println("--------------------------------------------------");
            switch (resposta) {

                case 1:
                    j = 0;
                    for (i = 0; i < n; i++) {
                        j = j + 1;
                        System.out.println("Vetor "+j + " - " + lista[i]);
                    }
                    System.out.println("Precione qual quer tecla para continuar");
                    enter = scanner.next();
                    break;

                case 2:
                    j = 0;
                    for (i = 0; i < n; i++) {
                        j = j + 1;
                        System.out.println("Vetor "+j + " - " + lista[i]);
                    }
                    System.out.println("Escolha um dos itens para remover, escreva o numero cadastrado do item...");
                    System.out.println("");
                    System.out.print("Resposta..:");
                    int retirar = scanner.nextInt();
                    int remover = -1;
                    for (i = 0; i < n; i++) {
                        if (lista[i] == retirar) {
                            remover = i;
                            break;
                        }
                    }
                    if (remover != -1) {
                        for (i = remover; i < n - 1; i++) {
                            lista[i] = lista[i + 1];
                        }
                        n--;
                        System.out.println("Item removido");
                    } else {
                        System.out.println("Item não encontrado");
                    }
                    break;

                case 3:
                    j = 0;
                    for (i = 0; i < n; i++) {
                        j = j + 1;
                        System.out.print("Escreva o numero " + j + ":");
                        lista[i] = scanner.nextInt();
                    }
                    System.out.println("Precione qual quer tecla para continuar");
                    enter = scanner.next();
                    break;

                case 4:
                    System.out.println("Qual vetor você gostaria de ver?");
                    for (i = 0; i < n; i++) {
                        System.out.println("Vetor " + (i + 1));
                    }
                    System.out.print("Resposta..:");
                    int resposta2 = scanner.nextInt();
                    resposta2 = resposta2 - 1;
                    System.out.println("");
                    System.out.println("O numero correspondente a esse vetor e " + lista[resposta2]);
                    break;

                case 5:
                    System.out.println("ATENÇÃO!! ISSO REMOVERA OS ITENS JA INSERIDOS NO VETOR!!VOCÊ TEM CERTEZA QUE DESEJA CONTINUAR? (SIM = 1 ou NAO = 2)..:");
                    resposta3 = scanner.nextInt();
                    if (resposta3 == 1){
                        System.out.print("Escreva um numero para o tamanho do Vetor: ");
                        n = scanner.nextInt();
                        lista = new int[n];
                        System.out.println("");
                        System.out.println("O novo tamanho agora e "+n+" ,Todos os itens anteriores foram excluidos...");
                        System.out.println("");
                        break;
                    }
                    else if(resposta3 == 2){
                        System.out.println("Precione qual quer tecla para continuar");
                        enter = scanner.next();
                        break;
                    }
                    

                    
            }

        }
    }
}
