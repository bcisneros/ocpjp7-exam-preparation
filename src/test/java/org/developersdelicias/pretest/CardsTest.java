package org.developersdelicias.pretest;

import org.junit.Test;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;


public class CardsTest {

    private Console console = mock(Console.class);

    @Test
    public void traverse_a_enum() throws Exception {
        traverseEnums();

        inOrder(console).verify(console).print("CLUB ");
        inOrder(console).verify(console).print("SPADE ");
        inOrder(console).verify(console).print("DIAMOND ");
        inOrder(console).verify(console).print("HEARTS ");
    }

    private void traverseEnums() {
        for (Cards card : Cards.values()) {
            console.print(card + " ");
        }
    }
}