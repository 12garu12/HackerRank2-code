package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long resultMin = 0;
        long resultMax = 0;
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            resultMin += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            resultMax += arr[i];
        }
        System.out.println(resultMin + " " + resultMax);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();

    }
}
