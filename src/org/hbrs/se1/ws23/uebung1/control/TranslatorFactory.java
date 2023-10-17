package org.hbrs.se1.ws23.uebung1.control;

/**@author odrief2s
 *
 */
public class TranslatorFactory {
    /**
     * Anwendung des Factory method Pattern
     * Problem: Inkonsistente Erzeugung und Parametrisierung von Objekten
     * Lösung: Zentrale Service-Klasse zur zentralen und konsistenten Erzeugung von Objekten
     */
    public static Translator createGermanTranslator(){
        return new GermanTranslator();
    }
}
