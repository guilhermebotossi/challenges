package com.codility.lesson3;

public class TapeEquilibrium {
    public int solution(int[] A) {
        if(A.length == 2)
            return Math.abs(A[0] - A[1]);
        long lowCut = A[0];
        long highCut = sumOfElements(A,1,A.length-1);
        long lowestDiff = Math.abs( lowCut - highCut);

        for(int i = 1; i <= A.length - 2; i++){
            if(lowestDiff == 0) break;
            lowCut += A[i];
            highCut -= A[i];
            lowestDiff = Math.min(Math.abs(lowCut-highCut), lowestDiff);
        }
        return (int)lowestDiff;
    }

    private long sumOfElements(int[] arr, int from, int to) {
        long sum = 0;
        for(int i = from; i<= to; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        TapeEquilibrium te = new TapeEquilibrium();
        System.out.println(te.solution(new int[]{3, 1}));
        System.out.println(te.solution(new int[]{3, 1, 2, 3, 4}));
    }


}
