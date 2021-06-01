package ru.main;

public class Multiplication {
    public static String multiplication(String n, String m) throws Exception {
        int m1 = Integer.parseInt(m);
        if (m1 < 1 || m1 > 10) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
        }
        String r1 = "";
        for (int i = 0; i < m1; i++) {
            r1 = n + r1;
        }
        return r1;
    }
}
