package com.company;

public class Main {

    static void staircase(int n) {
        String space = "";
        String alm = "#";
        int nspaces = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nspaces ; j++) {
                space += " ";
            }
            for (int j = 0; j < n - nspaces; j++) {
                space += alm;
            }
            nspaces--;
            System.out.println(space);
            space = "";
        }

    }

    public static void main(String[] args) {
	// write your code here

        staircase(4);


    }
}
