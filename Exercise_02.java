import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Combien de nombre de la suite de Fibonacci voulez-vous ? : ");
        int nb = scan.nextInt();
        if (nb == 1) {
            System.out.println("1");
        }
        else {
            int nb01 = 1;
            int nb02 = 1;
            int somme = 0;
            System.out.println(nb01);
            System.out.println(nb02);


            for (int i = 0; i < (nb - 2); ++i) {
                somme = nb01 + nb02;
                System.out.println(somme);
                nb01 = nb02;
                nb02 = somme;
            }
        }
    }
}
