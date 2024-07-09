package ru.ac.uniyar.derzhavin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите: ");
        String str  = in.nextLine();
        String[] parts = str.split(" ");

        /*
        System.out.println("Частей: " + parts.length);
        System.out.println("Первая: " + parts[0]);
        System.out.println("Вторая: " + parts[1]);
        System.out.println("Третья: " + parts[2]);
        */

        int firstNum = Integer.parseInt(parts[0]);
        int secondNum = Integer.parseInt(parts[2]);
        int answer;

        switch (parts[1]) {
            case "+":
                answer = firstNum + secondNum;
                System.out.println(answer);
                break;
            case "-":
                answer = firstNum - secondNum;
                System.out.println(answer);
                break;
            case "*":
                answer = firstNum * secondNum;
                System.out.println(answer);
                break;
            case "/":
                if (secondNum == 0) {
                    System.out.println("Ошибка, деелние на 0!");
                    break;
                } else {
                    answer = firstNum / secondNum;
                    System.out.println(answer);
                    break;
                }
            default:
                System.out.println("Неправильный ввод!");
        }
    }
}