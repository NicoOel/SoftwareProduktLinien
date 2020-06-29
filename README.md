# SoftwareProduktLinien

## Task 1
### Wie sind Sie vorgegangen, um 5 typische Konfgurationen abzuleiten? 

Die vollen Konfiguration bieten die volle Funktionalität(jeweils für Windows oder Linux) aber sind dafür wahrscheinlich relativ groß.
Die minimale Konfiguration bildet das Gegenteil, nur die grundlegende Funktionalität.
Die lightweightversion versucht einen großen Funktionssatz mit relativ wenig Speicherplatz zu bieten.
Die Grundschulversion bildet einen speziellen Use-Case ab.

### Warum haben Sie sich für diese Domäne entschieden? 

Sie bildet ein relativ simples Beispiel, welches viele Möglichkeiten zur Erweiterung und zur Modualisierung bietet.

### Gibt es bereits eine Implementierung, die Sie nutzen möchten?

Nein, ich habe keine gefunden.

***

## Task 2
### Wie sind Sie beim Programmieren vorgegangen? 

Nach der Einarbeitung mit Hilfe des Videos wurden die Schritte im Video durchgeführt und in der Main-Methode mit einzelnen Properties und Konfigurationen experimentiert. Dannach wurden die zwei Features eingebunden

### Haben Sie die Parameter nacheinander entwickelt?

Nein, erst wurde ein Grundkonzept erstellt, auf welchem dann aufbauened die Features eingebunden wurden. Die einzelnen Parameter/Features wurden dann doch nacheinander implementiert.

### Welche Änderungen mussten Sie vornehmen?

Auf Grundlage von Aufgabe 1 wurde der Quellcode für die Hauptmethode und die Features hinzugefügt, sowie das Projekt um eine runtime.Properties-Datei erweitert.

### Welche der 5 Konfigurationen verhalten sich identisch?: 

Da zwei ähnliche Features, welche Teile des Funktionsumfanges darstellen, implementiert wurden, gleichen sich ein Großteil der Konfigurationen und verhalten sich identisch. Demgegenüber nutzt die minimale Version keine Features und die vereinfachte Version für Grundschüler nur ein Feature.

***

## Task 3
### Welche Fehler haben Sie beim Testen gefunden?: 

Allgemein wurde das Debugging erschwert, da aus dem Feature durch Auswahl einer Konfiguration erst der Source Code erstellt werden musste, dieser konnte dann debuggt werden.

### Wie haben Sie Stellen lokalisiert an denen die neuen Features eingefügt werden mussten? 
Aus der grundlegenden Struktur ergab sich relativ schnell der Punkt, wo Features eingefügt werden konnten.

### Gibt es verschachtelte Annotationen? 
Nein, dies konnte erfolgreich vermieden werden um die Lesbarkeit und Wartbarkeit zu verbessern.

### Wie viele Annotationen gibt es maximal zu einem Feature? 
Auch hier konnten komplizierte aufrufe umgangen werden, weshalb nur eine Annotation nötig war. Dadurch ist der Code jedoch etwas länger, aber auch verständlicher.




