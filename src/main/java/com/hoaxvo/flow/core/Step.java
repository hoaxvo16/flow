package com.hoaxvo.flow.core;

public interface Step<T> {
    void setNext(Step<T> next);
    void run(FlowContext<T> flowContext);
}
