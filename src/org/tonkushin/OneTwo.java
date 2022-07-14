package org.tonkushin;

import java.util.Scanner;

public class OneTwo {
    public static void solve() {
        System.out.println("Введите выражение:");
        Scanner in = new Scanner(System.in);
        String line = in.next();

        String[] arr = line.split("[/+]");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);

        int div = b * d;
        int sum = a * d + c * b;
        int n = nod(div, sum);

        System.out.printf("%d/%d%n", sum / n, div / n);
    }

    private static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }
}
