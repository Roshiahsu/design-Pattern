package org.example.designPattern.topic53CompositePattern;

public class Node implements Component {
    String name;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Node " + name + " is performing an operation.");
    }
}
