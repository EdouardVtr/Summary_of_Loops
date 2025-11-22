import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Combien de nombre de la suite de Fibonacci voulez-vous ? : ");
        int nb = scan.nextInt();
        if (nb == 1) {
            System.out.println("1");
        }
        else {
            int nb01 = 1;
            int nb02 = 1;
            int somme = 0;
            System.out.println(nb01);
            System.out.println(nb02);


            for (int i = 0; i < (nb - 2); ++i) {
                somme = nb01 + nb02;
                System.out.println(somme);
                nb01 = nb02;
                nb02 = somme;
            }
        }
    }
}

// Même exercice avec un do_while :
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
