package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        conclusion();

    }

    public static void conclusion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = fillWhithRandome(a, 0, 50);
        printArray(a);

        int min = task1_FindMinInArray(a);
        System.out.println(min);
        int max = task2_FindMaxInArray(a);
        System.out.println(max);
        int minIndex = task3_FindIndexMinElementArray(a);
        System.out.println(minIndex);
        int maxIndex = task4_FindIndexMaxElementArray(a);
        System.out.println(maxIndex);
        int sumUneven = task5_SumArrayElementsUnevenIndex(a);
        System.out.println(sumUneven);
        a = task6_reverse(a);
        printArray(a);
        int numUneven = task7_NumberUnevenArrayElements(a);
        System.out.println(numUneven);
        a = task8_SwapFirstAndSecondHalfArray(a);
        printArray(a);
        a = task9_SelectSortingIncreasing(a);
        printArray(a);
        a = task10_BubbleDescending(a);
        printArray(a);

    }

    public static int[] fillWhithRandome(int[] a, int start, int end) {
        for (int i = 0; i < a.length; i++) {
            Random rnd = new Random();
            a[i] = rnd.nextInt(end - start) + start;
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ", ");
        System.out.println();
    }

    public static int task1_FindMinInArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < min) {
                min = a[i];
            }
        return min;
    }

    public static int task2_FindMaxInArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) {
                max = a[i];
            }
        return max;
    }

    public static int task3_FindIndexMinElementArray(int[] a) {
        int min = a[0];
        int indexForMin = 0;
        for (int i = 0; i < a.length; i++) {
            int b = a[i];
            if (min > b) {
                min = b;
                indexForMin = i;
            }
        }
        return indexForMin;
    }

    public static int task4_FindIndexMaxElementArray(int[] a) {
        int max = a[0];
        int indexForMax = 0;
        for (int i = 0; i < a.length; i++) {
            int b = a[i];
            if (max < b) {
                max = b;
                indexForMax = i;
            }
        }
        return indexForMax;
    }

    public static int task5_SumArrayElementsUnevenIndex(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int[] task6_reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        return a;
    }

    public static int task7_NumberUnevenArrayElements(int[] a) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                num++;
            }
        }
        return num;
    }

    public static int[] task8_SwapFirstAndSecondHalfArray(int[] a) {
        int half = a.length % 2;
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length / 2 + i + half];
            a[a.length / 2 + i + half] = temp;

        }
        return a;
    }

    public static int[] task9_SelectSortingIncreasing(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int mini = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    mini = j;
                }
            }
            if (i != mini) {
                int temp = a[i];
                a[i] = a[mini];
                a[mini] = temp;
            }
        }
        return a;
    }

    public static int[] task10_BubbleDescending(int[] a) {
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < a.length - 1 - k; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        return a;
    }

}
