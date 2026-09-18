package Gestion;

public class Bas extends Vetement {
    private int ToursDeTaille;


    public Bas(String nom, String taille, double prix, Materiel materiel) {
        super(nom, taille, prix, materiel);
    }

    public int getToursDeTaille() {
        return ToursDeTaille;
    }
    public void setToursDeTaille(int toursDeTaille) {
        ToursDeTaille = toursDeTaille;
    }

    @Override
    public String toString() {
        return "Bas{" + "ToursDeTaille=" + ToursDeTaille + '}';
    }
}

