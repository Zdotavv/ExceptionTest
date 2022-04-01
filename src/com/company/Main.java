package com.company;

public class Main {
    public static void main(String[] args) {
        throw new String("Hello!");
        // not ok. incompatible types: java.lang.String cannot be converted to java.lang.Throwable
    }
}