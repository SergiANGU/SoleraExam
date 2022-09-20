package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {


    Ejercicio2 solution = new Ejercicio2();

    @Test
    void givedTwoNumbersReturnTheResult(){

        int a = 3, b=  7;
        int result = solution.multip(a, b);
        Assertions.assertEquals(21,result );

    }

    @Test
    void testSplit() {
        String binari = "010011101001";

        int result = (int) binari.chars().mapToObj(i -> (char)(i)).filter(i-> i=='1').count();

        Assertions.assertEquals(5,result);
    }

    @Test
    void globalTest(){
        int a = 3, b=  7;
        int result = solution.solution(a,b);
        System.out.println(result);

    }
}