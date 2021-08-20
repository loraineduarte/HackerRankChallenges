package com.company;

public class SuperReducedString {
    public static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean passNeeded = true;

        while (passNeeded) {
            passNeeded = false;
            for (int i = 0; i < sb.length() - 1; ++i) {

                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    passNeeded = true;

                }
            }
        }

        if (sb.toString().isEmpty()){
            sb.append("Empty String");
        }
        return sb.toString();
    }
}
