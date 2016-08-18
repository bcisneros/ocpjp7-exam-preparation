package org.developersdelicias.pretest;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DequeTest {

    @Test
    public void name() throws Exception {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(1, 2, 3, 4, 5));

        assertThat(deque.remove(), is(1));
        assertThat(deque.remove(), is(2));

    }
}
