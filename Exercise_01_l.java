public class Main {
    public static void main(String[] args) {

        int hauteur = 5;
        int largeur = 10;
        int gauche = -1;
        int droite = 10;
        int nb = 0;

        for (int colonne = 0; colonne < hauteur; ++colonne) {
            for (int ligne = 0; ligne < largeur; ++ligne) {
                if (ligne <= gauche || ligne >= droite) {
                    System.out.print(" ");
                }
                else {
                    if (ligne < 5) {
                        ++nb;
                        System.out.print(nb);
                    }
                    else if (ligne == 5) {
                        System.out.print(nb);
                    }
                    else {
                        --nb;
                        System.out.print(nb);
                    }
                }
            }
            System.out.println();
            ++gauche;
            --droite;
            nb = 0;
        }
    }
}
