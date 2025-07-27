package com.hoaxvo.flow.core;

public interface Node<T> {
    String getId();
    NodeContext<T> execute(FlowContext flowContext);
    void setContextData(T contextData);
    T getContextData();
}
