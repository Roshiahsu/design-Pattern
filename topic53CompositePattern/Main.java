package org.example.designPattern.topic53CompositePattern;

public class Main {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");

        Component node1 = new Node("一");
        Component node2 = new Node("二");
        Component node3 = new Node("三");

        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite composite2 = new Composite();
        composite2.add(composite1);
        composite2.add(leaf3);

        Composite nodeComposite1 = new Composite();
        nodeComposite1.add(node1);
        nodeComposite1.add(node2);

        composite2.add(nodeComposite1);


        composite2.operation();
    }
}
