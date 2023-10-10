package org.example;

import org.apache.commons.lang3.StringUtils;

public class test {

    public static void main(String[] args) {

        // Überprüfen, ob ein String leer ist
        boolean isEmpty = StringUtils.isEmpty("Der String ist voll befüllt mit Zeichen");
        System.out.println("Ist der String leer? " + isEmpty);

        // Leerzeichen werden vor und nach dem Test weggeschnitten
        String trimmed = StringUtils.trim("                  Java ist auch eine Insel    ");
        System.out.println("Nach dem Trimmen: " + trimmed);

        // Der erste Buchstabe des Strings wird großgeschrieben
        String capitalized = StringUtils.capitalize("hELLO WORLD");
        System.out.println("Kapitalisiert: " + capitalized);
    }

}

