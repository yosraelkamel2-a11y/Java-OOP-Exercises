package employe;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEmploye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Employe> listeEmployes = new ArrayList<>();

        String reponse;

        do {
            System.out.print("Entrez le nom de l'employé : ");
            String nom = input.nextLine();

            System.out.print("Entrez le prénom de l'employé : ");
            String prenom = input.nextLine();

            System.out.print("Entrez l'âge de l'employé : ");
            int age = input.nextInt();

            System.out.print("Entrez le salaire de l'employé : ");
            double salaire = input.nextDouble();

            input.nextLine(); // vider la ligne

            // Créer un objet Employe et l’ajouter à la liste
            Employe e = new Employe(nom, prenom, age, salaire);
            listeEmployes.add(e);

            System.out.print("Voulez-vous ajouter un autre employé ? (oui/non) : ");
            reponse = input.nextLine();

        } while (reponse.equalsIgnoreCase("oui"));

        // --- Afficher le salaire le plus grand ---
        if (!listeEmployes.isEmpty()) {
            double maxSalaire = listeEmployes.get(0).salaire;
            Employe employeMax = listeEmployes.get(0);

            for (Employe e : listeEmployes) {
                if (e.salaire > maxSalaire) {
                    maxSalaire = e.salaire;
                    employeMax = e;
                }
            }

            System.out.println("\n--- Liste des employés ---");
            for (Employe e : listeEmployes) {
                e.afficher();
            }

            System.out.println("\n➡️  L'employé avec le salaire le plus grand est :");
            employeMax.afficher();
        } else {
            System.out.println("Aucun employé saisi !");
        }

        input.close();
    }
}
