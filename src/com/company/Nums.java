package com.company;

public class Nums {
    private int first;
    private int second;
    private String sign;      //Операция(знак) в выражении
    private int orderOfSign;  //Индекс знака в строке выражения

    private Nums(String sign, int orderOfSign){
        this.sign = sign;
        this.orderOfSign = orderOfSign;
    }

    public String getSign() {
        return sign;
    }

    public int getOrderOfSign() {
        return orderOfSign;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    /**Метод, извлекающий знак и его индекс из строки выражения */
    public static Nums operation(String input){
        String strSign = null;
        int intOrderOfSign = 0;
        String[] typesOfOperations = {"/","*","+","-"};               //Создаем массив со всеми возможными операциями
        for (String typeOfOperation : typesOfOperations) {            //Проверяем совпадение каждого элемента массива
            if (input.indexOf(typeOfOperation) > 0) {                 //с каждым знаком в строке
                strSign = typeOfOperation;                            //получаем знак операции
                intOrderOfSign = input.indexOf(typeOfOperation);      //получаем индекс знака в выражении
            }
        }
        return new Nums(strSign, intOrderOfSign);
    }

    /**Метод, извлекающий числа из строки выражения */
    public void findNums(int orderOfSign, String input){                     //Проверка на корректно введенный знак выражения
        if (orderOfSign == 0){
            System.out.println("Ошибка! Введите корректное выражение!");
            return;
        }
        String strFirst = input.substring(0, orderOfSign - 1).trim();    //Извлекает подстроку из строки до знака операции и после
        String strSecond = input.substring(orderOfSign + 1).trim();      //и удаляет пробелы
        first = Integer.parseInt(strFirst);                              //Преобразует строку в Int
        second = Integer.parseInt(strSecond);
    }
}
