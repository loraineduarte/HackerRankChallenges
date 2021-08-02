package com.company;

public class MinimumNumber {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password


        Its length is at least 6.
        It contains at least one digit.
        It contains at least one lowercase English character.
        It contains at least one uppercase English character.
        It contains at least one special character. The special characters are: !@#$%^&*()-+
     */

        public static int minimumNumber(int n, String password) {
            int missingCharacters = 0;
            char[] splitedPassword = password.toCharArray();

            boolean upperCase = false;
            boolean lowerCase = false;
            boolean digitCase = false;
            boolean specialCase = false;


            for(int i=0; i<splitedPassword.length; i++){
                if((Character.isUpperCase(splitedPassword[i])) && (!upperCase)){
                    upperCase = true;
                }
                if((Character.isLowerCase(splitedPassword[i])) && (!lowerCase)){
                    lowerCase = true;
                }
                if((Character.isDigit(splitedPassword[i])) && (!digitCase)){
                    digitCase = true;
                }
                else if((!specialCase)){
                    specialCase = true;
                }
            }

            if (!upperCase) missingCharacters++;
            if (!lowerCase) missingCharacters++;
            if (!digitCase) missingCharacters++;
            if (!specialCase) missingCharacters++;

            if(n<=6){
                int missingTotal= 6-n;
                if(missingTotal > missingCharacters){
                    missingTotal = missingTotal-missingCharacters;
                    missingCharacters = missingCharacters + missingTotal;
                } if ((missingCharacters+n <= 6)){
                    missingCharacters++;
                }
            }

            return missingCharacters;
        }

    }

