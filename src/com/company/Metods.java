package com.company;

public class Metods {

    /**Метод высчитывающий значение выражения */
    public static void count(int firstNum, int secondNum, String sign){
        switch (sign){
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                if (secondNum != 0){
                    System.out.println(firstNum / secondNum);
                } else {
                    System.out.println("Ошибка! Нельзя делить на ноль!");
                }
                break;
            default:
                System.out.println("Что-то пошло не так...");
        }
    }
}
