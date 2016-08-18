package org.developersdelicias.pretest;


import java.util.UnknownFormatConversionException;

public class UsePrintf {

    public static void main(String[] args) {
        int c = 'a';
        float f = 10;
        long ell = 100L;

        try {
            System.out.print(String.format("char val is %c, float val is %f, long int val is %ld \n", c, f, ell));
        } catch (UnknownFormatConversionException e) {
            System.err.print(e.getMessage());
        }
    }
}
