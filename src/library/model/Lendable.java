package library.model;

// Interface pour les objets pouvant être empruntés
public interface Lendable {
    void borrow();
    void returnItem();

    // Description affichable de l'objet (évite instanceof/cast dans les clients)
    default String getDescription() {
        return "Unknown item type";
    }
}
