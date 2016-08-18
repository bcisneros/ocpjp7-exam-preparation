package org.developersdelicias.pretest;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RuntimeExceptionTest {

    private Console console = mock(Console.class);

    @Test
    public void should_throw_an_invalid_key_exception() {
        try {
            BaseClass base = new DerivedDerivedClass();
            base.foo();
        } catch (RuntimeException e) {
            console.printLine(e.toString());
        }

        verify(console).printLine("org.developersdelicias.pretest.InvalidKeyException");
    }
}
