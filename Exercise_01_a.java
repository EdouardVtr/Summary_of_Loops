import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int largeur, hauteur;
        largeur = scan.nextInt();
        hauteur = scan.nextInt();

        for (int colonne = 0; colonne < largeur; ++colonne) {
            for (int ligne = 0; ligne < hauteur; ++ligne) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
