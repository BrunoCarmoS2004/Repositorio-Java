package Atividades;
import java.util.Scanner;

public class atividadeM1 {

    public static void main(String[] args) {
        int[][] sala = new int[3][3];
        int i = 0;
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Numero da linha " + (i + 1) + " e coluna " + (j + 1) + ":");
                sala[i][j] = scanner.nextInt();

            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

}
