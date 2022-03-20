package com.company;

import com.company.Exceptions.IncorrectInputExceptions;
import com.company.Utils.CalculatorUtils;
import com.company.Utils.CalculatorUtilsImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculatorUtils calculatorUtils = new CalculatorUtilsImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение :");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

        if (inputArr.length != 3) {
            throw new IncorrectInputExceptions("Вы ввели неверное выражение : " + Arrays.toString(inputArr));
        }
        calculatorUtils.startCalculate(inputArr[0], inputArr[1], inputArr[2]);
    }
}
