import java.util.Scanner;

public class Ativadade2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int temp[];
        int n = 0;
        int total = 0;



        System.out.print("Escreva um numero para o tamanho do Vetor: ");
        n = scanner.nextInt();
        temp = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Escreva numeros:");
            temp[i] = scanner.nextInt();

            
        }
        for (i = 0; i < n; i++) {
            System.out.println("Seus vetores foram: "+temp[i]);
            
        }

        while (temp[1] > temp[i]);{

            temp[i] = temp[1];
            System.out.println("O vetor de menor valor é"+temp[1]);
        }
        
        }
        
}

