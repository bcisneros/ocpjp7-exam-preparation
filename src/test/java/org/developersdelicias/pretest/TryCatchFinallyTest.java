package org.developersdelicias.pretest;


import org.junit.Test;

import static org.mockito.Mockito.*;

public class TryCatchFinallyTest {

    private Console console = mock(Console.class);

    @Test
    public void test_try_catch_finally_blocks() throws Exception {
        foo();

        inOrder(console).verify(console).print("in catch -> ");
        inOrder(console).verify(console).print("in finally -> ");

        verifyNoMoreInteractions(console);
    }

    private void foo() {
        try {
            int i = 10 / 0;
            console.print("after throw -> ");
        } catch (ArithmeticException ae) {
            console.print("in catch -> ");
            return;
        } finally {
            console.print("in finally -> ");
        }

        console.print("after everything");
    }
}
