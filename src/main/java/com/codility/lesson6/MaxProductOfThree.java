package com.codility.lesson6;

import java.util.*;

public class MaxProductOfThree {

    public int solution(int[] A){
        if ( A.length == 3 ) {
            return A[0] * A[1] * A[2];
        }

        Arrays.sort(A);

        return Math.max(A[A.length - 1] * A[0] * A[1], A[A.length - 1] * A[A.length - 2] * A[A.length - 3]);
    }

    public static void main(String[] args) {
        MaxProductOfThree mpot = new MaxProductOfThree();
        System.out.println(mpot.solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }
}
