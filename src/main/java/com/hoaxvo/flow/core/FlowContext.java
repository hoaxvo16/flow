package com.hoaxvo.flow.core;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class FlowContext<T> {
    private Map<String, NodeContext<?>> nodesContext;
    private T result;

    public Map<String, NodeContext<?>> getNodesContext() {
        return Collections.unmodifiableMap(nodesContext);
    }

    @SuppressWarnings("unchecked")
    public <V> NodeContext<V> getNodeContext(String nodeId, Class<V> clazz) {
        return (NodeContext<V>) nodesContext.get(nodeId);
    }

    void putNodeContext(String nodeId, NodeContext<?> context) {
        nodesContext.put(nodeId, context);
    }

    void buildResult(){

    }
}
