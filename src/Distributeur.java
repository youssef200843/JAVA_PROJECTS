import java.util.Scanner;

public class Distributeur {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Montant à retirer (DH) : ");
        int montant = clavier.nextInt();

        while (montant < 10 || montant > 5000 || montant % 10 != 0) {
            System.out.print("Montant invalide (multiple de 10, entre 10 et 5000). Montant : ");
            montant = clavier.nextInt();
        }

        int b200 = montant / 200;
        int reste = montant % 200;

        int b100 = reste / 100;
        reste = reste % 100;

        int b50 = reste / 50;
        reste = reste % 50;

        int b20 = reste / 20;
        reste = reste % 20;

        int p10 = reste / 10;

        int total = b200 + b100 + b50 + b20 + p10;

        System.out.println();
        System.out.println("Vous recevez " + montant + " DH :");
        if (b200 > 0) System.out.println("  " + b200 + " billet(s) de 200 DH");
        if (b100 > 0) System.out.println("  " + b100 + " billet(s) de 100 DH");
        if (b50 > 0) System.out.println("  " + b50 + " billet(s) de 50 DH");
        if (b20 > 0) System.out.println("  " + b20 + " billet(s) de 20 DH");
        if (p10 > 0) System.out.println("  " + p10 + " pièce(s) de 10 DH");
        System.out.println("Total : " + total + " billet(s) et pièce(s)");
    }
}