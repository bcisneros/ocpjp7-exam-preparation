package org.developersdelicias.pretest;


public class StringEqual {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = new String("hi");
        String s3 = "hi";

        System.out.println("s1 and s1 are " + (s1 == s2 ? "equal" : "not equal"));

        System.out.println("s1 and s3 are " + (s1 == s3 ? "equal" : "not equal"));
    }
}
