# Cheatsheet - Session 1
## Terminal
### Ordnernavigation
Aktuelles Verzeichnis anzeigen:
```console
pwd
```
Inhalt des aktuellen Verzeichnisses anzeigen:
```console
ls
```
In das Unterverzichnis *Documents* wechseln:
```console
cd Documents
```

In das übergeordnete Verzeichnis wechseln:
```console
cd ..
```

### Ordnermanipulation
Neuen Ordner erstellen:
```console
mkdir testordner
```

Ordner löschen
```console
rm -r testordner
```

Ordner umbenennen:
```console
mv testordner neuerName
```

### Datenmanipulation
Neue Datei erstellen (Windows):
```console
New-Item beispiel.txt
```

Neue Datei erstellen (macOS / Linux):
```console
touch beispiel.txt
```

Datei löschen:
```console
rm beispiel.txt
```

Datei umbenennen:
```console
mv beispiel.txt neuerName.txt
```

### Java im Terminal
Datei kompilieren:
```console
javac Code.java
```

Kompilierten Code ausführen:
```console
java Code
```
