package com.hoaxvo.flow.services.step;

import com.hoaxvo.flow.core.AbstractStep;
import com.hoaxvo.flow.core.FlowContext;
import com.hoaxvo.flow.dto.context.CreateOrderContext;
import org.springframework.stereotype.Service;

@Service
public class ValidatePartnerInfoStep extends AbstractStep<CreateOrderContext> {

    @Override
    public void process(FlowContext<CreateOrderContext> flowContext) {
        CreateOrderContext context = flowContext.getContextData();
        context.setIsValidPartner(true);
        flowContext.setContextData(context);
        System.out.println("Validate partner info step");
    }
}