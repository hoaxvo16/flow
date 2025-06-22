package com.hoaxvo.flow.core;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlowContext<T> {
    private T contextData;
}
