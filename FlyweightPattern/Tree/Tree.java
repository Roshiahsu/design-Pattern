package org.example.designPattern.FlyweightPattern.Tree;

import lombok.AllArgsConstructor;

/**
 * 實體享元
 */
@AllArgsConstructor
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public void draw(String canvas) {
        type.draw(canvas, x, y);
    }
}
