package org.tonkushin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи на динамическое программирование:");
        System.out.println("Выберите задачу:");
        System.out.println("1. Раз/два горох");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 1) {
            OneTwo.solve();
        }
    }
}