package com.hoaxvo.flow.core;

import lombok.Data;

@Data
public class FlowContext<T> {
    private T contextData;
}
