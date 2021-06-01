package ru.main;

public class Score {
    public static String[] score(String n) throws Exception {
        String[] a = new String[3];

        a[0] = search(n);
        if (a[0].isEmpty()) {
            throw new Exception("Первым аргументом выражения, подаваемого на вход, должна быть строка");
        }
        n = n.replace("\"" + a[0] + "\"", "").trim();

        a[1] = n.charAt(0) + "";
        n = n.replace(a[1], "").trim();

        a[2] = search(n);

        if (a[2].isEmpty()) {
            try {
                Integer.parseInt(n);
                a[2] = n;
            } catch (NumberFormatException e) {
                throw new Exception("Пораскинь мозгами, ты же программист?! Выбирай число или кавычки во втором аргументе");
            }
        }

        if (a[0].length() > 10 || a[2].length() > 10) {
            throw new Exception("Строка должна быть длинной не более 10 символов");
        }
        return a;
    }

    private static String search(String s) {
        String r = "";
        if (s.indexOf("\"") == -1) {
            return r;
        }
        for (int i = s.indexOf("\"") + 1; i < s.length(); i++) {
            if ('"' != s.charAt(i)) {
                r = r + s.charAt(i);
            } else {
                break;
            }
        }
        return r;
    }
}
