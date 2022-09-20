package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {


    public int solution(int[] A) {

        for (int i = 0; i<A.length; i++ ){
            System.out.println(A[i]);
        }

        int[] positivesDivisible3 = fitlerNegativeAndNotDivisible3(A);
        return positivesDivisible3[positivesDivisible3.length - 1];
    }



    public int[] fitlerNegativeAndNotDivisible3(int[] a) {

        return Arrays.stream(a)
                .filter(i -> i > 0)
                .filter(i -> i % 3 == 0)
                .filter(i -> i < 1001)
                .sorted().toArray();

    }

    public List<Integer> intArrayToList(int[] inputArray) {
        return Arrays.stream(inputArray).boxed().collect(Collectors.toList());
    }

}
