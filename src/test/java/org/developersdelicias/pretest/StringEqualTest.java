package org.developersdelicias.pretest;

import org.junit.Test;

import static org.junit.Assert.*;


public class StringEqualTest {

    @Test
    public void equal_operator_works_with_objects() throws Exception {
        String s1 = "hi";
        String s2 = new String("hi");
        String s3 = "hi";

        assertFalse(s1 == s2);
        assertTrue(s1 == s3);

        assertSame(s1, s3);
        assertNotSame(s1, s2);

        assertEquals(s1, s2);

        assertEquals(s1, s3);

    }
}