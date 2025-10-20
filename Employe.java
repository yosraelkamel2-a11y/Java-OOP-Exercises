package employe;

public class Employe {
    // Attributs
    String nom;
    String prenom;
    int age;
    double salaire;

    // Constructeur
    public Employe(String nom, String prenom, int age, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }

    // Méthode pour afficher les infos
    public void afficher() {
        System.out.println("Nom : " + nom + " | Prénom : " + prenom +
                           " | Âge : " + age + " | Salaire : " + salaire);
    }
}
