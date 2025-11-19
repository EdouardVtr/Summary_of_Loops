public class Main {
    public static void main(String[] args) {

        int largeur = 9;
        int hauteur = 5;
        int gauche = 4;
        int droite = 4;

        for (int colonne = 0; colonne < hauteur; ++colonne) {
            for (int ligne = 0; ligne < largeur; ++ligne) {
                if ((ligne >= gauche) && (ligne <= droite)) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            --gauche;
            ++droite;
            System.out.println();
        }
    }
}
