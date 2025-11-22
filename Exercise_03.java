import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez votre premier nombre : ");
        int nb = scan.nextInt();
        int dern;
        if (nb == 0) {
            System.out.print("Pas de nombre, pas de dernier !");
        }
        else {
            dern = nb;
            while (nb != 0) {
                System.out.print("Entrez le suivant : ");
                nb = scan.nextInt();
                if (nb < dern && nb != 0) {
                    dern = nb;
                }
            }
            System.out.println("Le nombre le plus petit de cette série est : " + dern);
        }
    }
}
