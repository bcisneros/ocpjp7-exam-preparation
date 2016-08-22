package org.developersdelicias.pretest;


class RomanNumeral {
    static String romanFor(int number) {
        String returnString = "";
        for (Roman roman : Roman.values()) {
            while (number >= roman.getDecimal()) {
                returnString += roman.getSymbol();
                number -= roman.getDecimal();
            }
        }

        for (int i = 1; i <= number; i++) {
            returnString += "I";
        }

        return returnString;
    }

    private enum Roman {
        THOUSAND(1000, "M"),
        NINE_HUNDRED(900, "CM"),
        FIVE_HUNDRED(500, "D"),
        FOUR_HUNDRED(400, "CD"),
        HUNDRED(100, "C"),
        NINETY(90, "XC"),
        FIFTY(50, "L"),
        FORTY(40, "XL"),
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4, "IV");

        private final int decimal;
        private final String symbol;

        Roman(int roman, String symbol) {
            this.decimal = roman;
            this.symbol = symbol;
        }

        public int getDecimal() {
            return decimal;
        }

        public String getSymbol() {
            return symbol;
        }
    }
}
