import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int largeur, hauteur;
        largeur = scan.nextInt();
        hauteur = scan.nextInt();

        for (int colonne = 0; colonne < largeur; ++colonne) {

            if (colonne > 0 && colonne < (largeur - 1)) {
                for (int ligne = 0; ligne < hauteur; ++ligne) {
                    if (ligne > 0 && ligne < (hauteur - 1)) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("X");
                    }
                }
            }
            else {
                for (int ligne = 0; ligne < hauteur; ++ligne) {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
