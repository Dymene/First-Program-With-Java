package com.exg1o;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = scan.nextInt();
            System.out.print("Что вы хотите сделать с числами? [-, +, *, /]: ");
            String text = scan.next();
            int result = 0;
            boolean true_value = false;
            switch (text) {
                case "-":
                    true_value = true;
                    result = num1 - num2;
                    break;
                case "+":
                    true_value = true;
                    result = num1 + num2;
                    break;
                case "*":
                    true_value = true;
                    result = num1 * num2;
                    break;
                case "/":
                    true_value = true;
                    result = num1 / num2;
                    break;
            }
            if (true_value) {
                String result_text = Integer.toString(result);
                System.out.println("Результат: " + result_text + "\n");
            } else {
                System.out.println("Вы ввели неверную действие для чисел!\n");
            }
        }
    }
}