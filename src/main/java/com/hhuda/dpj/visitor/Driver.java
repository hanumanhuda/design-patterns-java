package com.hhuda.dpj.visitor;

public class Driver {
    public static void main(String[] args) {
        NodeVisitor nodeVisitor=new TypeCheckingVisitor();
        Node node = new AssignmentNode("a=b");
        node.accept(nodeVisitor);
    }
}
