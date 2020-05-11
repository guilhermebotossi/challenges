package com.codility.lesson3;

public class PermMissingElem {

    public int solution(int[] A) {
        long arraySum = 0;
        for(int i = 0; i< A.length; i++)
            arraySum+=A[i];

        int n = A.length + 1;
        long sumOfAllElements = (n * (1 + n)) / 2;
        return (int) (sumOfAllElements - arraySum);
    }

    public static void main(String[] args) {
        PermMissingElem pme = new PermMissingElem();
        System.out.println(pme.solution(new int[]{2, 3, 1, 5}));
        System.out.println(pme.solution(new int[]{2, 4, 1, 5, 6, 7, 8, 9, 10, 11}));
    }
}
