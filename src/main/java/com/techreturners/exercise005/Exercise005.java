package com.techreturners.exercise005;

import java.util.Locale;

public class Exercise005 {

    public boolean isPangram(String input) {
        if (input ==null && input.length()==0) return false;
        boolean[] alphabetList = new boolean[26];
        int index = 0;
        boolean flag = true;
        input = input.replaceAll("[-+^ 0-9]*", "").toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if( input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }
            alphabetList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!alphabetList[i]) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
