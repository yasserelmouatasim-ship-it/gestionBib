package library.service;

/**
 * Logique extraite de Book.complexMethodExample().
 * La décision (classify) est séparée de l'affichage (printUpTo).
 */
public class NumberClassifier {

    public static String classify(int i) {
        if (i % 2 == 0) {
            return i + " is even";
        }
        if (i % 3 == 0) {
            return i + " divisible by 3";
        }
        return i + " something else";
    }

    public static void printUpTo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(classify(i));
        }
    }
}
