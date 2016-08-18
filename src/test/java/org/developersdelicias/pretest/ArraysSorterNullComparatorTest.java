package org.developersdelicias.pretest;

import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class ArraysSorterNullComparatorTest {

    Console console = mock(Console.class);

    @Test
    public void should_use_default_comparator_when_pass_null_comparator() throws Exception {
        String[] countries = {"Brazil", "Russia", "India", "China"};
        Arrays.sort(countries, null);

        for(String country: countries) {
            console.print(country + " ");
        }
        inOrder(console).verify(console).print("Brazil ");
        inOrder(console).verify(console).print("China ");
        inOrder(console).verify(console).print("India ");
        inOrder(console).verify(console).print("Russia ");


    }
}
