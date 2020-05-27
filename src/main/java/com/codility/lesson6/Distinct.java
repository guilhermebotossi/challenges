package com.codility.lesson6;

import java.util.*;

public class Distinct {
    public int solution(int[] A){
        Set<Integer> integerSet = new HashSet<>();

        for(int i = 0; i< A.length; i++){
            integerSet.add(A[i]);
        }

        return integerSet.size();
    }

    public int solution1(int[] A){
        return (int)Arrays.stream(A).distinct().count();
    }
}
