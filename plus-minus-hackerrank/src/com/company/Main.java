package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {


    public static void plusMinus(int[] arr){

        int len = arr.length;
        float positive = 0, negative = 0, zeros = 0;

        for (int i : arr) {
            if(i > 0){
                positive ++;
            }else if (i < 0){
                negative ++;
            }else zeros++;
        }

        if(positive > 0){
            System.out.printf("%1.6f", positive / len);
            System.out.println();
        }else System.out.println(positive);
        if (negative > 0){
            System.out.printf("%1.6f", negative / len);
            System.out.println();
        }else System.out.println(negative);
        if (zeros > 0){
            System.out.printf("%1.6f", zeros / len);
        }else System.out.println(zeros);

    }

    public static void main(String[] args) {
	// write your code here

        int[] arr = {-4, 3, -9, 0, 4, 1};

        plusMinus(arr);

    }
}
