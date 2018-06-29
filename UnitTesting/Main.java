package com.company;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Random;



public class Main {
    @Test
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(unitTest.class);
        for (Failure failure : result .getFailures()){

            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }


    public static int findTheSquare(int number){
        int squareResult = (int) Math.pow(number, 2);
        return squareResult;

    }
}
class randInput{//generate the random input
    synchronized public int randGen(){
        Random rand = new Random();
        int x = rand.nextInt((100 - 0) + 1) + 0;
        return x;
    }
}

class oracle {
    public static int expectedResult(int num){

        int final_result = (int)Math.pow(num, 2);
        return final_result;
    }
}

