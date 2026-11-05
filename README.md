# Gestion_Bib_V2 – Gestion d'une bibliothèque (TP Qualité Logicielle)

Application Java de gestion de bibliothèque, analysée avec **CKJM** (métriques Chidamber & Kemerer).

## Structure
```
src/library/
├── model/    Lendable, Book, DigitalBook
├── service/  Library, Customer, NumberClassifier
└── app/      LibraryApp
metrics/      résultats CKJM (avant / après refactoring)
```

## Compilation et exécution
```
javac -source 1.8 -target 1.8 -d bin src\library\app\*.java src\library\model\*.java src\library\service\*.java
java -cp bin library.app.LibraryApp
```

## Métriques CKJM
Télécharger `ckjm-1.8.jar` sur https://www.spinellis.gr/sw/ckjm/ puis :
```
java -cp bin;ckjm-1.8.jar -jar ckjm-1.8.jar bin\library\app\LibraryApp.class bin\library\model\Book.class bin\library\model\DigitalBook.class bin\library\model\Lendable.class bin\library\service\Customer.class bin\library\service\Library.class bin\library\service\NumberClassifier.class > metrics.txt
```
Colonnes : `Classe WMC DIT NOC CBO RFC LCOM Ca NPM`.

## SonarQube
Copier `sonar-project.properties.example` en `sonar-project.properties` et y renseigner son propre token.
