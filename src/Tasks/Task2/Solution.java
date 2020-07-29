package Tasks.Task2;

// 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Solution {

    public static void main(String[] args) throws IOException {

        // 1. Объявление переменных типа double, так как в задаче идет речь о действительных числах.
        double a;
        double b;
        double c;
        double result;

        /* 2. Создание буферизированного потока чтения,
        что бы пользователь смог сам внести значения переменных.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 3. Выод сообщения пользователю, с просьбой ввести значения для переменных: а, b и c.
        // После чего происходит инициализация переменных.
        String textMassage = "Введите действительное число для переменной ";

        System.out.print(textMassage + "a: ");
        a = getNumber(reader);

        System.out.print(textMassage + "b: ");
        b = getNumber(reader);

        System.out.print(textMassage + "c: ");
        c = getNumber(reader);

        // 4. Закрытие буферизированного потока чтения.
        reader.close();

        // 5. Упрощение числителя к единому числу.
        double numerator = b + sqrt(pow(b, 2) + (4 * a * c));

        // 6. Упрощение знаменателя к единому числу.
        double denominator = 2 * a;

        // 7. Вычисление значения дробной части.
        double fractionResult = numerator / denominator;

        // 8. Вычисление итогового значения функции, которое требуеться в задаче.
        result = fractionResult - ((pow(a, 3) * c) + pow(b, -2));

        // 9. Вывод значения функции в консоль.
        System.out.println();
        System.out.println("Значение функции: " + result);

    }

    // метод получает с консоли значение, преобразует его в число и возвращет.
    public static double getNumber(BufferedReader reader) throws IOException {

        return Double.parseDouble(reader.readLine());

    }

}
