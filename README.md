# Nos petites étoiles — mini application Android

Application de suivi des petits efforts pour deux enfants. Fonctionnement entièrement hors ligne.

## Tester immédiatement, sans Android Studio

Ouvrir `app/src/main/assets/index.html` dans un navigateur moderne. Sur téléphone Android, utiliser un gestionnaire de fichiers pour ouvrir le fichier avec Chrome. Les données restent localement dans le navigateur, sous réserve que celui-ci autorise le stockage local pour les fichiers ouverts.

## Générer un APK Android avec Android Studio

1. Ouvrir le dossier `mini_etoiles_android` dans Android Studio (File > Open).
2. Installer les composants SDK proposés, puis synchroniser Gradle (JDK 17 ou plus récent).
3. Dans le menu `Build > Build Bundle(s) / APK(s) > Build APK(s)`.
4. Récupérer le fichier `app/build/outputs/apk/debug/app-debug.apk` et l'installer sur le téléphone.

Ce projet fournit le code source Android (Java) avec une interface WebView 100 % locale. Pas de compte, réseau, permissions ou collecte de données. Le fichier HTML est également fourni à la racine du ZIP pour faciliter le test.

Note : Le fichier exécutable `gradle-wrapper.jar` n'est pas inclus. Si Android Studio demande un wrapper, cliquer sur l'option permettant d'utiliser la distribution Gradle gérée par l'IDE, ou générer un wrapper local à partir de Gradle 8.11.1 (`gradle wrapper --gradle-version 8.11.1`).

## Fonctions

- Deux profils distincts, prénom modifiable.
- Trois objectifs : tétine, rangement et coucher.
- Durée sans tétine configurable séparément pour chaque enfant.
- Tableau journalier et bilan sur 7 jours, historique des semaines.
- Récompenses débloquées à 3, 9 et 15 étoiles.
- Sauvegarde locale automatique, copier et restaurer les données.
- Les crises ne suppriment jamais les étoiles déjà obtenues. Un retrait manuel est possible uniquement pour corriger une erreur de saisie.
