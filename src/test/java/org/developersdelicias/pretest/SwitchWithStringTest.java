package org.developersdelicias.pretest;


import org.junit.Test;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class SwitchWithStringTest {

    Console console = mock(Console.class);

    @Test
    public void test_switch_with_strings() throws Exception {
        printCards();
        inOrder(console).verify(console).print(" club ");
        inOrder(console).verify(console, times(3)).print(" none ");

    }

    private void printCards() {
        String[] cards = {"Club", "spade", " diamond ", "hearts"};

        for (String card : cards) {
            switch (card) {
                case "Club":
                    console.print(" club ");
                    break;
                case "Spade":
                    console.print(" spade ");
                    break;
                case "diamond":
                    console.print(" diamond ");
                    break;
                case "heart":
                    console.print(" heart ");
                    break;
                default:
                    console.print(" none ");
            }
        }
    }
}
