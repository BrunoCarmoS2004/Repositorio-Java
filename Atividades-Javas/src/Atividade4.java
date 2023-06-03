import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[];
        int num2 = 0;
        System.out.print("Escolha um tamanho para o vetor..:");
        int n = scanner.nextInt();
        num = new int[n];
       
    
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Escolha os numeros do vetor..:");
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num2 < num[i]){
                num2 = num[i];
            }
        }
        System.out.println("Seu maior numero foi "+num2);
    }
    
}
