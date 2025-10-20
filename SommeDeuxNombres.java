package sommededeuxnbrs;

import java.util.Scanner; // pour lire au clavier

public class SommeDeuxNombres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // création d’un objet Scanner

        System.out.print("Entrez le premier nombre : ");
        int nombre1 = input.nextInt(); // lecture du premier nombre

        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = input.nextInt(); // lecture du deuxième nombre

        int somme = nombre1 + nombre2; // calcul de la somme

        System.out.println("La somme est : " + somme); // affichage du résultat
    }
}
