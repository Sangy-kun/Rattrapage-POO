package Gestion;

public class Vetement {

    //vetement avec nom, taille, prix unitaire, materiel,
    private String nom;
    private String taille;
    private double prix;
    private Materiel materiel;

    public Vetement(String nom, String taille, double prix, Materiel materiel) {
        this.nom = nom;
        this.taille = taille;
        this.prix = prix;
        this.materiel = materiel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }
}
