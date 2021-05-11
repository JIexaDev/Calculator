package com.company;

import java.util.Scanner;

import static com.company.Metods.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Nums num = Nums.operation(input);


        switch (num.getSign()){
            case "+":

                break;
            case "-":

                break;
            case "*":

                break;
            case "/":

                break;
            default:
                System.out.println("Ошибка!");
        }

//        Nums findNums = Nums.findNums();

    }
}
