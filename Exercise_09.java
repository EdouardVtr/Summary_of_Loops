import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quelle est la valeur recherchée ? : ");
        int val = scan.nextInt();

        boolean endSearch = false;
        boolean endScanner = false;
        int count = 0;
        int nb = 0;

        while (!endSearch && !endScanner) {
            System.out.print("Entrez la première valeur (-1 pour finir) : ");
            nb = scan.nextInt();
            ++count;
            if (nb == val) {
                endSearch = true;
            }
            else if (nb == -1) {
                endScanner = true;
            }
        }
        if (endSearch == true) {
            System.out.println("L'index de la valeur " + val + " est : " + count);
        }
        else {
            System.out.println("La valeur " + val + " n'est pas présente dans liste.");
        }
    }
}
