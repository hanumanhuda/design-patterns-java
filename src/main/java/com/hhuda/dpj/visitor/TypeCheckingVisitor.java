package com.hhuda.dpj.visitor;

public class TypeCheckingVisitor implements NodeVisitor {
    @Override
    public void visitAssignment(Node node) {
        System.out.println("TypeCheckingVisitor:visitAssignment");
    }

    @Override
    public void visitVariableRef(Node node) {
        System.out.println("TypeCheckingVisitor:visitVariableRef");
    }
}
