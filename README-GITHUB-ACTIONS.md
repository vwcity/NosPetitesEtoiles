# Compiler Nos Petites Etoiles sur GitHub Actions

1. Creer un depot GitHub nomme `NosPetitesEtoiles`.
2. Decompresser cette archive, et ajouter tous les fichiers et dossiers du repertoire `NosPetitesEtoiles` a la racine du depot, y compris le repertoire `.github` (cache sur certains systemes).
3. Si `.github/workflows/build-apk.yml` ne s'est pas transfere, le creer directement sur GitHub avec `Add file > Create new file` et le chemin `.github/workflows/build-apk.yml`.
4. Ouvrir l'onglet Actions, selectionner `Compiler l'APK Android`, puis `Run workflow`. Un push sur `main` declenche aussi le workflow.
5. Une fois l'execution reussie, ouvrir cette execution et telecharger `NosPetitesEtoiles-APK` dans la zone Artifacts. Extraire `app-debug.apk` de l'archive ZIP.

Le workflow utilise Java 17, Gradle 8.11.1, SDK Android 35 et genere un APK debug signe automatiquement pour les tests (pas un APK de publication Play Store).
