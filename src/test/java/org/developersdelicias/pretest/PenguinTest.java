package org.developersdelicias.pretest;

import org.junit.Test;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class PenguinTest {

    @Test
    public void walk_and_fly_test(){
        Console mockConsole = mock(Console.class);
        Penguin benji = new Penguin(mockConsole);

        benji.walk();
        benji.fly();


        Birdie birdie = benji;

        try {
            birdie.fly();
        } catch(CannotFlyException e) {
            fail("Should not fail");
        }
        inOrder(mockConsole).verify(mockConsole).printLine("walking like penguin");
        inOrder(mockConsole).verify(mockConsole, times(2)).printLine("cannot fly");

    }
}