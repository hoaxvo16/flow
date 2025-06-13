package com.hoaxvo.flow;

import com.hoaxvo.flow.core.AbstractFlow;
import com.hoaxvo.flow.core.Flow;
import com.hoaxvo.flow.core.FlowContext;
import com.hoaxvo.flow.dto.CreateOrderRequest;
import com.hoaxvo.flow.dto.context.CreateOrderContext;
import com.hoaxvo.flow.services.step.InsertOrderStep;
import com.hoaxvo.flow.services.step.ValidatePartnerInfoStep;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class FlowApplication {

    public static void main(String[] args) {
        InsertOrderStep insertOrderStep = new InsertOrderStep();

        ValidatePartnerInfoStep validatePartnerInfoStep = new ValidatePartnerInfoStep();
        insertOrderStep.setNext(validatePartnerInfoStep);
        CreateOrderContext createOrderContext = new CreateOrderContext();

        CreateOrderRequest createOrderRequest = new CreateOrderRequest();
        createOrderRequest.setCusNo("12345");
        createOrderRequest.setRequestId(UUID.randomUUID().toString());

        createOrderContext.setCreateOrderRequest(createOrderRequest);

        Flow<CreateOrderRequest, CreateOrderContext> b2bCreateOrderFlow = new AbstractFlow<>() {

            @Override
            public CreateOrderContext getContextData() {
                return this.flowContext.getContextData();
            }

            @Override
            public void setContextData(CreateOrderContext contextData) {
                this.flowContext = new FlowContext<>();
                this.flowContext.setContextData(contextData);
            }
        };

        b2bCreateOrderFlow.setFirstStep(insertOrderStep);
        b2bCreateOrderFlow.setContextData(createOrderContext);
        b2bCreateOrderFlow.run(createOrderRequest);
        CreateOrderContext context = b2bCreateOrderFlow.getContextData();
        System.out.println("Context: " + context);
    }

}
