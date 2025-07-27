package com.hoaxvo.flow.core;

public abstract class AbstractNode<T> implements Node<T> {
    protected NodeContext<T> nodeContext = new NodeContext<>();
    protected String id;

    @Override
    public abstract String getId();

    @Override
    public abstract NodeContext<T> execute(FlowContext flowContext);

    @Override
    public void setContextData(T contextData) {
        this.nodeContext.setContextData(contextData);
    }

    @Override
    public T getContextData() {
        return nodeContext.getContextData();
    }
}
