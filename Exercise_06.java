import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez votre multiplicande : ");
        int multiplicande = scan.nextInt();

        System.out.print("Entrez votre multiplicateur : ");
        int multiplicateur = scan.nextInt();

        int somme = 0;

        for (int i = 0; i < multiplicateur; ++i) {
            somme += multiplicande;
        }
        System.out.println("Le produit de " + multiplicande + " * " + multiplicateur + " est : " + somme);
    }
}
