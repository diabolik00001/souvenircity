SouvenirCity - Progetto finale pronto per GitHub Actions (Debug APK)
==================================================================

Questo progetto è una versione "chiavi in mano" dell'app SouvenirCity (Kotlin + Jetpack Compose).
Contiene 20 città e una workflow GitHub Actions che costruisce automaticamente un APK di debug.

-------------------------
Contenuto del pacchetto:
- app/ (codice sorgente Kotlin e manifest)
- .github/workflows/build-apk.yml (workflow che compila l'APK)
- build.gradle, settings.gradle, gradle/wrapper (configurazioni)
- README con istruzioni (questa pagina)

-------------------------
Procedura rapida per ottenere l'APK (sintesi):
1) Crea un nuovo repository su GitHub (es. souvenircity).
2) Carica TUTTI i file contenuti in questa cartella (non la cartella esterna) nella root del repo.
   - Metodo consigliato: usare git (comandi sotto).
   - Metodo alternativo: Upload via web (drag & drop dei file nella pagina /upload/main).
3) Dopo il push, vai su GitHub -> Actions: vedrai partire la workflow "Build Android APK".
4) Attendi che la run finisca con successo, quindi clicca sulla run -> a destra troverai "Artifacts" -> app-debug-apk -> scarica.
5) Estrai lo ZIP dell'artifact e trova `app-debug.apk`. Installa sul telefono (attiva origini sconosciute).

-------------------------
Comandi Git (sostituisci <URL-REPO> con l'URL del tuo repository):
cd /percorso/alla/cartella/SouvenirCityApp
git init
git add .
git commit -m "Initial commit - SouvenirCity final"
git branch -M main
git remote add origin <URL-REPO>
git push -u origin main

Se il repo non è vuoto (ad esempio hai creato un README su GitHub), esegui:
git fetch origin
git pull origin main --allow-unrelated-histories
risolvi eventuali conflitti, poi git push -u origin main

-------------------------
Se preferisci usare la web UI di GitHub per l'upload:
1) Apri: https://github.com/<TUO-USERNAME>/<NOME-REPO>/upload/main
2) Trascina *tutti* i file e le cartelle presenti in questo pacchetto nella pagina (NON trascinare una cartella contenente tutto).
3) Commit -> Commit changes
Nota: l'upload via web può essere più lento per molti file, ma funziona.

-------------------------
Quando la workflow fallisce:
- Vai nella pagina della run -> clicca sul job -> espandi lo step fallito e copia l'errore (testo rosso).
- Incolla qui l'errore e ti aiuterò a risolverlo.

-------------------------
Installazione APK sul dispositivo Android:
- Scarica l'artifact sul telefono o trasferisci l'APK dal PC.
- Abilita l'installazione da origini sconosciute per l'app/il browser usato.
- Apri l'APK con il file manager e tocca "Installa".

-------------------------
Supporto passo-passo:
Se vuoi, ti seguo passo dopo passo. Quando hai caricato i file sul repo (o fatto il push), scrivi "fatto push" e ti guido a trovare l'Action e scaricare l'APK.
