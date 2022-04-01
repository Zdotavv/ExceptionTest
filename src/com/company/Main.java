package com.company;

public class Main {
    public static void main(String[] args) {
sqr(10);
    }
        public static double sqr(double arg) {
            if (System.currentTimeMillis() % 2 == 0) {
                return arg * arg; // ну ладно, вот твой double
            } else {
                while (true);     // а тут "виснем" навсегда
            }
        }
    }