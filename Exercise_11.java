import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quelle est la valeur recherchée ? : ");
        int val = scan.nextInt();

        int fib01 = 1;
        int fib02 = 1;
        int somme = 0;
        int count = 2;
        boolean search = false;

        if (val == 1) {
            search = true;
            count = 1;
        }

        while (somme != val && somme <= val && !search) {
            somme = fib01 + fib02;
            ++count;
            fib01 = fib02;
            fib02 = somme;
            if (somme == val) {
                search = true;
            }
        }
        if (search == true) {
            System.out.println("La valeur " + val + " fait partie de la suite de Fibonacci.");
            System.out.println("C'est la " + count + " valeur de la suite.");
        }
        else {
            System.out.println("La valeur " + val + " ne fait pas partie de la suite de Fibonacci.");
        }
    }
}
