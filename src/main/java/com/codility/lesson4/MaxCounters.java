package com.codility.lesson4;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A){
        long inicio = System.nanoTime();
        int[] counters = new int[N];
        int maxValue = 0;
        int val = 0;

        for(int i = 0; i < A.length - 1; i++) {
            val = A[i];
            if(val <= N){
                maxValue = Math.max(maxValue, counters[val-1]+=1);
            } else if(A[i + 1] <= N){
                if (maxValue > 0) {
                    Arrays.fill(counters, maxValue);
                }
            } else { i++; }
        }

        val = A[A.length - 1];
        if(val <= N){
            ++counters[val-1];
        } else if (maxValue > 0) {
                Arrays.fill(counters, maxValue);
        }

        System.out.println(System.nanoTime() - inicio);
        return counters;
    }

    public int[] solution1(int N, int[] A){
        long inicio = System.nanoTime();
        int[] counters = new int[N];
        int maxValue = 0;

        for(int val : A) {
            if(val <= N){
                maxValue = Math.max(maxValue, ++counters[val-1]);
            } else if (maxValue > 0)
                Arrays.fill(counters, maxValue);
        }
        System.out.println(System.nanoTime() - inicio);
        return counters;
    }


    public static void main(String[] args) {
        MaxCounters mc = new MaxCounters();
        System.out.println(Arrays.toString(mc.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        int[] ints = {3, 4, 4, 6, 1, 4, 4, 6, 3, 4, 6, 4, 6, 1, 6, 4, 4, 6, 6, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 4, 3, 6, 4, 6, 4, 6, 1, 4, 4, 6, 3, 4, 4, 6, 1, 4, 4, 6, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4, 6, 3, 4, 6, 4, 6, 1, 6, 4, 4, 6, 6, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 4, 3, 6, 4, 6, 4, 6, 1, 4, 4, 6, 3, 4, 4, 6, 1, 4, 4, 6, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4, 3, 4, 4, 6, 1, 4, 4};
        System.out.println(Arrays.toString(mc.solution(5, ints)));
        System.out.println(Arrays.toString(mc.solution2(5, ints)));
        System.out.println(Arrays.toString(mc.solution1(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        System.out.println(Arrays.toString(mc.solution2(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        System.out.println(Arrays.toString(mc.solution(1, new int[]{2, 1, 1, 2, 1})));
        System.out.println(Arrays.toString(mc.solution1(1, new int[]{2, 1, 1, 2, 1})));

    }

    public int[] solution2(int N, int[] A) {
        long inicio = System.nanoTime();
        int MAX = 0, B = 0, CI;
        int[] C = new int[N];

        for(int i = 0; i < A.length; i++)
        {
            CI = A[i]-1;
            if(A[i] <= N && A[i] >= 1)
            {
                C[CI] = Math.max(B,C[CI]) + 1;
                MAX = Math.max(MAX,C[CI]);
            }else if(A[i] == N + 1)
            {
                B = MAX;
            }
        }

        for(int i = 0; i < C.length; i++)
            C[i] = Math.max(C[i],B);
        System.out.println(System.nanoTime() - inicio);
        return C;
    }
}
