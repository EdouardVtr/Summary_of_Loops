import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez la valeur dont vous souhaiter connaître le nombre d'apparitions : ");
        int val = scan.nextInt();

        int nb = 0, count = 0;

        while (nb != -1) {
            System.out.print("Entrez une valeur : ");
            nb = scan.nextInt();

            if (nb == val) {
                ++count;
            }
        }
        if (count == 0) {
            System.out.println("La valeur n'est jamais apparue.");
        }
        else {
            System.out.println("La valeur " + val + " est apparue " + count + " fois.");
        }
    }
}
