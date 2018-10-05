package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imput length of matrix : ");
        n = scanner.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n)
    {
        Random random = new Random();
        int a[][] = new int[n][n];
        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j < n ; j++)
            {
                a[i][j] = random.nextInt(2);
            }
        }
        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j < n ; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
