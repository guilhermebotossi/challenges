package com.codility.lesson1;

public class BinaryGap {

    public int solution(int N){
        char[] digits = Integer.toBinaryString(N).toCharArray();
        int maxBinaryGapSize = 0;
        int currentGapSize = 0;

        for(int i = 0; i< digits.length; i++) {
            if(digits[i] == '0'){
                currentGapSize++;
            } else if(currentGapSize > 0){
                maxBinaryGapSize = Math.max(maxBinaryGapSize, currentGapSize);
                currentGapSize = 0;
            }
        }

        return maxBinaryGapSize;
    }

    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();

        System.out.println(bg.solution(1041));
        System.out.println(bg.solution(15));
        System.out.println(bg.solution(32));
        System.out.println(bg.solution(2137383647));
    }
}
