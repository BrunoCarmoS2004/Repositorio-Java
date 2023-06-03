import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num[];
        int i = 0;
        int num2 = 0;
        int total = 0;

        System.out.print("Escolha um tamanho para o vetor..:");
        int n = scanner.nextInt();
        num = new int[n];

        for (i = 0; i < num.length; i++) {
            System.out.print("Escolha os numeros do vetor..:");
            num[i] = scanner.nextInt();
        }
        for (i = 0; i < num.length; i++) {
            if (num2 < num[i]){
                num2 = num[i];
                total = total + 1;
            }
        }
        if (total == n){
            System.out.println("Esta em ordem crescente");
        }else{
            System.out.println("Não esta em ordem crescente");
        }
        
    }
}
    

