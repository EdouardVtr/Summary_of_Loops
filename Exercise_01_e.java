import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int largeur = 5;
        int hauteur = 5;
        int count = 0;

        for (int colonne = 0; colonne < hauteur; ++colonne) {
            for (int ligne = 0; ligne < largeur; ++ligne) {
                if (ligne <= count) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
    }
}
