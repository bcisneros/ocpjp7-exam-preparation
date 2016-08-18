package org.developersdelicias.pretest;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InnerClassAccessTest {

    @Test
    public void test_inner_property() throws Exception {
        assertThat(new Outer.Inner().text, is("Inner"));
    }
}
