package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Library {
    private final List<Lendable> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    // Comportement conservé (bug volontaire du TP SonarQube) :
    // ne tient pas compte de l'état borrowed.
    public List<Lendable> getAvailableItems() {
        return new ArrayList<>(items);
    }

    // Library renvoie des données, c'est LibraryApp qui les affiche.
    public List<String> describeAllItems() {
        List<String> lines = new ArrayList<>();
        for (Lendable item : items) {
            lines.add(item.getDescription());
        }
        return lines;
    }
}
