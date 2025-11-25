import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 1;
        boolean croissant = true;

        System.out.print("Entrez la valeur " + count + " : ");
        int nb = scan.nextInt();
        int last = nb;

        while (nb != -1 && (croissant == true)) {
            ++count;
            System.out.print("Entrez la valeur " + count + " : ");
            nb = scan.nextInt();
            if (nb < last && nb != -1) {
                croissant = false;
            }
            else {
                last = nb;
            }
        }
        if (croissant) {
            System.out.println("La suite est croissante !");
        }
        else {
            System.out.println("La suite n'est pas croissante !");
        }
    }
}
