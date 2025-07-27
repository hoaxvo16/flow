package com.hoaxvo.flow.dto.context;

import lombok.Data;

import java.util.Date;

@Data
public class CreateOrderRequest {
    private String orderNo;
    private String userCode;
    private Date orderDate;
    private Double orderAmount;
}
