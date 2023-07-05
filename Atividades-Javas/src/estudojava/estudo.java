package estudojava;
import java.util.Scanner;
public class estudo {
    public static void tudo(int l, int c){
        Scanner scanner = new Scanner(System.in);
        String[][] matrix;
        matrix = new String[l][c];
        int i = 0;
        int j = 0;
        int num = 0;
        int num2 = 1;
        for (i = 0; i < l; i++){
            num +=1;
            for (j = 0; j < c;j++){
                System.out.print("Escreva o que vai aparecer na linha "+num+" coluna "+num2+": ");
                matrix[i][j] = scanner.next();
                num2 +=1;
            }
            num2 = 1;
        }
        for (i = 0; i < l; i++){
            for (j=0; j < c; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        int l =0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva a quantidade de linhas da matrix: ");
        l = scanner.nextInt();
        System.out.print("Agora escreva a quantidade de colunas da matrix: ");
        c = scanner.nextInt();
        tudo(l, c);
    }
    
}
