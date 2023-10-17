package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void aPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(5);
        assertEquals(value, "fünf");
    }
    @Test
    void aNegativeTest1() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(0);
        assertEquals(value, "Übersetzung der Zahl nicht " + 0 + " nicht möglich.");
    }

    @Test
    void aNegativeTest2() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(15);
        assertEquals(value, "Übersetzung der Zahl nicht " + 15 + " nicht möglich.");
    }
}
