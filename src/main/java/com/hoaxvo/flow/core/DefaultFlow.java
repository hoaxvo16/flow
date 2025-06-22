package com.hoaxvo.flow.core;

public class DefaultFlow<T> extends AbstractFlow<T> {

    @Override
    public T getContextData() {
        return this.flowContext.getContextData();
    }

    @Override
    public void setContextData(T contextData) {
        this.flowContext = new FlowContext<>(contextData);
    }
}
