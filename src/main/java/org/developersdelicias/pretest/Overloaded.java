package org.developersdelicias.pretest;


public class Overloaded {

    private Console console;

    public Overloaded(Console console) {
        this.console = console;
    }

    public void foo(Integer i){
        console.print("foo(Integer)");
    }

    public void foo(short i){
        console.print("foo(short)");
    }

    public void foo(long i){
        console.print("foo(long)");
    }

    public void foo(int ... i){
        console.print("foo(int ...)");
    }
}
