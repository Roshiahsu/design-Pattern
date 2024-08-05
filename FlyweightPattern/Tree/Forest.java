package org.example.designPattern.FlyweightPattern.Tree;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();
    public void plantTree(int x, int y, String name, String color, String texture) {
        //透過factory獲取樹的享元類
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        //tree類2次加工，設定外部狀態
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw(String canvas) {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
    }
}
