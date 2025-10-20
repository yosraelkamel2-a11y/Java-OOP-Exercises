package bissextile;

import java.util.Scanner;

public class AnneeBissextile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez une année : ");
        int annee = input.nextInt();

        // Vérification si l'année est bissextile
        boolean bissextile;

        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            bissextile = true;
        } else {
            bissextile = false;
        }

        // Affichage du résultat
        if (bissextile) {
            System.out.println(annee + " est une année bissextile.");
        } else {
            System.out.println(annee + " n’est pas une année bissextile.");
        }
    }
}

