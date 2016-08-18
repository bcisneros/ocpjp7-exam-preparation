package org.developersdelicias.pretest;


class Book extends AbstractBook implements Sleepy {

    public Book(String aName) {
        // This line do not compile because is ambiguous name in AbstractBook and Sleepy
        //this.name = name;
    }
}
