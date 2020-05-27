package com.codility.lesson5;

public class MinAvgTwoSlice {

    public int solution(int[] A){
        double minAverage = getAverage(A[0], A[1]);
        int minAveragePosition = 0;
        double avg = 0;

        for(int i = 1; i < A . length - 2; i++){
            avg = getAverage(A[i], A[i+1]);
            if(avg < minAverage){
                minAverage = avg;
                minAveragePosition = i;
            }

            avg = getAverage(A[i], A[i+1], A[i+2]);
            if(avg < minAverage){
                minAverage = avg;
                minAveragePosition = i;
            }
        }

        double avgTwoSlice = getAverage(A[A.length - 1], A[A.length - 2]);
        if(avgTwoSlice < minAverage){
            minAveragePosition = A.length -2;
        }
        return minAveragePosition;
    }

    private double getAverage(int...arr) {
        if(arr.length == 2) {
            return (arr[0] + arr[1]) / 2D;
        } else{
            return (arr[0] + arr[1] + arr[2]) / 3D;
        }
    }

    public static void main(String[] args) {
        MinAvgTwoSlice mats = new MinAvgTwoSlice();
        System.out.println(mats.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
}
