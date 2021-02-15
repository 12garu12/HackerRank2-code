package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static String timeConversion(String s) {
        String meridiem = s.substring(s.length() - 2, s.length());
        String time = s.substring(0, s.length() - 2);

        if (meridiem.equals("AM")){
            if (time.substring(0,2).equals("12")){
                return "00:" + time.substring(3, time.length());
            }else return time;

        }else {
            if (time.substring(0,2).equals("12")){
                return time;
            }else {
                Integer hour = Integer.parseInt(time.substring(0, 2));
                return (12 + hour) + ":" + time.substring(3, time.length());
            }
        }
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(timeConversion("12:45:54PM"));


    }
}
