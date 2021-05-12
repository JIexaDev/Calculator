package com.company;

public class RomanNum extends Nums {

    /**Метод возвращающий число от символа, указанного римской цифрой */
    private int decodeSingleChar(char symbol){
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
    public int decoder(String input){
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

    private String[] romanNums = {"C","XC","L","XL","X","IX","V","IV","I"};
    private int[] arabicNums =   {100, 90,  50,  40, 10,  9,  5,   4,  1};

    /**Метод, возвращающий строку арабских цифр. На вход принимает число */
    public String arabToRoman(int number){
        String stringRoman = "";
        for (int i = 0; i < arabicNums.length; i++){
            while (number >= arabicNums[i]){
                stringRoman += romanNums[i];
                number -= arabicNums[i];
            }
        }
        return stringRoman;
    }

}
