package com.codility.lesson5;

import java.util.Arrays;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        char[] chars = S.toCharArray();
        int size = chars.length;
        int[][] arr = new int[3][size + 1];

        for (int i = 0; i < size; i++) {
            arr[0][i+1] = arr[0][i] + (chars[i] == 'A' ? 1 : 0);
            arr[1][i+1] = arr[1][i] + (chars[i] == 'C' ? 1 : 0);
            arr[2][i+1] = arr[2][i] + (chars[i] == 'G' ? 1 : 0);
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int fromIndex = P[i];
            int toIndex = Q[i]+1;
            if (arr[0][toIndex] - arr[0][fromIndex] > 0) {
                result[i] = 1;
            } else if (arr[1][toIndex] - arr[1][fromIndex] > 0) {
                result[i] = 2;
            } else if (arr[2][toIndex] - arr[2][fromIndex] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        GenomicRangeQuery grq = new GenomicRangeQuery();
        System.out.println(Arrays.toString(grq.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(grq.solution("A", new int[]{0}, new int[]{0})));
    }
}
