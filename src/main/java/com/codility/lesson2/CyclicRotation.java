package com.codility.lesson2;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K){
        int size = A.length;

        if(K == 0 || size <= 1 || K % size == 0 ) return A;
        int n = K % size;
        int[] arr = new int[size];

        System.arraycopy(A,0,arr, n, Math.abs(size - n));
        System.arraycopy(A, Math.abs(size - n)  , arr, 0, n);

        return arr;
    }

    public static void main(String[] args) {
        CyclicRotation cr = new CyclicRotation();
        System.out.println(Arrays.toString(cr.solution(new int[]{3, 8, 9, 7, 6}, 3)));
        System.out.println(Arrays.toString(cr.solution(new int[]{1, 0, 0, 0}, 5)));
        System.out.println(Arrays.toString(cr.solution(new int[]{1, 0, 0}, 5)));
        System.out.println(Arrays.toString(cr.solution(new int[]{1, 0}, 1)));
        System.out.println(Arrays.toString(cr.solution(new int[]{1}, 5)));
        System.out.println(Arrays.toString(cr.solution(new int[]{}, 5)));
    }
}
