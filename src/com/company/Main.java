package com.company;

import java.util.Scanner;

import static com.company.Metods.*;
import static com.company.RomanNum.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

//        Nums arabNum = new Nums();
//        arabNum.operation(input);
//        arabNum.findNums(arabNum.getOrderOfSign(), input);
//        count(arabNum.getFirst(), arabNum.getSecond(), arabNum.getSign());

        TestRoman romanNum = new TestRoman();
        romanNum.operation(input);
    }
}
