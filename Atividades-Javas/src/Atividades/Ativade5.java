package Atividades;
import java.util.Scanner;

public class Ativade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num[];
        int i = 0;
        int num2 = 0;
        System.out.print("Escolha um tamanho para o vetor..:");
        int n = scanner.nextInt();
        num = new int[n];

        for (i = 0; i < num.length; i++) {
            System.out.print("Escolha os numeros do vetor..:");
            num[i] = scanner.nextInt();
        }

        for (i = 0; i < num.length; i++) {
            num2 = num2 + num[i];
        }
        float num3 = num2 / n;
        System.out.println(num3);
    }

}
