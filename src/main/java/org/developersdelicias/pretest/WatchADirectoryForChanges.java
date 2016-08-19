package org.developersdelicias.pretest;


import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.WatchService;

public class WatchADirectoryForChanges {

    public static void main(String[] args) throws IOException {
        WatchService watcher = FileSystems.getDefault().newWatchService();
    }
}
