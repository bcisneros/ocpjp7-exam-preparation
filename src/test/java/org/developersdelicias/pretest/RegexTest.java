package org.developersdelicias.pretest;


import org.junit.Test;

import java.util.regex.Pattern;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class RegexTest {

    private Console console = mock(Console.class);
    @Test
    public void test_regular_expressions() throws Exception {
        String pattern = "a*b+c{3}";

        String[] strings = {"abc", "abbccc", "aabbcc", "aaabbbccc"};

        for (String str : strings) {
            console.print(Pattern.matches(pattern, str) + " ");
        }

        inOrder(console).verify(console).print("false ");
        inOrder(console).verify(console).print("true ");
        inOrder(console).verify(console).print("false ");
        inOrder(console).verify(console).print("true ");

    }
}
