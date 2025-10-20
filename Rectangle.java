package surface;

public class Rectangle {
    // Attributs
    double longueur;
    double largeur;

    // Constructeur
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthode pour calculer la surface
    public double calculerSurface() {
        return longueur * largeur;
    }
}

