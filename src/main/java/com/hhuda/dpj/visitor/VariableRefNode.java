package com.hhuda.dpj.visitor;

import lombok.Getter;

@Getter
public class VariableRefNode implements Node {
    private String code;

    public VariableRefNode(String code){
        this.code=code;
    }
    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visitVariableRef(this);
    }
}
