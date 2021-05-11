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
        String[] typesOfOperations = {"/","*","+","-"};              //Создаем массив со всеми возможными операциями
        for (int i = 0; i<typesOfOperations.length; i++){            //Проверяем совпадение каждого элемента массива
            if (input.indexOf(typesOfOperations[i])>0){              //с каждым знаком в строке
                strSign = typesOfOperations[i];                         //получаем знак операции
                intOrderOfSign = input.indexOf(typesOfOperations[i]);   //получаем индекс знака в выражении
            }
        }
        return new Nums(strSign, intOrderOfSign);
    }

    /**Метод, извлекающий числа из строки выражения */
    public void findNums(int orderOfSign, String operation){

    }
}
