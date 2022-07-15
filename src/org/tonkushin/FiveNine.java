package org.tonkushin;

import java.util.Scanner;

public class FiveNine {
    public static void solve() {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        long f55, f59, f95, f99;
        long n55, n59, n95, n99;
        long sum;

        if (n == 1) {
            sum = 2;
        } else {
            f55 = 1;
            f59 = 1;
            f95 = 1;
            f99 = 1;
            for (int k = 3; k <= n; k++) {
                n55 = f59;
                n59 = f95 + f99;
                n95 = f55 + f59;
                n99 = f95;

                f55 = n55;
                f59 = n59;
                f95 = n95;
                f99 = n99;
            }
            sum = f55 + f59 + f95 + f99;
        }

        System.out.println(sum);
    }
}
