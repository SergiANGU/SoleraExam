package org.example;

import java.security.PublicKey;

public class Ejercicio2 {

    public int solution(int A, int B) {
        int result = multip(A, B);
        String binari = toBinari(result);
        int numOneCounter = numCounter(binari);
        return numOneCounter;
    }

    public int multip(int A, int B) {
        return A*B;
    }


    public String toBinari(int num){

        return Integer.toBinaryString(num);
    }

    public int numCounter(String binari){
        int result = (int) binari.chars().mapToObj(i -> (char)(i)).filter(i-> i=='1').count();
        return result;
    }


}
