package Gestion;

public class CommandeVetement {
    private Vetement vetement;
    private int quantite;

    public CommandeVetement(Vetement garment, int quantite) {
        if (quantite <= 0) {
            throw new IllegalArgumentException("Quantité doit être positif");
        }
        this.vetement = garment;
        this.quantite = quantite;
    }

    public Vetement getGarment() {
        return vetement;
    }

    public void setGarment(Vetement vetement) {
        this.vetement = vetement;
    }

    public int getQuantity() {
        return quantite;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }
        this.quantite = quantity;
    }

    public double getSubtotal() {
        return vetement.getPrix() * quantite;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "garment=" + vetement +
                ", quantity=" + quantite +
                '}';
    }
}
