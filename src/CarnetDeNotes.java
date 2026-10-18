import java.util.Locale;
import java.util.Scanner;

public class CarnetDeNotes {
    public static void main(String[] args) {
        var clavier = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nombre de notes : ");
        int n = clavier.nextInt();

        double somme = 0;
        double meilleure = 0;
        double faible = 20;

        for (int i = 1; i <= n; i++) {
            System.out.print("Note " + i + " : ");
            double note = clavier.nextDouble();

            while (note < 0 || note > 20) {
                System.out.print("Note invalide (0 à 20). Note " + i + " : ");
                note = clavier.nextDouble();
            }

            for (int j = 1; j <= (int) note; j++) {
                System.out.print("*");
            }
            System.out.println();

            somme += note;
            if (note > meilleure) meilleure = note;
            if (note < faible) faible = note;
        }

        double moyenne = somme / n;

        String mention;
        if (moyenne < 10) {
            mention = "Insuffisant";
        } else if (moyenne < 12) {
            mention = "Passable";
        } else if (moyenne < 14) {
            mention = "Assez bien";
        } else if (moyenne < 16) {
            mention = "Bien";
        } else {
            mention = "Excellent";
        }

        System.out.println();
        System.out.println("Nombre de notes : " + n);
        System.out.println("Moyenne         : " + moyenne);
        System.out.println("Meilleure note  : " + meilleure);
        System.out.println("Plus faible     : " + faible);
        System.out.println("Mention         : " + mention);
    }
}