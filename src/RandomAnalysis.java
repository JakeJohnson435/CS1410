//Test of how good a random number generator is
//ICE created 2-7-19
//Edited : 3-5-20
//Edited : 2-18-21
//-Dr. G

import java.security.SecureRandom;
import java.util.Arrays;

//What's the difference in SecureRandom and Math Random?
//How can we figure out how SecureRandom works?
//In a random number generator each number should occur how often?

public class RandomAnalysis
{
    public static void main(String [] args)
    {
        //1. Create a secure random object

        SecureRandom sec = new SecureRandom();

        //2. Create an int array of 100 values and initialize them all to 0s using the fill method from java.util.Arrays

        int [] array = new int[100];
        Arrays.fill(array, 0);

        //3. Create a for loop that goes from 0 to the maximum integer value possible
        //hint: Look up the java class "Integer"

        for(int i = 0; i<=1000; ++i){
            array[sec.nextInt(100)]++;
        }

        //4. Generate random numbers from 0 - 99 in the previously created for loop and use
        //the array to count the number of time each number occurs.
	
        /*
        With integer max it may take too long. Start with 100 times and increase watch what happens the more
        random numbers are generated.
        */

        //array[0] -> how many times 0 occurs
        //array[1] -> how many times 1 occurs
        //...
        //hint: you'll need an incrementor and a creative way of using the array index

        //5.
        //One aspect of a good random number generator is that each number is equally likely to occur.
        //With 100 values each number should occur what percent of the time?
        //Use an enhanced for loop to print out your results doing a simple math calculation
        //to show the percentage of times each number appears.

        for(int i = 0; i<array.length ; i++){
            System.out.println(i+1 + " " + (double)array[i]/100.00*10 + "%");
        }

    }
}