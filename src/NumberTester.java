/**
 *
 * Comment block 
 * Make sure to edit with your information
 * Make sure to add comments to each section explaining the purpose of your test
 * Each test should print the array being used to test and print pass or fail depending on the results
 *
 */
public class NumberTester {

    public static void main(String[] args) {
        //Call all your test methods here.
        //Call only the "test" methods.

        testFindIntegerMax();

        testAddAllPositiveIntsTogether();

        testGetTheIntAverage();

        testIsNegativeValue();
    }

    //This method will not be graded
    //This method will be demonstrated in class
    public static void testSimpleMethod() {

        System.out.println("Testing SimpleMethod()...");

        if (simpleMethod(7) == 7){
            System.out.println("This works! Test passed");
        } else {
            System.out.println("Something went wrong");
        }

    }

    //This method should return exactly what it was given
    //This method is not graded and will be demonstrated in class
    public static int simpleMethod(int i) {
        return i;
    }

    //I would like you to write 3 test cases to see if findIntegerMax is working correctly
    public static void testFindIntegerMax() {

        int[] maxArray = {1, 2, 3, 4, 5};
        int[] maxArray2 = {-1, 5, 6, 3};
        int[] maxArray3 = {-1, -2, -3};

        System.out.println("Testing findIntegerMax");

        printArray(maxArray);
        if (findIntegerMax(maxArray) ==  5){
            System.out.println("Test case 1 passed!");
        } else {
            System.out.println("Something went wrong.");
        }

        printArray(maxArray2);
        if (findIntegerMax(maxArray2) ==  6){
            System.out.println("Test case 2 passed!");
        } else {
            System.out.println("Something went wrong.");
        }

        printArray(maxArray3);
        if (findIntegerMax(maxArray3) ==  0){
            System.out.println("Test case 3 passed!");
        } else {
            System.out.println("Something went wrong.");
        }

    }

    //This method should take an array of integers and return the max array value
    //Implement it with an enhanced for loop and don't use a built in array method
    public static int findIntegerMax(int[] a) {

        //setting a default number for the max
        int max = 0;

        //looping through the array and finding the highest int by replacing the default 0 with whatever number is higher.
        for (int number : a){
            if (number > max){
                max = number;
            }
        }

        return max;
    }

    //I would like you to write 4 test cases that would test and make sure the addAllPositiveIntsTogether works correctly
    public static void testAddAllPositiveIntsTogether() {

        System.out.println("Testing addAllPositiveInts...");

        int[] arrayOne = {10, 5};
        int[] arrayTwo = {0, -1, -3};
        int[] arrayThree = {-1, 1, 2, 3};
        int[] arrayFour = {-5, 0, 5};

        printArray(arrayOne);
        if (addAllPositiveIntsTogether(arrayOne) == 15){
            System.out.println("Test Case 1 passed");
        } else {
            System.out.println("Something went wrong " + addAllPositiveIntsTogether(arrayOne));
        }

        printArray(arrayTwo);
        if (addAllPositiveIntsTogether(arrayTwo) == 0){
            System.out.println("Test Case 2 passed");
        } else {
            System.out.println("Something went wrong" + addAllPositiveIntsTogether(arrayTwo));
        }

        printArray(arrayThree);
        if (addAllPositiveIntsTogether(arrayThree) == 6){
            System.out.println("Test Case 3 passed");
        } else {
            System.out.println("Something went wrong");
        }

        printArray(arrayFour);
        if (addAllPositiveIntsTogether(arrayFour) == 5){
            System.out.println("Test Case 4 passed");
        } else {
            System.out.println("Something went wrong " + addAllPositiveIntsTogether(arrayFour));
        }

    }

    //This method should add up all the positive numbers in the given array
    public static long addAllPositiveIntsTogether(int[] a) {

        //setting default int
        int total = 0;

        //looping through the array, checking to see if the int at i is greater than 0,
        //therefor positive, if it is, the int gets added to the total
        for (int i = 0; i <= a.length-1; i++){
            if (a[i] > 0){
                total = total + a[i];
            }
        }
        return total;
    }

    //I would like you to write 5 test cases that would test and make sure the GetTheIntAverage method works correctly.
    //You cannot use any number that starts with 3 in your test cases
    public static void testGetTheIntAverage() {

        int[] averageOne = {1, 2, 13, 4, 5};
        int[] averageTwo = {1, 13, 5, 7, 9};
        int[] averageThree = {-1, -2, -13, -4, -5};
        int[] averageFour = {1, 1, 1, 1, 1};
        int[] averageFive = {-2, -1, 0, 1, 2};

        System.out.println("Testing getTheAverage...");

        printArray(averageOne);
        if (GetTheIntAverage(averageOne) == 5){
            System.out.println("Test case 1 passed!");
        } else {
            System.out.println("Something went wrong.");
        }

        printArray(averageTwo);
        if (GetTheIntAverage(averageTwo) == 7){
            System.out.println("Test case 2 passed!");
        } else {
            System.out.println("Something went wrong.");
        }

        printArray(averageThree);
        if (GetTheIntAverage(averageThree) == -5){
            System.out.println("Test case 3 passed!");
        } else {
            System.out.println("Something went wrong.");
        }

        printArray(averageFour);
        if (GetTheIntAverage(averageFour) == 1){
            System.out.println("Test case 4 passed!");
        } else {
            System.out.println("Something went wrong.");
        }

        printArray(averageFive);
        if (GetTheIntAverage(averageFive) == 0){
            System.out.println("Test case 5 passed!");
        } else {
            System.out.println("Something went wrong.");
        }

    }

    //This method should return the int value average for all values in the int array sent to it
    public static int GetTheIntAverage(int[] a) {

        //setting the default int
        int total = 0;

        //looping through to add all the ints in the array to the total
        for (int i = 0; i < a.length; i++){
            total = total + a[i];
        }

        //dividing the total by the length of the array to get the average
        int average = total / a.length;

        return average;
    }

    //I would like you to write 6 test cases that would test and make sure the IsNegativeValue method works correctly.
    public static void testIsNegativeValue() {

        int[] arrayOne = {-1, 0, 1, 2, 3};
        int[] arrayTwo = {1, 1, 1, 2, 3};
        int[] arrayThree = {-1, -7, 0, 1, 3};
        int[] arrayFour = {11, 100, -1, 8, 50};
        int[] arrayFive = {-1, 0, 1, 2, 3};
        int[] arraySix = {111, 110, 1111, 112, 113};

        System.out.println("Testing isNegativeValue...");

        printArray(arrayOne);
        if (isNegativeValue(arrayOne) == true){
            System.out.println("Test case 1 passed!");
        } else {
            System.out.println("Something went wrong");
        }

        printArray(arrayTwo);
        if (isNegativeValue(arrayTwo) == false){
            System.out.println("Test case 2 passed!");
        } else {
            System.out.println("Something went wrong");
        }

        printArray(arrayThree);
        if (isNegativeValue(arrayThree) == true){
            System.out.println("Test case 3 passed!");
        } else {
            System.out.println("Something went wrong");
        }

        printArray(arrayFour);
        if (isNegativeValue(arrayFour) == true){
            System.out.println("Test case 4 passed!");
        } else {
            System.out.println("Something went wrong");
        }

        printArray(arrayFive);
        if (isNegativeValue(arrayFive) == true){
            System.out.println("Test case 5 passed!");
        } else {
            System.out.println("Something went wrong");
        }

        printArray(arraySix);
        if (isNegativeValue(arraySix) == false){
            System.out.println("Test case 6 passed!");
        } else {
            System.out.println("Something went wrong");
        }

    }

    //This method checks an array and tests to see if it contains a negative value
    public static boolean isNegativeValue(int[] a) {

        //setting default flag to false
        boolean isNegative = false;

        //looping through the array, if a number is less than zero (negative) it swaps the flag to true then ends the loop
        for (int number : a){
            if (number < 0){
                isNegative = true;
                break;
            }
        }

        //returns the flag
        return isNegative;
    }

    //This method you can use to print the contents of an array during tests
    //The best implementation is with an enhanced for loop
    public static void printArray(int[] a) {

        for (int number : a){
            System.out.print(number + " ");
        }

    }

}