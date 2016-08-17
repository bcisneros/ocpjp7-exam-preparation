package org.developersdelicias.pretest;


abstract class NonFlyer {
    protected Console console;

    NonFlyer(Console console) {
        this.console = console;
    }

    public void fly(){
        console.printLine("cannot fly");
    }
}
