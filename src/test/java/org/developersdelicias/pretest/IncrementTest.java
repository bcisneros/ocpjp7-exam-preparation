package org.developersdelicias.pretest;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IncrementTest {
    @Test
    public void testIncrement() throws Exception {
        Integer i = 10;
        Integer j = 11;
        Integer k = ++i;

        assertThat(k, is(11));
        assertThat(k == j, is(true));
        assertThat(k.equals(j), is(true));

    }
}
