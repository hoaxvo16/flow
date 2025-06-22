package com.hoaxvo.flow.core;

import lombok.Data;

@Data
public abstract class AbstractFlow<T> implements Flow<T> {
    protected Step<T> firstStep;
    protected FlowContext<T> flowContext;

    public void run() {
        if (firstStep != null) {
             firstStep.run(flowContext);
        }
    }
}
