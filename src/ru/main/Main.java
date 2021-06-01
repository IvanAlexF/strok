package ru.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner con = new Scanner(System.in);
        String n = con.nextLine();

        String[] m = Score.score(n);
        String r = "";
        if (("+").equals(m[1])) {
            r = Sum.sum(m[0], m[2]);
        } else if (("-").equals(m[1])) {
            r = Difference.difference(m[0], m[2]);
        } else if (("*").equals(m[1])) {
            r = Multiplication.multiplication(m[0], m[2]);
        } else if (("/").equals(m[1])) {
            r = Division.division(m[0], m[2]);
        } else {
            throw new Exception("Полноное извращение этот калькулятор");
        }

        if (r.length() > 40) {
            r = r.substring(0, 40) + "...";
        }
        System.out.println("\"" + r + "\"");
    }
}
