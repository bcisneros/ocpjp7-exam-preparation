package org.developersdelicias.pretest;


public class Derived extends Base {

    public Derived(Console aConsole) {
        super(aConsole);
    }

    public static void foo(Base base) {
        console.printLine("In Derived.foo()");
        base.bar();
    }

    @Override
    public void bar() {
        console.printLine("In Derived.bar()");
    }
}
