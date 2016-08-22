package org.developersdelicias.pretest;

import org.junit.Test;

import static org.developersdelicias.pretest.RomanNumeral.romanFor;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralTest {

    @Test
    public void obtain_roman_numeral_string() throws Exception {
        assertThat(romanFor(1), is("I"));
        assertThat(romanFor(2), is("II"));
        assertThat(romanFor(3), is("III"));
        assertThat(romanFor(4), is("IV"));
        assertThat(romanFor(5), is("V"));
        assertThat(romanFor(6), is("VI"));
        assertThat(romanFor(7), is("VII"));
        assertThat(romanFor(8), is("VIII"));
        assertThat(romanFor(9), is("IX"));
        assertThat(romanFor(10), is("X"));
        assertThat(romanFor(11), is("XI"));
        assertThat(romanFor(12), is("XII"));
        assertThat(romanFor(13), is("XIII"));
        assertThat(romanFor(15), is("XV"));
        assertThat(romanFor(16), is("XVI"));
        assertThat(romanFor(17), is("XVII"));
        assertThat(romanFor(18), is("XVIII"));
        assertThat(romanFor(20), is("XX"));
        assertThat(romanFor(30), is("XXX"));
        assertThat(romanFor(35), is("XXXV"));
        assertThat(romanFor(37), is("XXXVII"));
        assertThat(romanFor(38), is("XXXVIII"));
        assertThat(romanFor(3494), is("MMMCDXCIV"));
        assertThat(romanFor(3682), is("MMMDCLXXXII"));
    }
}
