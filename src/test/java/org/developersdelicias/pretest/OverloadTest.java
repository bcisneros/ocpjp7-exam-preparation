package org.developersdelicias.pretest;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;


public class OverloadTest {

    @Test
    public void overload_test() throws Exception {
        Side firstAttempt = new Head();
        Tail secondAttempt = new Tail();

        Console console = mock(Console.class);
        Coin coin = new Coin(console);

        coin.overload(firstAttempt);
        coin.overload((Object) firstAttempt);
        coin.overload(secondAttempt);
        coin.overload((Side)secondAttempt);

        inOrder(console).verify(console).print("Side ");
        inOrder(console).verify(console).print("Object ");
        inOrder(console).verify(console).print("Tail ");
        inOrder(console).verify(console).print("Side ");
    }
}
