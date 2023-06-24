package Atividades;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num[];
        int i = 0;
        int num2[];
        int total = 0;
        
        System.out.print("Escolha um tamanho para o vetor..:");
        int n = scanner.nextInt();
        num = new int[n];
        num2 = new int[n];
        for (i = 0; i < num.length; i++) {
            System.out.print("Escolha os numeros do vetor..:");
            num[i] = scanner.nextInt();
        }
        for (i = n; i > 0; i--) {
            num2[i] = num[i - 1];
            System.out.println(num2);

            
            
            }
            
        }
    }
    

