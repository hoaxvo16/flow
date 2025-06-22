package com.hoaxvo.flow.services.step.createorder;

import com.hoaxvo.flow.core.AbstractStep;
import com.hoaxvo.flow.core.FlowContext;
import com.hoaxvo.flow.dto.context.CreateOrderOrderContext;

public class GetUserAddressStep extends AbstractStep<CreateOrderOrderContext> {
    @Override
    public void process(FlowContext<CreateOrderOrderContext> context) {
        System.out.println("Get customer address");
        CreateOrderOrderContext createOrderOrderContext = context.getContextData();
        createOrderOrderContext.setCustomerAddress("Viet Name");
        context.setContextData(createOrderOrderContext);
    }
}
