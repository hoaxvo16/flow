package com.hoaxvo.flow.core;

import java.util.List;

public class Flow {
     private final List<Node<?>> nodes;
     private final FlowContext context = new FlowContext();

     public Flow(List<Node<?>> nodes) {
          this.nodes = nodes;
     }

     public void start() {
          for (Node<?> node : nodes) {
               NodeContext<?> result = node.execute(context);
               context.putNodeContext(node.getId(), result);
          }
     }
}