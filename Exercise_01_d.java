import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int largeur = 5;
        int hauteur = 5;

        for (int colonne = 0; colonne < hauteur; ++colonne) {
            if (colonne == 0 || colonne == 4) {
                for (int ligne = 0; ligne < largeur; ++ligne) {
                    if (ligne == 0 || ligne == 4) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("X");
                    }
                }
            }
            else if (colonne == 1 || colonne == 3){
                for (int ligne = 0; ligne < largeur; ++ligne) {
                    if (ligne == 1 || ligne == 3) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("X");
                    }
                }
            }
            else {
                for (int ligne = 0; ligne < largeur; ++ligne) {
                    if (ligne == 2) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("X");
                    }
                }
            }
            System.out.println();
        }
    }
}
