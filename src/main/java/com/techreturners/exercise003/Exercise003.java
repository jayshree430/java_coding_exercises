package com.techreturners.exercise003;

public class Exercise003 {
    private String[] iceCreamFlavours= { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"
    };

    String[] iceCreamFlavours() {
        return iceCreamFlavours;
    }

    public int getIceCreamCode(String iceCreamFlavour) {
        return java.util.Arrays.asList(iceCreamFlavours).indexOf(iceCreamFlavour);
    }


}
