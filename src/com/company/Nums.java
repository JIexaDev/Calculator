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

    public int getArabSumm() {
        return arabSumm;
    }

    public String getFirst(){
        return first;
    }

    public String getSecond() {
        return second;
    }

    /**Получает из String с числом - int число и проверяет на корректность ввода */
    public int getArabFirst() {
        int intFirst = 0;
        try {
            intFirst = Integer.parseInt(first);
            if (intFirst < 1 || intFirst > 10){
                error();
            }
        }
        catch (Exception ex){
            error();
        }
        return intFirst;
    }

    /**Получает из String с числом - int число и проверяет на корректность ввода */
    public int getArabSecond() {
        int intSecond = 0;
        try {
            intSecond = Integer.parseInt(second);
            if (intSecond < 1 || intSecond > 10){
                error();
            }
        }
        catch (Exception ex){
            error();
        }
        return intSecond;
    }

    /**Вывод сообщения об ошибке и завершение программы */
    private void error(){
        System.out.println("Ошибка! Введите корректное выражение!");
        System.exit(0);
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
        if (orderOfSign == 0){                                        //Проверка на корректно введенный знак выражения
            System.out.println("Ошибка! Введите корректное выражение!");
            System.exit(0);
        }
    }

    /**Метод, извлекающий числа из строки выражения */
    public void findNums(int orderOfSign, String input){
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
