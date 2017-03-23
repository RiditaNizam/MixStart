package com.company;

/**
 * Created by ridita on 3/23/17.
 */
public class MixStart {
    public boolean mixStart(String str) {
        if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
}
