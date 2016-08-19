package org.developersdelicias.pretest;

import org.junit.Test;

import static org.mockito.Mockito.*;


public class SeparateTest {

    private Console console = mock(Console.class);

    @Test
    public void separateAndPrint() throws Exception {

        Separate separate = new Separate(console);

        separate.separateAndPrint();

        inOrder(console).verify(console).print("body ");
        inOrder(console).verify(console).print("first ");
        inOrder(console).verify(console).print("head ");
        inOrder(console).verify(console).print("hello ");
        inOrder(console).verify(console).print("program ");
        inOrder(console).verify(console).print("world ");
        verifyNoMoreInteractions(console);

    }


}