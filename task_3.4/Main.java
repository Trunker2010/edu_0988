/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(fun(10,10));
        System.out.println(fun(4,6));
    }

    static boolean fun(int a, int b) {
        return a + b == 10;
    }
}
