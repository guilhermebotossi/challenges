package com.codility.lesson5;

public class PassingCars {

    public int solution(int[] A) {
        int pairs = 0;
        int counter = 0;
        int countZero= 0;
        for (int i = A.length-1; i>=0;i--){
            counter++;
            if (A[i]==0){
                countZero++;
                pairs += counter-countZero;
                if (pairs > 1000000000){
                    return -1;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        PassingCars pc = new PassingCars();
        System.out.println(pc.solution(new int[]{1, 1, 0, 1, 1}));
    }

}
