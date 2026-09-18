package Gestion;

public class Vetement {

    //vetement avec nom, taille, prix unitaire, materiel,
    private String nom;
    private String taille;
    private float prix;
    private String materiel;

    public Vetement(String nom, String taille, float prix, String materiel) {
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }
}
