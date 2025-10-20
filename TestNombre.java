package parite;

import java.util.Scanner;

public class TestNombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre : ");
        String saisie = input.nextLine(); // on lit la saisie comme texte

        try {
            // Tentative de conversion en entier
            int nombre = Integer.parseInt(saisie);

            // Si la conversion réussit :
            System.out.println("Le nombre saisi est : " + nombre);

            // Vérifier si pair ou impair
            if (nombre % 2 == 0) {
                System.out.println("C’est un nombre pair.");
            } else {
                System.out.println("C’est un nombre impair.");
            }

        } catch (NumberFormatException e) {
            // Si la saisie n'est pas un entier
            System.out.println("Erreur : la saisie n’est pas un nombre entier !");
        }
    }
}

