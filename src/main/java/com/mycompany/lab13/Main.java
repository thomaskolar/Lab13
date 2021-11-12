/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab13;

/**
 *
 * @author yanke
 */
public class Main {
    public static void main(String[] args) {
        Font font = new Italic(new Underline(new Strikethrough(new Calibri(10))));
        font.print();
    }
}
