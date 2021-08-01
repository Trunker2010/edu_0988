/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/

public class Main {
    public static void main(String[] args) {
        System.out.print( fun(12,11));
    }

    static boolean fun(int a, int b) {
        return a == b;
    }
}
