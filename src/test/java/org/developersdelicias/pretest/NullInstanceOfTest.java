package org.developersdelicias.pretest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NullInstanceOfTest {
    @Test
    public void null_instance_of_produces_false() throws Exception {
        String nullString = null;
        assertThat(nullString instanceof Object, is(false));

    }
}
