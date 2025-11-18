import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int largeur, hauteur;
        largeur = scan.nextInt();
        hauteur = scan.nextInt();

        int a = 0;
        int b = hauteur - 1;

        for (int colonne = 0; colonne < largeur; ++colonne) {

            for (int ligne = 0; ligne < hauteur; ++ligne) {
                if (ligne == a) {
                    System.out.print("X");
                } else if (ligne == b) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            ++a;
            --b;
            System.out.println();
        }
    }
}
