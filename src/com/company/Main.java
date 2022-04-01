package com.company;

public class Main {
    public static void main(String[] args) {
        throw null;
        //not ok
        // Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "null" is null
        //	at com.company.Main.main(Main.java:5)
    }
}