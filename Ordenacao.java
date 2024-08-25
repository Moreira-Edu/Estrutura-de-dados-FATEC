import java.util.Scanner;
import java.util.Date;

public class Ordenacao {
    public static void main(String[] args) {
        int t;
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ndigite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            // System.out.println("vetor gerado: " + v);
            System.out.println("ordenando...");
            long ini = new Date().getTime();
            v.bubblesort();
            long fim = new Date().getTime();
            System.out.println("tamanho: " + t + ", " +
                    (fim - ini) + " ms");
            // System.out.println("\nvetor ordenado: " + v);
            System.out.print("\ndigite o novo tamanho do vetor, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}