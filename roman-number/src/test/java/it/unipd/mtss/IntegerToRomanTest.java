//////////////////////////////////////////////////////////////////// 
// Alessio Zanella 2101079
// Leonardo Salviato 2101086
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    @Test
    public void testConvert() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }
  }