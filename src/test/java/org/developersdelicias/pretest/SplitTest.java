package org.developersdelicias.pretest;


import org.junit.Test;

import java.util.regex.Pattern;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class SplitTest {

    private Console console = mock(Console.class);
    private static final String DATE = "10-01-2012";

    @Test
    public void string_split() throws Exception {
        printDateParts(DATE.split("-"));
        verifyInOrder();

    }

    @Test
    public void pattern_split() throws Exception {
        printDateParts(Pattern.compile("-").split(DATE));
        verifyInOrder();
    }

    private void printDateParts(String[] split) {
        for (String part : split) {
            console.print(part + " ");
        }
    }

    private void verifyInOrder() {
        inOrder(console).verify(console).print("10 ");
        inOrder(console).verify(console).print("01 ");
        inOrder(console).verify(console).print("2012 ");
    }
}
