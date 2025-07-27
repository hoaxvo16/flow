package com.hoaxvo.flow.dto.context;

import lombok.Data;

@Data
public class ValidateOrderResult {
    private boolean valid;
    private String message;
}
