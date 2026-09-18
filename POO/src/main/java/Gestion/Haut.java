package Gestion;

public class Haut extends Vetement {
    private TypeManche typeManche;

    public Haut(String nom, String taille, double prix, Materiel materiel) {
        super(nom, taille, prix, materiel);
    }

    public TypeManche getTypeManche() {
        return typeManche;
    }
    public void setTypeManche(TypeManche typeManche) {
        this.typeManche = typeManche;
    }

    @Override
    public String toString() {
        return "Haut{" + "typeManche=" + typeManche + '}';
    }
}
