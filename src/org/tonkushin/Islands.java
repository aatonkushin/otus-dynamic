package org.tonkushin;

import java.util.Scanner;

public class Islands {
    public static void solve() {
        Scanner in = new Scanner(System.in);

        int i, j;
        int n = Integer.parseInt(in.nextLine());
        int[][] map = new int[n][n];

        for (i = 0; i < n; i++) {
            String[] line = in.nextLine().trim().split(" ");
            for (j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        int islands = 0;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    islands++;
                    walk(i, j, n, map);
                }
            }
        }

        System.out.println(islands);
    }

    private static void walk(int x, int y, int n, int[][] map) {
        if (x < 0 || x >= n) return;
        if (y < 0 || y >= n) return;
        if (map[x][y] == 0) return;

        map[x][y] = 0;
        walk(x - 1, y, n, map);
        walk(x + 1, y, n, map);
        walk(x, y - 1, n, map);
        walk(x, y + 1, n, map);
    }
}
