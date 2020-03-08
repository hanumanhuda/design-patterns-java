package com.hhuda.dpj.visitor;

public interface NodeVisitor {
    void visitAssignment(Node node);
    void visitVariableRef(Node node);
}
