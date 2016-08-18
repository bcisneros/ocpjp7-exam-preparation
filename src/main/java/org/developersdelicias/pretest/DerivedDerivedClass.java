package org.developersdelicias.pretest;


public class DerivedDerivedClass extends DerivedClass {

    @Override
    void foo() {
       throw new InvalidKeyException();
    }
}
