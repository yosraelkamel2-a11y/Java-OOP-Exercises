package calcul;

import java.util.Scanner;

public class CalculatriceSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double a = input.nextDouble();

        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        char operateur = input.next().charAt(0);

        System.out.print("Entrez le deuxième nombre : ");
        double b = input.nextDouble();

        double resultat;

        switch (operateur) {
            case '+':
                resultat = a + b;
                System.out.println("Résultat = " + resultat);
                break;

            case '-':
                resultat = a - b;
                System.out.println("Résultat = " + resultat);
                break;

            case '*':
                resultat = a * b;
                System.out.println("Résultat = " + resultat);
                break;

            case '/':
                if (b != 0) {
                    resultat = a / b;
                    System.out.println("Résultat = " + resultat);
                } else {
                    System.out.println("Erreur : division par zéro !");
                }
                break;

            default:
                System.out.println("Opérateur invalide !");
        }

        input.close(); // bonne pratique : fermer le scanner
    }
}
