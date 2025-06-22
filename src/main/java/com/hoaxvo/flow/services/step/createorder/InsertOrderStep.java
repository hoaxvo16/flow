package com.hoaxvo.flow.services.step.createorder;

import com.hoaxvo.flow.core.AbstractStep;
import com.hoaxvo.flow.core.FlowContext;

import com.hoaxvo.flow.dto.OrderData;
import com.hoaxvo.flow.dto.context.CreateOrderOrderContext;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InsertOrderStep extends AbstractStep<CreateOrderOrderContext> {

    @Override
    public void process(FlowContext<CreateOrderOrderContext> flowContext) {
        OrderData orderData = new OrderData(UUID.randomUUID().toString());
        System.out.println("Create order: " + orderData.getOrderId());
        CreateOrderOrderContext context = flowContext.getContextData();
        context.setOrderData(orderData);
        flowContext.setContextData(context);
    }
}
