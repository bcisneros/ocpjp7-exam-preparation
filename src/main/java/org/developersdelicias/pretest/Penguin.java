package org.developersdelicias.pretest;


class Penguin extends NonFlyer implements Birdie, Biped {

    Penguin(Console console) {
        super(console);
    }

    public void walk() {
        console.printLine("walking like penguin");
    }

}
