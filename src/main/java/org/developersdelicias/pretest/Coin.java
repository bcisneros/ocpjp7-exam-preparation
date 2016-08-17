package org.developersdelicias.pretest;


class Coin {

    private Console console;

    public Coin(Console console) {
        this.console = console;
    }

    public void overload(Head side) {
        console.print(side.getSide());
    }

    public void overload(Tail side) {
        console.print(side.getSide());
    }

    public void overload(Side side) {
        console.print("Side ");
    }

    public void overload(Object firstAttempt) {
        console.print("Object ");
    }
}
