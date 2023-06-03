import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num[];
        int i = 0;
        int num2 = 0;
        
        int num3[];
        System.out.print("Escolha um tamanho para o vetor..:");
        int n = scanner.nextInt();
        num = new int[n];
        num3 = new int[n];
        int total = n;

        for (i = 0; i < num.length; i++) {
            System.out.print("Escolha os numeros do vetor..:");
            num[i] = scanner.nextInt();
        }
        for (i = 0; i < num.length; i++) {
            if (num2 < num[i]){
                num2 = num[i];
            }
            for (i = 0; i < num.length; i++) {
                if (num2 > num[i]){
                    while (num2 != num[i]){
                        num2 = num2 - 1;
                    }
                    total = total - 1;
                }
            }
        
            if (total == 1){
                System.out.println("Esta em ordem decrescente");
            }else{
                System.out.println("Não esta em ordem decrescente");
            }
        }
        
        
    }
}
    

