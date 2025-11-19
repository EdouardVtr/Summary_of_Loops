public class Main {
    public static void main(String[] args) {

        int largeur = 5;
        int hauteur = 5;

        for (int colonne = 0; colonne < hauteur; ++colonne) {
            for (int ligne =0; ligne < largeur; ++ligne) {
                if (colonne == 0 || colonne == 4) {
                    if (ligne == 0 || ligne == 4) {
                        System.out.print("X");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else if (colonne == 1 || colonne == 3) {
                    if (ligne == 2) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("X");
                    }
                }
                else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
