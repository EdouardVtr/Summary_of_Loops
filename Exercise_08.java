import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quelle est la valeur à trouver ? : ");
        int val = scan.nextInt();

        int count = 0;
        boolean endSearch = false;

        while (!endSearch) {
            System.out.print("Entrez une valeur : ");
            int nb = scan.nextInt();
            ++count;
            if (nb == val) {
                endSearch = true;
            }
        }
        System.out.println("L'index de la valeur " + val + " est : " + count);
    }
}
