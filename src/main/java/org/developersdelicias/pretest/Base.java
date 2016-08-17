package org.developersdelicias.pretest;

public class Base {

    protected static Console console = new Console();

    public Base(Console aConsole) {
        console = aConsole;
    }

    public static void foo(Base base) {
        console.printLine("In Base.foo()");
        base.bar();
    }

    public void bar() {
        console.printLine("In Base.bar()");
    }
}
