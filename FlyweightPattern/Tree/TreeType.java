package org.example.designPattern.FlyweightPattern.Tree;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 享元類
 */
@AllArgsConstructor
public class TreeType {
    private String name;
    private String color;
    private String texture;

    public void draw(String canvas, int x, int y) {
        System.out.println("Drawing tree type: " + name + " at (" + x + ", " + y + ") on " + canvas);
    }
}
