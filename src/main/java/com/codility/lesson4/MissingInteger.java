package com.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] A){
        int size = A.length;
        if(size == 0) return 1;

        Set<Integer> integers = new HashSet<Integer>();

        for(int i = 0; i < size; i++){
            integers.add(A[i]);
        }

        for(int i = 1; i <= size ; i++){
            if(!integers.contains(i)) return i;
        }

        return  size + 1;
    }

    public static void main(String[] args) {
        MissingInteger mi = new MissingInteger();
        System.out.println(mi.solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(mi.solution(new int[]{1, 2, 3}));
        System.out.println(mi.solution(new int[]{-1, -3}));
        System.out.println(mi.solution(new int[]{2}));
        System.out.println(mi.solution(new int[]{1}));
    }
}
