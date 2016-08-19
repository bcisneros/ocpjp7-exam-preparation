package org.developersdelicias.pretest;


import org.junit.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class FileMatcherTest {

    private Console console = mock(Console.class);

    @Test
    public void print_only_names() throws Exception {

        String path = System.getProperty("user.dir") + "/src/test/resources/";
        Path currentPath = Paths.get(path);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentPath, "*o*?{java,class}")) {
            for (Path file : stream) {
                console.print(file.getFileName() + " ");
            }
        } catch(IOException ioe) {
            console.printLine("An I/O error occurred: " + ioe);
        }

        verify(console, never()).printLine(anyString());

        inOrder(console).verify(console).print("Copy.class ");
        inOrder(console).verify(console).print("Copy.java ");
        inOrder(console).verify(console).print("Hello.class ");
        inOrder(console).verify(console).print("OddEven.class ");
        inOrder(console).verify(console).print("PhotoCopy.java ");

        verifyNoMoreInteractions(console);

    }
}
