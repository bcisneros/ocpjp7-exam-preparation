package org.developersdelicias.pretest;

import org.junit.Test;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;


public class OverloadedTest {

    @Test
    public void should_cast_to_the_next_primitive() throws Exception {
        Console console = mock(Console.class);
        Overloaded overloaded = new Overloaded(console);

        overloaded.foo(10);
        overloaded.foo(new Integer(10));
        int x = 10;

        overloaded.foo(x, 10);
        inOrder(console).verify(console).print("foo(long)");
        inOrder(console).verify(console).print("foo(Integer)");
        inOrder(console).verify(console).print("foo(int ...)");
    }
}