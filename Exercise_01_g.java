public class Main {
    public static void main(String[] args) {

        int largeur = 5;
        int hauteur = 5;
        int count = 4;

        for (int colonne = 0; colonne < hauteur; ++colonne) {
            for (int ligne = 0; ligne < largeur; ++ligne) {
                if (ligne < count) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("X");
                }
            }
            --count;
            System.out.println();
        }
    }
}
