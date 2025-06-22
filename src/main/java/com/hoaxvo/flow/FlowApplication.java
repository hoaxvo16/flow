package com.hoaxvo.flow;

import com.hoaxvo.flow.core.Flow;
import com.hoaxvo.flow.core.FlowBuilder;
import com.hoaxvo.flow.dto.CreateOrderRequest;
import com.hoaxvo.flow.dto.context.CreateOrderOrderContext;
import com.hoaxvo.flow.services.step.createorder.GetUserAddressStep;
import com.hoaxvo.flow.services.step.createorder.InsertOrderStep;
import com.hoaxvo.flow.services.step.createorder.ValidateCompanyStep;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class FlowApplication {

    public static void main(String[] args) {
        InsertOrderStep insertOrderStep = new InsertOrderStep();
        ValidateCompanyStep validateCompanyStep = new ValidateCompanyStep();
        GetUserAddressStep getUserAddressStep = new GetUserAddressStep();

        CreateOrderOrderContext createOrderContext = new CreateOrderOrderContext();
        CreateOrderRequest createOrderRequest = new CreateOrderRequest();
        createOrderRequest.setRequestId(UUID.randomUUID().toString());
        createOrderRequest.setCompanyId("COMPA-33");

        createOrderContext.setCreateOrderRequest(createOrderRequest);

        Flow<CreateOrderOrderContext> b2bCreateOrderFlow = FlowBuilder
                .startWith(insertOrderStep)
                .then(validateCompanyStep)
                .then(null)
                .build(createOrderContext);

        CreateOrderOrderContext d2cCreateOrderContext = new CreateOrderOrderContext();
        CreateOrderRequest d2cCreateOrderRequest = new CreateOrderRequest();
        d2cCreateOrderRequest.setRequestId(UUID.randomUUID().toString());
        d2cCreateOrderRequest.setCusNo("CUST-124");
        d2cCreateOrderContext.setCreateOrderRequest(d2cCreateOrderRequest);

        Flow<CreateOrderOrderContext> d2cCreateOrderFlow = FlowBuilder
                .startWith(getUserAddressStep)
                .then(insertOrderStep)
                .then(null)
                .build(d2cCreateOrderContext);

        b2bCreateOrderFlow.run();
        d2cCreateOrderFlow.run();

        System.out.println("B2B Context: " + b2bCreateOrderFlow.getContextData());
        System.out.println("D2C Context: " + d2cCreateOrderFlow.getContextData());
    }

}
