import java.io.IOException;
import java.util.Scanner;

public class Atividade3 {
    
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        String enter;
        int num[];
        
        int i = 0;
        int j = 0;
        int fin = 0;
        int n = 0;
        int enquanto = 1;

        while (enquanto == 1){
            j = 0;
            System.out.print("Escreva um numero para o tamanho do Vetor: ");
            n = scanner.nextInt();
            num = new int[n];
                    for (i = 0; i < num.length ; i++) {
                        j = j + 1;
                        System.out.print("Escreva o numero " + j + ":");
                        num[i] = scanner.nextInt();
                    }
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Fale um numero para ver se existe no vetor");
                    System.out.println("");
                    int resposta2 = scanner.nextInt();

                    for (i=0; i < num.length; i++) {
                        if (resposta2 == num[i]){
                            System.out.println("O numero "+resposta2+" esta incluso");
                            fin = 1;
                        }
                    }
                    if (fin == 1){
                    
                    }else{
                        System.out.println("O numero "+resposta2+" não esta incluso");
                    }
                }
    }
}
