package com.company;

import java.util.Scanner;

import static com.company.Metods.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Nums num = Nums.operation(input);
        num.findNums(num.getOrderOfSign(), input);

        switch (num.getSign()){
            case "+":
                System.out.println(num.getFirst() + num.getSecond());
                break;
            case "-":
                System.out.println(num.getFirst() - num.getSecond());
                break;
            case "*":
                System.out.println(num.getFirst() * num.getSecond());
                break;
            case "/":
                if (num.getSecond() != 0){
                    System.out.println(num.getFirst() / num.getSecond());
                } else {
                    System.out.println("Ошибка! Нельзя делить на ноль!");
                }
                break;
            default:
                System.out.println("Что-то пошло не так...");
        }



    }
}
