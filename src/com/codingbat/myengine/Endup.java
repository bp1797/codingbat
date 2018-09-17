package com.codingbat.myengine;

public class Endup {
    public String endUp(String str) {
        int counter = 3;
        for (int i = str.length(); i > 0; i--) {
            str = str.substring(0, i-1) + str.toUpperCase().substring(i-1, str.length());
            counter--;
            if (counter == 0) break;
        }
        return str;
    }
}
