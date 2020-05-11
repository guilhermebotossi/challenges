package com.codility.lesson2;

public class OddOccurrencesInArray {

    public int solution(int[] A){
        int result = 0;
        for(int i = 0 ; i < A.length; i++){
            result ^= A[i] ;
        }

        return result;
    }

    public static void main(String[] args) {
        OddOccurrencesInArray ooia = new OddOccurrencesInArray();
        System.out.println(ooia.solution(new int[]{1,2,3,4,5,6,7,6,5,4,3,2,1,8,8}));
    }

}
