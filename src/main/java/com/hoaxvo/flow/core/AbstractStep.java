package com.hoaxvo.flow.core;

import lombok.Setter;

@Setter
public abstract class AbstractStep<T> implements Step<T> {
    protected Step<T> next;

    public void run(FlowContext<T> context) {
        this.process(context);
        if (this.next != null) {
            this.next.run(context);
        }
    }

    public abstract void process(FlowContext<T> context);
}
