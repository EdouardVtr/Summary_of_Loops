import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max, fib1 = 1, fib2 = 1, somme = 0, rep = 1;

        System.out.print("Entrez votre nombre : ");
        max = scan.nextInt();

        if (max <= 1) {
            System.out.println("Le nombre est invalide !");
        }
        else {
            do {
                somme = fib1 + fib2;
                fib1 = fib2;
                fib2 = somme;
                if (somme < max) {
                    rep = somme;
                }
            } while (somme < max);
            System.out.println(rep);
        }
    }
}
