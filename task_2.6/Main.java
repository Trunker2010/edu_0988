/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int result = a % b;
        if (result == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Делится с остатком: " + result);
        }
    }
}
