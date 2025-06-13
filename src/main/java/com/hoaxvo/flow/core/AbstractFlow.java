package com.hoaxvo.flow.core;

import lombok.Data;

@Data
public abstract class AbstractFlow<I,  T> implements Flow<I, T> {
    protected Step<T> firstStep;
    protected FlowContext<T> flowContext;

    public void run(I input) {
        if (firstStep != null) {
             firstStep.run(flowContext);  // Unsafe cast, but expected in controlled chain
        }
    }
}
