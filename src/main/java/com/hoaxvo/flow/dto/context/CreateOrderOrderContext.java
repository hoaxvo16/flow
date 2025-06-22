package com.hoaxvo.flow.dto.context;

import com.hoaxvo.flow.dto.CreateOrderRequest;
import com.hoaxvo.flow.dto.CreateOrderResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CreateOrderOrderContext extends CommonOrderContext {
    private CreateOrderRequest createOrderRequest;
    private CreateOrderResponse createOrderResponse;
    private String customerAddress;
    private Boolean isValidPartner;
    private String companyId;
}
