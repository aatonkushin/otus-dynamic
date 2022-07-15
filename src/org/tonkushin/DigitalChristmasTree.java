package org.tonkushin;

import java.util.Scanner;

public class DigitalChristmasTree {
    public static void solve() {
        Scanner in = new Scanner(System.in);

        int i, j;

        System.out.println("Введите высоту ёлочки:");
        int n = Integer.parseInt(in.nextLine());
        int[][] elka = new int[n][n];

        for (i = 0; i < n; i++) {
            String[] line = in.nextLine().trim().split(" ");
            for (j = 0; j <= i; j++) {
                elka[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (i = n - 2; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                int a = elka[i + 1][j];
                int b = elka[i + 1][j + 1];
                elka[i][j] += (a > b) ? a : b;
            }
        }

        System.out.println(elka[0][0]);
    }
}
