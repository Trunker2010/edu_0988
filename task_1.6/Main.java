/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double in = scanner.nextDouble();
        double result = (in * 0.15) + in;
        System.out.println(result);
    }
}
