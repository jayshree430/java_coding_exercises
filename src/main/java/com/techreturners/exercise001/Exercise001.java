package com.techreturners.exercise001;

import java.math.RoundingMode;
import java.util.List;
import java.math.BigDecimal;

public class Exercise001 {
    public String capitalizeWord(String word) {
        /*
        Checking if the first letter of the string is Capital.
         If not perform the following operations.
        */
        if (!(Character.isUpperCase(word.charAt(0)))){
            return word.substring(0,1).toUpperCase() + word.substring(1);
        }
        // The first Letter is already Capital so returning as it is.
        return word;
    }

    public String generateInitials(String firstName, String lastName) {

        return String.valueOf(firstName.charAt(0)) + String.valueOf('.') + String.valueOf(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {

        if(vatRate > 0)
        {
            /*
            * Checking to see if vat exists. If yes then calculate vat and add to original price.
            * */
            originalPrice += (originalPrice * vatRate)/100;
        }
        /*
        * Converting result into BigDecimal to maintain decimal points up to 2 places without rounding up.
        * */
        BigDecimal bd = new BigDecimal(originalPrice).setScale(2, RoundingMode.HALF_DOWN);
        return bd.doubleValue();
    }

    public String reverse(String sentence) {
        StringBuilder reverseString = new StringBuilder(sentence).reverse();
        return reverseString.toString();
    }

    public int countLinuxUsers(List<User> users) {

        long countLinuxUser = users.stream()
                .filter(c -> c.getType().equals("Linux"))
                .count();
        return (int) countLinuxUser;
    }
}

