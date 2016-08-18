package org.developersdelicias.pretest;


public class DerivedClass extends BaseClass {

    @Override
    void foo() throws IllegalArgumentException {
        throw new InvalidValueException();
    }
}
