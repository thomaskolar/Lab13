/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab13;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class FontTest {
    
    
    @Test
    public void testPrint1() {
        String expected = "Calibri 5 Italic Underline ";
        Font font = new Underline(new Italic(new Calibri(5)));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(result);
        PrintStream old = System.out;
        System.setOut(printstream);
        font.print();
        System.out.flush();
        System.setOut(old);
        assertEquals(result.toString(),expected);
    }
    
    
    @Test
    public void testPrint2() {
        String expected = "Times New Roman 22 Bold Strikethrough ";
        Font font = new Strikethrough(new Bold(new TimesNewRoman(22)));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(result);
        PrintStream old = System.out;
        System.setOut(printstream);
        font.print();
        System.out.flush();
        System.setOut(old);
        assertEquals(result.toString(),expected);
    }
    
    @Test
    public void testPrint3() {
        String expected = "Calibri 10 ";
        Font font = new Calibri(10);
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(result);
        PrintStream old = System.out;
        System.setOut(printstream);
        font.print();
        System.out.flush();
        System.setOut(old);
        assertEquals(result.toString(),expected);
    }
    
    
    @Test
    public void testPrint4() {
        String expected = "Times New Roman 18 Italic ";
        Font font = new Italic(new TimesNewRoman(18));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(result);
        PrintStream old = System.out;
        System.setOut(printstream);
        font.print();
        System.out.flush();
        System.setOut(old);
        assertEquals(result.toString(),expected);
    }
    
    
    @Test
    public void testPrint5() {
        String expected = "Calibri 8 Italic Underline Bold Strikethrough ";
        Font font = new Strikethrough(new Bold(new Underline(new Italic(new Calibri(8)))));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(result);
        PrintStream old = System.out;
        System.setOut(printstream);
        font.print();
        System.out.flush();
        System.setOut(old);
        assertEquals(result.toString(),expected);
    }
    
    
    @Test
    public void testPrint6() {
        String expected = "Times New Roman 38 Underline Bold Italic ";
        Font font = new Italic(new Bold(new Underline(new TimesNewRoman(38))));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(result);
        PrintStream old = System.out;
        System.setOut(printstream);
        font.print();
        System.out.flush();
        System.setOut(old);
        assertEquals(result.toString(),expected);
    }
    
    
    @Test
    public void testPrint7() {
        String expected = "Calibri 19 Italic Underline ";
        Font font = new Underline(new Italic(new Calibri(19)));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(result);
        PrintStream old = System.out;
        System.setOut(printstream);
        font.print();
        System.out.flush();
        System.setOut(old);
        assertEquals(result.toString(),expected);
    }
}
