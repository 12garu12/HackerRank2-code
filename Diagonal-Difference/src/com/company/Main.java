package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int len = arr.get(0).size(), sumDiagonalLeft = 0, sumDiagonalRight = 0;
        int j = len - 1;
        for (int i = 0; i < len; i++) {
                sumDiagonalLeft += arr.get(i).get(i);
                sumDiagonalRight += arr.get(i).get(j--);
        }
        return Math.abs(sumDiagonalLeft - sumDiagonalRight);
    }


    public static void main(String[] args) {
	// write your code here

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(4,5,6));
        arr.add(Arrays.asList(9,8,9));

        System.out.println(diagonalDifference(arr));

    }
}
