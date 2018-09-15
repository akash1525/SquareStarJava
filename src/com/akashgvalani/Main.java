package com.akashgvalani;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter rowCount");
        //int n = sc.nextInt();
        int n = 1;
        char sq[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sq[i][j] = ' ';
            }
            //System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i == j) // fill first row and last row
                    sq[i][j] = '*';
                if (j == 0 || j == n - 1) // fill first coulumn and last column
                    sq[i][j] = '*';
                if (j == (n - (i + 1)))
                    sq[i][j] = '*';         //col number = rowCount - current row  +  1

            }
        }
        //System.out.println(Arrays.deepToString(sq));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sq[i][j]);
            }
            System.out.println();
        }
    }
}
