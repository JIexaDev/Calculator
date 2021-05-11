package com.company;

import java.util.Scanner;

import static com.company.Metods.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(operation(input));
        switch (operation(input)){
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

        int firstNum = 1;
        int secondNum = 2;
        findNums(operation(input),firstNum,secondNum);
        System.out.println(firstNum + " " + secondNum);
    }
}
