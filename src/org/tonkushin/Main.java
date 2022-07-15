package org.tonkushin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи на динамическое программирование:");
        System.out.println("Выберите задачу:");
        System.out.println("1. Раз/два горох");
        System.out.println("2. Цифровая ёлочка");
        System.out.println("3. Пятью девять");
        System.out.println("4. Острова");
        System.out.println("5. Маленький сарай");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch (num) {
            case 1:
                OneTwo.solve();
                break;
            case 2:
                DigitalChristmasTree.solve();
                break;
            case 3:
                FiveNine.solve();
                break;
            case 4:
                Islands.solve();
                break;
            case 5:
                Saray.solve();
                break;
        }
    }
}