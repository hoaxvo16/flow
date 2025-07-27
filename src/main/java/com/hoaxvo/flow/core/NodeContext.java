package com.hoaxvo.flow.core;

import lombok.Data;

@Data
public class NodeContext<T> {
    private T contextData;

    public T getContextData() {
        return contextData;
    }

    void setContextData(T contextData) {
        this.contextData = contextData;
    }
}
