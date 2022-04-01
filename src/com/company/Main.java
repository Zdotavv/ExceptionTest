package com.company;

public class Main {
    public static void main(String[] args) {
        Error ref = new Error(); // создаем экземпляр
        throw ref;               // "бросаем" его
        //Exception in thread "main" java.lang.Error
    }
}
