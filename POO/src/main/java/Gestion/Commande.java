package Gestion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Commande {
    private LocalDate dateDeCommande;
    private String description;
    private Client client;
    private List<CommandeVetement> commandeVetements;

    public Commande(LocalDate dateDeCommande, String description, Client client) {
        this.dateDeCommande = dateDeCommande;
        this.description = description;
        this.client = client;
        this.commandeVetements = new ArrayList<>();
    }

    public void ajouterCommande( Vetement vetement, int quantite) {
        this.commandeVetements.add(new CommandeVetement(vetement, quantite));
    }

    public double getCoutTotal(){
        double total = 0.0;
        for (CommandeVetement commande : commandeVetements) {
            total += commande.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date de commande=" + dateDeCommande +
                ", description='" + description + '\'' +
                ", client=" + client +
                ", liste vetement =" +  commandeVetements+
                ", cout total=" + getCoutTotal() +
                '}';
    }
}
