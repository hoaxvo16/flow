package com.hoaxvo.flow.services;

import com.hoaxvo.flow.core.AbstractNode;
import com.hoaxvo.flow.core.FlowContext;
import com.hoaxvo.flow.core.NodeContext;
import com.hoaxvo.flow.dto.context.CreateOrderRequest;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderNode extends AbstractNode<CreateOrderRequest> {
    @Override
    public String getId() {
        return "createOrder";
    }

    @Override
    public NodeContext<CreateOrderRequest> execute(FlowContext flowContext) {


        return null;
    }
}
