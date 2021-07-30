/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double deposit = scanner.nextDouble();
        System.out.println("Введите процент вклада: ");
        double percent = scanner.nextDouble();
        
        for (int year = 1; year <= 5; year++) {
            deposit += (deposit / 100) * percent;
            System.out.println("Размер вклада за " + year + "-й год = " + deposit);
        }
    }
}
