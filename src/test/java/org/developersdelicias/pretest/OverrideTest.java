package org.developersdelicias.pretest;


import org.junit.Test;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class OverrideTest {

    @Test
    public void static_methods_are_not_overridable() throws Exception {
        Console console = mock(Console.class);
        Base base = new Derived(console);
        base.foo(base);

        inOrder(console).verify(console).printLine("In Base.foo()");
        inOrder(console).verify(console).printLine("In Derived.bar()");
    }

}
