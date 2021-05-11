package com.company;

public class RomanNum {

    /**Метод возвращающий число от символа, указанного римской цифрой */
    private static int decodeSingleChar(char symbol){
        switch (symbol){
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    /**Метод, возвращающий число из введенного римского */
    public static int decoder(String input){
        int sum = 0;
        String upInput = input.toUpperCase();
        for (int i = 0; i < (upInput.length() - 1); i++){
            if (decodeSingleChar(upInput.charAt(i)) < decodeSingleChar(upInput.charAt(i+1))){
                sum -= decodeSingleChar(upInput.charAt(i));
            } else {
                sum += decodeSingleChar(upInput.charAt(i));
            }
        }
        sum += decodeSingleChar(upInput.charAt(upInput.length() - 1));
        return sum;
    }
}
