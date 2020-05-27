package com.codility.lesson5;

import org.junit.Assert;

public class CountDiv {
    public int solution(final int A, int B, int K){
        int result = (B / K) - (A / K);

        return A % K == 0 ? ++result : result;
    }

    public static void main(String[] args) {
        CountDiv cd = new CountDiv();
        Assert.assertEquals(3, cd.solution(6, 11, 2));
        Assert.assertEquals(999999999, cd.solution(1, 1999999999, 2));

    }


}
