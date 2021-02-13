package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        List<Integer> listCandles = candles.stream().sorted().collect(Collectors.toList());
        int count = 0;
        int size = listCandles.size();
        for (int i = size - 1; i >= 0 ; i--) {
            int ultimate = listCandles.get(size - 1);
            if (ultimate == listCandles.get(i)){
                count++;
            }else break;
        }
        return count;
    }

    public static void main(String[] args) {
	// write your code here
        List<Integer> candles = new ArrayList<>();
        candles.addAll(Arrays.asList(4, 4, 1, 3));

        birthdayCakeCandles(candles);


    }
}
