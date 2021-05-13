package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        RomanNum num = new RomanNum();

        num.operation(input);
        num.findNums(num.getOrderOfSign(),input);

        // Проверка, что первый символ строки - цифра
        boolean result = input.matches("\\s*\\d{1}.*");
        if (result){
            num.count(num.getArabFirst(), num.getArabSecond(), num.getSign());
            System.out.println(num.getArabSumm());
        } else {
            num.count(num.romanToArab(num.getFirst()), num.romanToArab(num.getSecond()), num.getSign());
            System.out.println(num.arabToRoman(num.getArabSumm()));
        }

    }
}
