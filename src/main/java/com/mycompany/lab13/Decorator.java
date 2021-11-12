
package com.mycompany.lab13;


public abstract class Decorator implements Font{
    
    protected final Font font;
    private String name;
    private int size;
    
    public Decorator(Font font) {
        this.font = font;
    }

    public Decorator(Font font, String name, int size) {
        this.font = font;
        this.name = name;
        this.size = size;
    }
    
    
}
