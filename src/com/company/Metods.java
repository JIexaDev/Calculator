package com.company;

public class Metods {
    
    /**Метод получающий операцию из выражения */
    public static String operation(String input){
        String[] operations = {"/","*","+","-"};           //Создаем массив со всеми возможными операциями
        String str = null;
        for (int i = 0; i<operations.length; i++){         //Проверяем совпадение каждого элемента массива
            if (input.indexOf(operations[i])>0){           //с каждым знаком в строке
                str = operations[i];                       //и возвращаем знак операции
            }
        }
        return str;
    }

    public static void findNums(String operation, int firstNum, int secondNum){
        firstNum = firstNum + 10;
        secondNum = secondNum + 10;
    }
}
