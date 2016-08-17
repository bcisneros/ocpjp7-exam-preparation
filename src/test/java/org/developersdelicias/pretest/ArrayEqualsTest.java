package org.developersdelicias.pretest;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayEqualsTest {
    @Test
    public void test_array_equals() throws Exception {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        assertThat(array1 == array2, is(false));
        assertThat(array1.equals(array2), is(false));
        assertThat(Arrays.equals(array1, array2), is(true));




    }
}
