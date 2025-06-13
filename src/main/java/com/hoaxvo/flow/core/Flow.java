package com.hoaxvo.flow.core;

public interface  Flow<I,T> {
     void run(I input);
     T getContextData();
     void setContextData(T contextData);
     void setFirstStep(Step<T> firstStep);
}
