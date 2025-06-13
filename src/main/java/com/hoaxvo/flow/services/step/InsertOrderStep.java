package com.hoaxvo.flow.services.step;

import com.hoaxvo.flow.core.AbstractStep;
import com.hoaxvo.flow.core.FlowContext;

import com.hoaxvo.flow.dto.OrderData;
import com.hoaxvo.flow.dto.context.CreateOrderContext;
import org.springframework.stereotype.Service;

@Service
public class InsertOrderStep extends AbstractStep<CreateOrderContext> {

    @Override
    public void process(FlowContext<CreateOrderContext> flowContext) {
        OrderData orderData = new OrderData("12344");
        System.out.println("Create order: " + orderData.getOrderId());
        CreateOrderContext context = flowContext.getContextData();
        context.setOrderData(orderData);
        flowContext.setContextData(context);
    }
}
