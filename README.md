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

***

## Task 4
### Welche Fehler haben Sie beim Testen gefunden?

Verschachtelte Pluginaufrufe können teilweise zu nichtbeachtung von features/plugins führen.

### Wie aufwändig ist es, Plugins zu erstellen?

Im Vergleich zu den letzten Aufgaben etwas komplexer, jedoch auch sehr viel besser und klarer abgetrennt.

### Wie oft mussten Sie nachträglich das Framework oder die Interfaces anpassen? 

Die Interfaces mussten nicht angepasst werden, am Framework mussten jedoch einige Änderung vorgenommen werden.

### Wie viele Interfaces gibt es in Ihrer Implementierung? 
Drei Interfaces, welche in dem feature Modell jeweils immer zu einem abstrakten Feature bzw. einer Funktionalität gehören.

### Welche Anpassungen könnten beim Hinzufügen weiterer Plug-Ins nötig werden? 
Einige Anpassungen in der Struktur des Frameworks bezüglich der Reihenfolge und Art, wie die bestehenden Plugins eingesetzt werden. Der Code in den anderen Plugins sollte aber ohne große Änderungen weiter benutzt werden können.

***

## Task 5
### Welche Fehler haben Sie beim Testen gefunden?

Einen großen Fehler, siehe Observation.txt. Daneben wurden erst einige Fehler produziert, bis die Vererbungshierarchie mit "original()" ganz verstanden wurde, diese konnten aber gelöst werden.

### Welche Features waren einfach zu modularisieren, welche eher aufwändig und warum?

Die meisten Features waren gut zu modularisieren, auch weil die meisten von Ihnen schon in der vorherigen Aufgabe aufgebrochen wurden. Aufwändig waren die vielen Features zur Berechnung, vor allem weil diese Features alle eine Methode erweitern, so war die "Verfeinerungshierarchie" sehr unübersichtlich

### War es für die Implementierung eines Feature Moduls nötig, andere Features zu ändern? Mussten Sie viel vorausplanen oder waren alle neuen Features leicht umzusetzen?

Für die meisten Features musste eine Änderung in dem Basisfeature "BaseCalculator" durchgefürt werden. Groß Planung war jedoch nicht notwendig, viele Features konnte durch die Erweiterung der Basisklasse um globalen Variablen implementiert werden.

### Gibt es - neben der Basisimplementierung - Features, die neue Klassen einführen oder bestehende Methoden verfeinern?

Neue Klassen wurden nicht benötigt, die meisten Features verfeinern jedoch bestehende Methoden, meist wenn sie das gleiche Mutter-Feature besitzen, wie z.B. "Logging" und die zwei Unterfeature.
