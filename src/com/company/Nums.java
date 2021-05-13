package com.company;

public class Nums {
    protected String first;
    protected String second;
    private String sign;          //Операция(знак) в выражении
    private int orderOfSign = 0;  //Индекс знака в строке выражения
    private int arabSumm;

    public String getSign() {
        return sign;
    }

    public int getOrderOfSign() {
        return orderOfSign;
    }

    /**Получает из String с числом int число */
    public int getArabFirst() {
        int intFirst = 0;
        try {
            intFirst = Integer.parseInt(first);
        }
        catch (Exception ex){
            System.out.println("Ошибка! Введите корректное выражение!");
            ex.printStackTrace();
            System.exit(0);
        }
        return intFirst;
    }

    /**Получает из String с числом int число */
    public int getArabSecond() {
        int intSecond = 0;
        try {
            intSecond = Integer.parseInt(second);
        }
        catch (Exception ex){
            System.out.println("Ошибка! Введите корректное выражение!");
            ex.printStackTrace();
            System.exit(0);
        }
        return intSecond;
    }

    public int getArabSumm() { return arabSumm; }

    public String getFirst(){
        return first;
    }

    public String getSecond() {
        return second;
    }

    /**Метод, извлекающий знак и его индекс из строки выражения */
    public void operation(String input){
        String[] typesOfOperations = {"/","*","+","-"};               //Создаем массив со всеми возможными операциями
        for (String typeOfOperation : typesOfOperations) {            //Проверяем совпадение каждого элемента массива
            if (input.indexOf(typeOfOperation) > 0) {                 //с каждым знаком в строке
                sign = typeOfOperation;                               //получаем знак операции
                orderOfSign = input.indexOf(typeOfOperation);         //получаем индекс знака в выражении
            }
        }
    }

    /**Метод, извлекающий числа из строки выражения */
    public void findNums(int orderOfSign, String input){               //Проверка на корректно введенный знак выражения
        if (orderOfSign == 0){
            System.out.println("Ошибка! Введите корректное выражение!");
            return;
        }
        first = input.substring(0, orderOfSign).trim();        //Извлекает подстроку из строки до знака операции и после
        second = input.substring(orderOfSign + 1).trim();      //и удаляет пробелы
    }

    /**Метод высчитывающий значение выражения */
    public void count(int firstNum, int secondNum, String sign){
        switch (sign){
            case "+":
                arabSumm = firstNum + secondNum;
                break;
            case "-":
                arabSumm = firstNum - secondNum;
                break;
            case "*":
                arabSumm = firstNum * secondNum;
                break;
            case "/":
                if (secondNum != 0){
                    arabSumm = firstNum / secondNum;
                } else {
                    System.out.println("Ошибка! Нельзя делить на ноль!");
                }
                break;
            default:
                System.out.println("Что-то пошло не так...");
        }
    }
}
