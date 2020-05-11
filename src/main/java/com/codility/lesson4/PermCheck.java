package com.codility.lesson4;

import java.util.HashSet;

public class PermCheck {

    public int solution(int[] A){
        int maxValue = 0;
        int arraySum = 0;

        HashSet<Integer> numbers = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            int val = A[i];
            if(!numbers.contains(val)) {
                maxValue = Math.max(maxValue, val);
                arraySum += val;
                numbers.add(val);
            } else {
                return 0;
            }
        }

        int maxValueSum = (maxValue * (maxValue + 1)) /2;

        return maxValueSum == arraySum ? 1 : 0;
    }

    public static void main(String[] args) {
        PermCheck pc = new PermCheck();
        System.out.println(pc.solution(new int[]{4, 1, 3, 2}));
        System.out.println(pc.solution(new int[]{4, 1, 3}));
        System.out.println(pc.solution(new int[]{9, 5, 7, 3, 2, 7, 3, 1, 10, 8}));
        System.out.println(pc.solution(new int[]{1, 1}));
    }
}
