# Spezifikation - Erster Entwurf

- - -
Erstellt   : 03.03.2016  
Bearbeitet : 31.03.2016
- - -
<a name="oben"></a>
## Must-Have:
 - Strichliste [[1](#1)]
 - Beitrag / Kosten Berechnung [[2](#2)]
 - Nutzung durch mehrere Kollegen / Benutzer [[3](#3)]

## Expected:
 - Passwortschutz [[4](#4)]

## Nice-to-Have:
 - Dauerhafter Login auf einem Gerät [[5](#5)]
 - Passwortschutz abschaltbar [[6](#6)]
 - Kaffeegruppen [[7](#7)]
 - Unterschiedliche Währungen [[8](#8)]
 - Plattformunabhängigkeit [[9](#9)]

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

<a name="2">
[2] Beitrag / Kosten Berechnung :
	Berechnung der Summe anhand des Kaffeekonsums pro Nutzer
</a>

<a name="3">
[3] Nutzung durch mehrere Kollegen / Nutzer :
	Eine Liste mit allen teilnehmenden Nutzern um den Zähler zu erhöhen 
	Es kann aus der Liste ein Name ausgewählt werden und dieser ausgewählt werden, dann wird bei demjenigen der Konsum um eins erhöht werden
	( #TODO : Teilnehmende Nutzer sind zu definieren )
	
</a>
<a name="4">
[4] Passwortschutz:

</a>
<a name="5">
[5] Dauerhafter Login auf einem Gerät:
	Man kann sich auf einem Gerät dauerhaft einloggen
	Schnelle/einfache Bedienung

</a>
<a name="6">
[6] Passwortschutz abschaltbar :
	Passwort pro User abschaltbar
	Schnelle/einfache Bedienung

</a>
<a name="7">
[7] User können in Gruppen verwaltet werden
	User können in Gruppen verwaltet werden

</a>
<a name="8">
[8] Startzielgruppe ist deutsch-sprachiger Raum

</a>
<a name="9">
[9] Die Anwendung soll von verschiedenen Plattformen, Windows/Linux/Mac Computern und Mobilen Endgeräten (Android/IOS) verwendbar sein.
    Eventuell sogar mit Apps für die Endgeräte
</a>
[Nach oben](#oben)
