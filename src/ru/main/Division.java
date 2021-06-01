package ru.main;

public class Division {
    public static String division(String n, String m) throws Exception {
        int m1 = Integer.parseInt(m);

        if (m1 < 1 || m1 > 10) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
        }
        return n.substring(0, n.length() / m1);
    }
}
