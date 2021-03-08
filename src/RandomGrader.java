/*
Jake Johnson
RandomGrader lab
26 Feb 2021

I run through it a few times to get my score as it isn't always perfect. Usually ends up between 24 and 30 for final score.
 */

import java.util.Arrays;

public class RandomGrader {

    public static void main(String[] args) {

        int totalScore = 0;

        //For method 1 I am taking the total results in a % and making sure it isnt swayed one way or the other (over 55% for one number)
        int [] array1 = new int[2];
        Arrays.fill(array1, 0);

        //running 1000 times
        for(int i = 0; i<=1000; ++i){
            array1[MethodForRandom.method1()]++;
        }
        if (MethodForRandom.testMethod(array1) > 55){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method1 Passed");
            totalScore  = totalScore + 3;
        }

        //Method 2 is similar to one but instead of 55% limit I'm going with 2.5%
        int [] array2 = new int[100];
        Arrays.fill(array2, 0);

        //running 1000 times
        for(int i = 0; i<=1000; ++i){
            array2[MethodForRandom.method2()]++;
        }

        //if any number shows up more than 2.5% it fails.
        if (MethodForRandom.testMethod(array2) > 2.5){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method2 Passed");
            totalScore  = totalScore + 3;
        }

        //Same as above but 13.5%
        int [] array3 = new int[9];
        Arrays.fill(array3, 0);

        //running 1000 times
        for(int i = 0; i<=1000; ++i){
            array3[MethodForRandom.method3()]++;
        }

        //if any number shows up more than 13.5% it fails.
        if (MethodForRandom.testMethod(array3) > 13.5){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method3 Passed");
            totalScore  = totalScore + 3;
        }

        //method 4 is same as above but lower percentage (12%)
        int [] array4 = new int[112];
        Arrays.fill(array4, 0);

        //running 1000 times
        for(int i = 0; i<=1000; ++i){

            //minus 1000 from the number to get the right index.
            array4[MethodForRandom.method4() - 1000]++;
        }

        //if any number shows up more than 12% it fails.
        if (MethodForRandom.testMethod(array4) > 12){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method4 Passed");
            totalScore  = totalScore + 3;
        }

        int [] array5 = new int[3];
        Arrays.fill(array5, 0);

        //running 1000 times
        for(int i = 0; i<=1000; ++i){
            //add 1 to get the right index
            array5[MethodForRandom.method5()+1]++;
        }

        //if any number shows up more than 40% it fails.
        if (MethodForRandom.testMethod(array5) > 40){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method5 Passed");
            totalScore  = totalScore + 3;
        }

        int [] array6 = new int[14];
        Arrays.fill(array6, 0);

        //running 1000 times
        for(int i = 0; i<=1000; ++i){
            //add 3 to get the right index
            array6[MethodForRandom.method6()+3]++;
        }

        //if any number shows up more than 16% it fails.
        if (MethodForRandom.testMethod(array6) > 16){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method6 Passed");
            totalScore  = totalScore + 3;
        }

        int [] array7 = new int[11];
        Arrays.fill(array7, 0);

        //running 1000 times
        for(int i = 0; i<=1000; ++i){
            array7[MethodForRandom.method7()]++;
        }

        //if any number shows up more than 22% it fails.
        if (MethodForRandom.testMethod(array7) > 22){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method7 Passed");
            totalScore  = totalScore + 3;
        }

        int [] array8 = new int[11];
        Arrays.fill(array8, 0);

        //running 100 times
        for(int i = 0; i<=100; ++i){
            array8[MethodForRandom.method8()]++;
        }

        //if any number shows up more than 25% it fails.
        if (MethodForRandom.testMethod(array8) > 25){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method8 Passed");
            totalScore  = totalScore + 3;
        }

        int count6 = 0;
        int count10 = 0;
        int count14 = 0;
        int count18 = 0;
        int count22 = 0;
        //running 100 times
        for (int i = 0; i < 100; i++){

            //it only generates 1 - 5 on the backend, I have it set so that 1 - 5 correlates to one of the numbers below
            if (MethodForRandom.method9() == 6){
                count6++;
            } else if (MethodForRandom.method9() == 10){
                count10++;
            } else if (MethodForRandom.method9() == 14){
                count14++;
            } else if (MethodForRandom.method9() == 18){
                count18++;
            } else if (MethodForRandom.method9() == 22){
                count22++;
            }
        }

        //if any number shows up more than 25% it fails.
        if (count6 > 25 || count10 > 25 || count14 > 25 || count18 > 25 || count22 > 25){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method9 Passed");
            totalScore  = totalScore + 3;
        }

        int countNeg6 = 0;
        int countNeg10 = 0;
        int countNeg14 = 0;
        int countNeg18 = 0;
        int countNeg22 = 0;
        //running 100 times
        for (int i = 0; i < 100; i++){

            //it only generates 1 - 5 on the backend, I have it set so that 1 - 5 correlates to one of the numbers below
            if (MethodForRandom.method10() == -6){
                countNeg6++;
            } else if (MethodForRandom.method10() == -10){
                countNeg10++;
            } else if (MethodForRandom.method10() == -14){
                countNeg14++;
            } else if (MethodForRandom.method10() == -18){
                countNeg18++;
            } else if (MethodForRandom.method10() == -22){
                countNeg22++;
            }
        }

        //if any number shows up more than 25% it fails.
        if (countNeg6 > 25 || countNeg10 > 25 || countNeg14 > 25 || countNeg18 > 25 || countNeg22 > 25){
            System.out.println("A number was too common");
        } else {
            System.out.println("Method10 Passed");
            totalScore  = totalScore + 3;
        }

        System.out.println("total = " + totalScore + " out of 30");

    }

}
