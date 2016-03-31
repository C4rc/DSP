# Spezifikation - Erster Entwurf

- - -
Erstellt   : 03.03.2016  
Bearbeitet : 31.03.2016
- - -

## Must-Have:
 - Strichliste [[1](#1)]
 - Beitrag / Kosten Berechnung [[2](#2)]
 - Nutzung durch mehrere Kollegen / Benutzer [3]

## Expected:
 - Passwortschutz []

## Nice-to-Have:
 - Dauerhafter Login auf einem Gerät [4]
 - Passwortschutz abschaltbar [5]
 - Kaffeegruppen [6]
 - Unterschiedliche Währungen [7]
 - Plattformunabhängigkeit [8]

## Nicht implementiert:
 - keine Anbindung an Authentifizierungsschnittstellen (Smartcard etc.)
	wegen Datenschutz
	schwierig zu implementieren
	viele unterschiedliche Systeme
 - keine Anbindung an Kaffeemaschinen
	Fehlende Schnittstellen zu konventionellen Maschinen 
	Zu viele unterschiedliche Systeme
 - Oberfläche nicht customizable
	Implementierungsaufwand
	Wenig bis kein Zusätzlicher Nutzen, Verwirrung der Benutzer

<a name="1">
[1] Strichliste :
	Anzahl der entnommenen Kaffees wird gezählt
</a>

<a name="1">
[2] Beitrag / Kosten Berechnung :
	Berechnung der Summe anhand des Kaffeekonsums pro Nutzer
</a>

[3] Nutzung durch mehrere Kollegen / Nutzer :
	Eine Liste mit allen teilnehmenden Nutzern um den Zähler zu erhöhen 
	Es kann aus der Liste ein Name ausgewählt werden und dieser ausgewählt werden, dann wird bei demjenigen der Konsum um eins erhöht werden
	( #TODO : Teilnehmende Nutzer sind zu definieren )

[4] Dauerhafter Login auf einem Gerät:
	Man kann sich auf einem Gerät dauerhaft einloggen
	Schnelle/einfache Bedienung

[5] Passwortschutz abschaltbar :
	Passwort pro User abschaltbar
	Schnelle/einfache Bedienung

[6] User können in Gruppen verwaltet werden
	User können in Gruppen verwaltet werden

[7] Startzielgruppe ist deutsch-sprachiger Raum

[8] Die Anwendung soll von verschiedenen Plattformen, Windows/Linux/Mac Computern und Mobilen Endgeräten (Android/IOS) verwendbar sein.
    Eventuell sogar mit Apps für die Endgeräte
