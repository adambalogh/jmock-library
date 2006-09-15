package org.jmock;

import org.jmock.internal.OrderingConstraint;
import org.jmock.lib.UnorderedExpectationGroup;

public class InAnyOrder extends OrderingConstraint {
    public InAnyOrder() {
        super(new UnorderedExpectationGroup());
    }
}