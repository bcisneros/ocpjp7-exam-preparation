package org.developersdelicias.pretest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Point2DTest {
    @Test
    public void should_always_print_default_to_string() throws Exception {
        Point2D point = new Point2D(10, 20);
        Point2D point2 = new Point2D(15, 78);
        assertThat(point.toString(), is("[0, 0]"));
        assertThat(point2.toString(), is("[0, 0]"));
    }

}