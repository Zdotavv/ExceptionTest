package com.company;

public class Main {
    public static void main(String[] args) {
        f(null);
    }
    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}
//Передавая null, и, вызывая NullPointerException, ловим его catch. Затем снова вызываем этот метод передавая ему NullPointerException.
//В резултате стек переполняется. Exception in thread "main" java.lang.StackOverflowError