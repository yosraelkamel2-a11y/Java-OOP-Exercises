package surface;

public class Cercle {
    final double PI = 3.14;
	// Attribut
    private double rayon;

    // Constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Méthode pour calculer la surface
    public double calculerSurface() {
        return PI*this.rayon * rayon;
    }
}

