package com.company;

public class RomanNum extends Nums {

    private String[] inputRomanString = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

    /**Метод, возвращающий число из введенного римского */
    public int romanToArab(String input){
        int output = 0;
        String upInput = input.toUpperCase();
        for (int i = 0; i < inputRomanString.length; i++) {
           if (upInput.equals(inputRomanString[i])){
               output = i + 1;
           }
        }
        //Проверка на корректность введенных римских чисел
        if (output == 0){
            System.out.println("Ошибка! Введите корректное выражение!");
            System.exit(0);
        }
        return output;
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
        if (stringRoman.equals("")){
            System.out.println("Римские числа бывают только положительными :)");
            System.exit(0);
        }
        return stringRoman;
    }

}
