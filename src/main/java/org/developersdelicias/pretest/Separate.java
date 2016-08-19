package org.developersdelicias.pretest;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Separate {

    private Console console = new Console();

    public Separate() {
    }

    public Separate(Console console) {
        this.console = console;
    }

    public void separateAndPrint() {
        String text = "<head>first program </head> <body>hello world</body>";
        Set<String> words = new TreeSet<>();
        try (Scanner tokenizingScanner = new Scanner(text)) {
            tokenizingScanner.useDelimiter("\\W");
            while (tokenizingScanner.hasNext()) {
                String word = tokenizingScanner.next();
                if (!word.trim().equals("")) {
                    words.add(word);
                }
            }
        }

        for (String word : words) {
            console.print(word + " ");
        }
    }

    public static void main(String[] args) {
        Separate separate = new Separate();

        separate.separateAndPrint();
    }
}
