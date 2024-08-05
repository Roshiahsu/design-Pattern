package org.example.designPattern.FlyweightPattern.Tree;

public class Main {
    /**
     * 不同位置種樹
     *
     * @param args
     */
    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < 2; i++) {
            forest.plantTree(getRandomX(), getRandomY(), "櫻花樹", Color.RED.name(), "吉野櫻");
        }
        for (int i = 0; i < 2; i++) {
            forest.plantTree(getRandomX(), getRandomY(), "老榕樹", Color.GREEN.name(), "榕樹");
        }
        forest.draw("canvas 1");
    }

    public static enum Color {
        RED, GREEN;
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
