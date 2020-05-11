package com.codility.lesson4;

public class FrogRiverOne {
    public int solution(int X, int[] A){
        int[] arr = new int[X + 1];
        int qtd = 0;
        for (int i = 0; i < A.length; i++){
            int val = A[i];
            if(val <= X && arr[val] == 0){
                arr[val] = val;
                qtd++;
            }

            if(qtd == X) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FrogRiverOne fro = new FrogRiverOne();
        System.out.println(fro.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        System.out.println(fro.solution(1, new int[]{1}));
        System.out.println(fro.solution(2, new int[]{2, 2, 2, 2, 2}));
    }
}
