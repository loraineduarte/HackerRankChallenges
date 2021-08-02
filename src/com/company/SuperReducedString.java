package com.company;

public class SuperReducedString {
    public static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++){
            do{
                if((Character.compare(sb.charAt(i), sb.charAt(i+1)) == 0 )){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i+1);
                } else break;
            }while(i+1 < sb.length());
        }

        if (sb.toString().isEmpty()){
            sb.toString().equals("Empty String");
        }
        return sb.toString();
    }
}
