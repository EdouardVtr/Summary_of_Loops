import java.util.Scanner;

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int min, max;

    System.out.print("Entrez votre premier nombre : ");
    int nb = scan.nextInt();

    if (nb == 0) {
        System.out.println("Pas de nombre, pas de min et de max !");
    }
    else {
        min = nb;
        max = nb;
        while (nb != 0) {
            System.out.print("Entrez le nombre suivant : ");
            nb = scan.nextInt();

            if (nb < min && nb != 0) {
                min = nb;
            }
            else if (nb > max && nb != 0) {
                max = nb;
            }
        }
        System.out.println("Dans cette série le minimum est : " + min);
        System.out.println("Dans cette série le maximum est : " + max);
    }
}
