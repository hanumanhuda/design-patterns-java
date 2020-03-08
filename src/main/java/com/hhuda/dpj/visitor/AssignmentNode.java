package com.hhuda.dpj.visitor;

import lombok.Getter;

@Getter
public class AssignmentNode implements Node {
    private String code;
    public AssignmentNode(String code){
        this.code=code;
    }
    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visitAssignment(this);
    }
}
