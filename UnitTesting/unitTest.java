package com.company;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.company.Main.findTheSquare;

@RunWith(Parameterized.class)
public class unitTest extends TestCase {
    private static int num = 0;
    private static int square_result = 0;


    public unitTest(int num, int square_result){
        this.num = num;
        this.square_result = square_result;
    }

    @Parameterized.Parameters
    public static Collection  <Object[]>  num(){

        Object data[][] = new Object[20][2];

        randInput randNum = new randInput();

        for(int i = 0; i < 20 ; i++){
            num = randNum.randGen();
            data[i][0] = num;

            square_result = oracle.expectedResult(num);
            data[i][1] = square_result;


        }

        return Arrays.asList(data);

    }
    @Test
    public void square(){
        Assert.assertEquals(square_result, findTheSquare(num));
    }
}
