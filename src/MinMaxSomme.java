import java.util.Scanner;

public class MinMaxSomme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valeur (0 pour arrêter) : ");
        int v = sc.nextInt();

        if (v == 0) {
            System.out.println("Aucune valeur saisie");
        } else {
            int min = v;     
            int max = v;
            int somme = 0;

            while (v != 0) {
                if (v > max) max = v;
                if (v < min) min = v;
                somme += v;

                System.out.print("Valeur (0 pour arrêter) : ");
                v = sc.nextInt();   // n9ra l'valeur li morha
            }

            System.out.println("Max = " + max + ", Min = " + min);
            System.out.println("Somme = " + somme);
        }
    }
}