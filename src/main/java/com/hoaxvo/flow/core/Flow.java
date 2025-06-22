package com.hoaxvo.flow.core;

public interface  Flow<T> {
     void run();
     T getContextData();
     void setContextData(T contextData);
     void setFirstStep(Step<T> firstStep);
}
