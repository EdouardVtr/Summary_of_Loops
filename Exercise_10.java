import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quelle est la valeur recherchée ? : ");
        int val = scan.nextInt();
        int nb = 0;
        int count = 0;
        int lastPos = 0;

        while (nb != -1) {
            System.out.print("Entrez la première valeur (-1 pour finir) : ");
            nb = scan.nextInt();
            ++count;
            if (nb == val) {
                lastPos = count;
            }
        }
        if (lastPos == 0) {
            System.out.println("La valeur recherchée n'est pas apparue dans la suite de valeurs !");
        }
        else {
            System.out.println("La valeur : " + val + " est apparue pour la dernière fois en " + lastPos + " position.");
        }
    }
}
