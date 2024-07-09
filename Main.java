package ru.ac.uniyar.derzhavin;
import java.util.Scanner;

public class Main {
    public static Double stringToDouble(String num1) {
        String[] parts2 = num1.split("/");
        if (parts2.length == 1) {
            int number = Integer.parseInt(num1);
            return (double) number;
        }
        else {
            int numerator = Integer.parseInt(parts2[0]);
            int denominator = Integer.parseInt(parts2[1]);
            if (denominator != 0) {
                return (double) numerator / denominator;
            }
            else {
                System.out.println("0 в знаменатели дроби!");
                return (double) 0;
            }
        }
    }


    public static void calculate(double fNum, double sNum, String operation) {
        double answer;
        switch (operation) {
            case "+": {
                answer = fNum + sNum;
                System.out.println(answer);
                break;
            }
            case "-": {
                answer = fNum - sNum;
                System.out.println(answer);
                break;
            }
            case "*": {
                answer = fNum * sNum;
                System.out.println(answer);
                break;
            }
            case "/": {
                if (sNum == (double) 0) {
                    System.out.println("Ошибка, деление на 0!");
                    break;
                } else {
                    answer = fNum / sNum;
                    System.out.println(answer);
                    break;
                }
            }
            default: {
                System.out.println("Неправильный ввод!");
            }
        }
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите: ");
        String str  = in.nextLine();
        String[] parts = str.split(" ");
        String operand1 = parts[0];
        String operand2 = parts[2];

        double firstNum = stringToDouble(operand1);
        double secondNum = stringToDouble(operand2);
        String operation = parts[1];

        calculate(firstNum, secondNum, operation);
    }
}