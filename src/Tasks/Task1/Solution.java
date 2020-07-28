package Tasks.Task1;

// 1. Найдите значение функции: z = ((a - 3) * b / 2) + c.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {

        // 1. Объявление переменных.
        int a;
        int b;
        int c;
        double result;

        /* 2. Создание буферизированного потока чтения,
        что бы пользователь смог сам внести значения переменных.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 3. Выод сообщения пользователю, с просьбой ввести значения для переменных: а, b и c.
        // После чего происходит инициализация переменных.
        String textMassage = "Введите значение переменной ";

        System.out.print(textMassage + "a: ");
        a = getVar(reader);

        System.out.print(textMassage + "b: ");
        b = getVar(reader);

        System.out.print(textMassage + "c: ");
        c = getVar(reader);

        // 4. Закрытие буферизированного потока чтения.
        reader.close();

        // 5. Вычисление значения по функции, указаной в условии задачи
        result = ((a - 3) * (double) b / 2) + c;

        // 6. Вывод значения функции в консоль.
        System.out.println();
        System.out.println("Значение функции: " + result);

    }

    // метод получает с консоли значение, преобразует его в число и возвращет.
    public static int getVar(BufferedReader reader) throws IOException {

        return Integer.parseInt(reader.readLine());

    }

}
