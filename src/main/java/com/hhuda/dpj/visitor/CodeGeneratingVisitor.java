package com.hhuda.dpj.visitor;

public class CodeGeneratingVisitor implements NodeVisitor {
    @Override
    public void visitAssignment(Node node) {
        System.out.println("CodeGeneratingVisitor:visitAssignment");
    }

    @Override
    public void visitVariableRef(Node node) {
        System.out.println("CodeGeneratingVisitor:visitVariableRef");
    }
}
