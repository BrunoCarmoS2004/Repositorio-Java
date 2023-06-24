package Atividades;
import java.util.Scanner;

public class AtividadeM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] pessoas;
        int i = 0;
        int j = 0;
        System.out.print("Quantas pessoas você deseja adicionar na lista (A quantidade de pessoas vão ser X*X)..:");
        int num1 = scanner.nextInt();
        pessoas = new String[num1][num1];
        for (i = 0;i < pessoas.length; i++) {
            for (j = 0; j < pessoas.length; j++) {
                System.out.print("Escreva o nome da pessoa da linha "+(i+ 1)+" coluna " +(j+1)+"..:");
                pessoas[i][j] = scanner.next();
            }
        }
        for (i = 0; i < pessoas.length;i++){
            for (j=0; j < pessoas.length; j++){
                System.out.print("|"+pessoas[i][j]+"|"+" ");
            }
            System.out.print("\n");
        }
    }  
    
}
