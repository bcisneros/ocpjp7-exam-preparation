package org.developersdelicias.pretest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;


public class AssertionFailureTest {
    @Test
    public void assertionError() throws Exception {

        Console console = mock(Console.class);

        AssertionFailure assertionFailure = new AssertionFailure(console);

        assertionFailure.assertionError();

        verify(console).printLine("Error java.lang.AssertionError");
    }

}