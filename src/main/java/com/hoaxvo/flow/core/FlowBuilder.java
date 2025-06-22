package com.hoaxvo.flow.core;

public class FlowBuilder<T> {
    private final Step<T> firstStep;
    private Step<T> currentStep;

    private FlowBuilder(Step<T> firstStep) {
        this.firstStep = firstStep;
        this.currentStep = firstStep;
    }

    public static <T> FlowBuilder<T> startWith(Step<T> firstStep) {
        return new FlowBuilder<>(firstStep);
    }

    public FlowBuilder<T> then(Step<T> step) {
        currentStep.setNext(step);
        currentStep = step;
        return this;
    }

    public Flow<T> build(T contextData) {
        DefaultFlow<T> flow = new DefaultFlow<>();
        FlowContext<T> flowContext = new FlowContext<>(contextData);
        flow.setFlowContext(flowContext);
        flow.setFirstStep(firstStep);
        return flow;
    }
}
