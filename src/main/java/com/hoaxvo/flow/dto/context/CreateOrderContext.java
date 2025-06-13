package com.hoaxvo.flow.dto.context;

import com.hoaxvo.flow.dto.CreateOrderRequest;
import com.hoaxvo.flow.dto.CreateOrderResponse;
import com.hoaxvo.flow.dto.OrderData;
import lombok.Data;

@Data
public class CreateOrderContext {
    private CreateOrderRequest createOrderRequest;
    private CreateOrderResponse createOrderResponse;
    private OrderData orderData;
    private Boolean isValidPartner;
}
