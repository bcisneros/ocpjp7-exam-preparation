package org.developersdelicias.pretest;


import org.junit.Test;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class MatchCheckTest {

    private Console console = mock(Console.class);

    @Test
    public void string_matches() throws Exception {
        String[] severities = {"Severity 1", "severity 2", "severity3", "severity five"};

        for(String severity:severities) {
            if (!severity.matches("^severity[\\s+][1-5]")){
                console.printLine(severity + " does not match");
            }
        }

        inOrder(console).verify(console).printLine("Severity 1 does not match");
        inOrder(console).verify(console).printLine("severity3 does not match");
        inOrder(console).verify(console).printLine("severity five does not match");

    }
}
