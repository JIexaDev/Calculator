package com.company;

import java.util.Scanner;

import static com.company.Metods.*;
import static com.company.RomanNum.*;

public class Main {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();

//        Nums num = Nums.operation(input);
//        num.findNums(num.getOrderOfSign(), input);
//
//        count(num.getFirst(), num.getSecond(), num.getSign());x

        RomanNum romanNum = new RomanNum();
        System.out.println(romanNum.arabToRoman(99));
    }
}
