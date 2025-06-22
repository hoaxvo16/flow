package com.hoaxvo.flow.services.step.createorder;

import com.hoaxvo.flow.core.AbstractStep;
import com.hoaxvo.flow.core.FlowContext;
import com.hoaxvo.flow.dto.context.CreateOrderOrderContext;
import org.springframework.stereotype.Service;

@Service
public class ValidateCompanyStep extends AbstractStep<CreateOrderOrderContext> {

    @Override
    public void process(FlowContext<CreateOrderOrderContext> flowContext) {
        CreateOrderOrderContext context = flowContext.getContextData();
        context.setIsValidPartner(true);
        context.setCompanyId(context.getCreateOrderRequest().getCompanyId());
        flowContext.setContextData(context);
        System.out.println("Validate partner info step");
    }
}