package com.hackerrank.algorithms.warmup;

import java.util.*;

/*
    https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int fdig = 0;
        int sdig = 0;

        for(int i = 0 ; i < arr.size(); i++){
            fdig += arr.get(i).get(i);
        }

        for(int  j= 0, i = arr.size() - 1 ; i >= 0; i--, j++){
            sdig += arr.get(j).get(i);
        }

        return Math.abs(fdig - sdig);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(11, 2, 4));
        list.add(Arrays.asList(4, 5, 6));
        list.add(Arrays.asList(10, 8, -12));

        System.out.println(DiagonalDifference.diagonalDifference(list));

        list.clear();

        list.add(Arrays.asList(11));

        System.out.println(DiagonalDifference.diagonalDifference(list));
    }
}
