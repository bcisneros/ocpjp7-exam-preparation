package org.developersdelicias.pretest;

import org.junit.Test;

import static org.junit.Assert.assertNull;


public class BookTest {

    @Test
    public void print_book_name() throws Exception {
        AbstractBook philosophyBook = new Book("Principia Mathematica");
        assertNull(philosophyBook.name);
    }
}