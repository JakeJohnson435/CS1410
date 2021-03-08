/**
 Jake Johnson
 Random Lab
 26/Feb/2021
 */

import java.security.SecureRandom;

public class MethodForRandom
{

    // return an integer in the range 1 <= n <= 2
    public static int method1(){
        SecureRandom sec = new SecureRandom();
        return sec.nextInt(2);
    }

    //return an integer in the range 1 <= n <= 100
    public static int method2(){
        SecureRandom sec = new SecureRandom();
        return sec.nextInt(100);
    }

    //return an integer in the range 0 <= n <= 9
    public static int method3(){
        SecureRandom sec = new SecureRandom();
        return sec.nextInt(9);
    }

    //return an integer in the range 1000 <= n <= 1112

    //generates between 0 and 112 then adds 1000
    public static int method4(){
        SecureRandom sec = new SecureRandom();
        return sec.nextInt(112) + 1000;
    }

    //return an integer in the range -1 <= n <= 1
    public static int method5(){
        SecureRandom sec = new SecureRandom();
        return sec.nextInt(3) -1;
    }

    //return an integer in the range -3 <= n <= 11

    //Generates a number between 0 and 14 then minuses 3.
    public static int method6(){
        SecureRandom sec = new SecureRandom();
        return sec.nextInt(14) -3;
    }

    //return an integer in the set 2,4,6,8,10

    //I have it run through and generate a number, if that number is even outputs it, if it is odd it reruns until even
    public static int method7(){
        int result;

        do {
            SecureRandom sec = new SecureRandom();
            result = sec.nextInt(9) +2;
        } while (result % 2 != 0);

        return result;
    }

    //return an integer in the set 3,5,7,9,11
    //I have it run through and generate a number, if that number is odd outputs it, if it is even it reruns until odd
    public static int method8(){
        int result;

        do {
            SecureRandom sec = new SecureRandom();
            result = sec.nextInt(9) +2;
        } while (result % 2 == 0);

        return result;
    }

    //return an integer in the set 6,10,14,18,22

    //generates 1 - 5 which correlates to one of the numbers required in the set.
    public static int method9(){


        SecureRandom sec = new SecureRandom();
        int temp = sec.nextInt(5);
        int result = 0;

        switch (temp){
            case 1:
                result = 6;
                break;
            case 2:
                result = 10;
                break;
            case 3:
                result = 14;
                break;
            case 4:
                result = 18;
                break;
            case 5:
                result = 22;
                break;
        }

        return result;

    }

    //return an integer in the set -22,-18,-14,-10,-6
    //generates 1 - 5 which correlates to one of the numbers required in the set.

    public static int method10(){
        SecureRandom sec = new SecureRandom();
        int temp = sec.nextInt(5);
        int result = 0;

        switch (temp){
            case 1:
                result = -6;
                break;
            case 2:
                result = -10;
                break;
            case 3:
                result = -14;
                break;
            case 4:
                result = -18;
                break;
            case 5:
                result = -22;
                break;
        }

        return result;
    }

    public static double testMethod(int[] array){

        double mostCommon = 0.0;
        for(int i = 0; i<array.length ; i++){

            if(((double)array[i]/100.00*10) > mostCommon){
                mostCommon = (double)array[i]/100.00*10;
            }
        }

        return mostCommon;
    }
}