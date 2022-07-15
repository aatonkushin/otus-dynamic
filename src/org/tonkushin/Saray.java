package org.tonkushin;

import java.util.Scanner;

public class Saray {
    private static int N;   // ширина поля
    private static int M;   // высота поля

    private static int[][] map;             // поле

    private static int mainMaxSquare = 0;   // максимальная площадь

    public static void solve() {
        Scanner in = new Scanner(System.in);

        String[] line = in.nextLine().trim().split(" ");
        N = Integer.parseInt(line[0]);
        M = Integer.parseInt(line[1]);

        map = new int[N][M];

        for (int m = 0; m < M; m++) {
            line = in.nextLine().trim().split(" ");
            for (int n = 0; n < N; n++) {
                map[n][m] = Integer.parseInt(line[n]);
            }
        }

        // calc
        for (int m = 0; m < M; m++) {
            for (int n = 0; n < N; n++) {
                findMaxSquare(n, m);
            }
        }

        System.out.println(mainMaxSquare);
    }

    private static void findMaxSquare(int n, int m) {
        int lengthM = 1;                            // сдвиг по высоте
        int limitLength = findWayLength(n, m);      // ограничение сдвига по ширине
        int maxSquare = lengthM * limitLength;      // площадь, найденная на данный момент


        for (int mi = m + 1; mi < M; mi++) {
            lengthM++;
            int lengthN = findWayLength(n, mi);

            if (limitLength > lengthN) {
                limitLength = lengthN;
            }

            if (lengthN > limitLength) {
                lengthN = limitLength;
            }

            if (maxSquare < lengthM * lengthN) {
                maxSquare = lengthM * lengthN;
            }
        }

        if (mainMaxSquare < maxSquare) {
            mainMaxSquare = maxSquare;
        }
    }

    // Подсчёт длины вправо
    private static int findWayLength(int n, int m) {
        int wayLength = 0;
        while (n < N) {
            if (map[n][m] == 1) break;

            wayLength++;
            n++;
        }

        return wayLength;
    }
}
