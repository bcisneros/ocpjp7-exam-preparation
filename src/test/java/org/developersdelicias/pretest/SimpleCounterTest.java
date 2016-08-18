package org.developersdelicias.pretest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class SimpleCounterTest {

    @Test
    public void test_counter() throws Exception {
        SimpleCounter<Double> doubleCounter = new SimpleCounter<>();
        SimpleCounter<Integer> intCounter = new SimpleCounter<>();
        SimpleCounter rawCounter = new SimpleCounter();

        assertThat(doubleCounter.getCount(), is(3));
        assertThat(intCounter.getCount(), is(3));
        assertThat(rawCounter.getCount(), is(3));
    }
}