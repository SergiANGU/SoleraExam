package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    //[-6, -91, 1011, -100, 84, -22, 0, 1, 473]

    @Test
    void givenList_whenProcessed_thenReturnHighestmod3(){


        int[] numbers = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        int[] expected = {84,1011};
        //List<Integer> numbers = Stream.of(-6, -91, 1011, -100, 84, -22, 0, 1, 473).collect(Collectors.toList());

        int[] result = solution.fitlerNegativeAndNotDivisible3(numbers);

        Assertions.assertArrayEquals(expected,result);

    }

    @Test
    void givenTestArrayWhenProcesedReurn1011(){
        int[] numbers = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        int result = solution.solution(numbers);
        Assertions.assertEquals(result, 1011);
    }

    @Test
    void givenTestArrayWhenProcesedReurn3(){
        int[] numbers = {3,3};
        int result = solution.solution(numbers);
        Assertions.assertEquals(result, 3);
    }

}