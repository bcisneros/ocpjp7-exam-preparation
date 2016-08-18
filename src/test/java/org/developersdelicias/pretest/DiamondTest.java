package org.developersdelicias.pretest;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class DiamondTest {

    private Console console = mock(Console.class);

    @Test
    public void test_collections() {
        List list1 = new ArrayList<>(Arrays.asList(1, "two", 3.0));
        List list2 = new LinkedList<>(Arrays.asList(new Integer(1), new Float(2.0F), new Double(3.0)));

        list1 = list2;

        for (Object element: list1) {
            console.print(element + " ");
        }

        inOrder(console).verify(console).print("1 ");
        inOrder(console).verify(console).print("2.0 ");
        inOrder(console).verify(console).print("3.0 ");
    }
}
