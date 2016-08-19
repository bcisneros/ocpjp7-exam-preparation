package org.developersdelicias.pretest;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PathsTest {
    @Test
    public void obtain_subpath() throws Exception {
        Path wordpadPath = Paths.get("C:\\Program Files\\Windows NT\\Accesories\\wordpad.exe");
        assertThat(wordpadPath.subpath(0, 1).toString(), is("Program Files"));
    }
}
