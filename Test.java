package surface;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Test du cercle ---
        System.out.print("Entrez le rayon du cercle : ");
        double rayon = input.nextDouble();
        Cercle c = new Cercle(rayon);
        System.out.println("La surface du cercle est : " + c.calculerSurface());

        // --- Test du rectangle ---
        System.out.print("\nEntrez la longueur du rectangle : ");
        double longueur = input.nextDouble();

        System.out.print("Entrez la largeur du rectangle : ");
        double largeur = input.nextDouble();

        Rectangle r = new Rectangle(longueur, largeur);
        System.out.println("La surface du rectangle est : " + r.calculerSurface());
    }
}

