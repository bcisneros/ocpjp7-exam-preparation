package org.developersdelicias.pretest;

import java.io.File;

public class CreatesFilesInFolder {
    public static void main(String[] args) {
        String[] fileList = {"/file1.txt", "/subdir/file2.txt", "/file3.txt"};

        for (String file: fileList) {
            try {
                new File(file).mkdirs();
            } catch (Exception e) {
                System.out.println("File creation failed");
                System.exit(-1);
            }
        }
    }
}