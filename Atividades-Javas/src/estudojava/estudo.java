package estudojava;
import java.util.Scanner;
public class estudo {
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        String[][] matrix;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva a quantidade de linhas da matrix: ");
        int l = scanner.nextInt();
        System.out.print("Agora escreva a quantidade de colunas da matrix: ");
        int c = scanner.nextInt();
        matrix = new String[l][c];
        for (i = 0; i < l; i++){
            System.out.print("Escreva o que vai ser colocado na primeira linha: ");
            matrix[i][j] = scanner.nextLine();
            for (j = 0; j < c;j++){
                int num = 1;
                System.out.print("Escreva o que vai aparecer na "+num+"° coluna da linha");
                matrix[i][j] = scanner.nextLine();
                num +=1;
            }
        for (i = 0; i < l; i++){
            for (j=0;j<c;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
        }
    }
}
