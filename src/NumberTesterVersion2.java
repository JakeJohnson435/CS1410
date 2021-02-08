/**
 *
 *
 *
 */
public class NumberTesterVersion2 {

    //NOTE: DO NOT TRY TO RUN THIS CLASS.  THERE IS NO MAIN METHOD


    //This method should return exactly what it was given
    public static int simpleMethod(int i){
        return i;
    }

    //A simple or operation, but with 3 values
    //this method should calculate the Conditional OR relationship
    public static boolean findTheTruthUsingOrOperator(boolean a, boolean b, boolean c){
        boolean foundTrue = true;

        if (a == true || b == true || c == true){
            return foundTrue;
        } else {
            return false;
        }
    }

    //This method should return the first 5 numbers (as a positive int) after the decimal point.
    //For example, with 3.1415926535897932384 it would return 14159
    //Another example, 12345.5432112345 would return 54321
    public static int getTheFirst5NumbersAfterTheDecimalPoint(double a){


        String numbers = Double.toString(a);
        String after = numbers.substring(numbers.indexOf(".")+1, numbers.indexOf(".")+6);
        int numbersAfter = Integer.parseInt(after);

        return numbersAfter;
    }

    //This method should look through the array and figure out how many 2's are in it
    public static int countHowManyTimesTheNumber2IsInTheArray(int [] theNumbers){

        int count = 0;

        for (int i = 0; i < theNumbers.length; i++){
            if (String.valueOf(theNumbers[i]).contains("2")){
                count++;
            }
        }

        return count;
    }

    //This method should find the third positive integer in the array.
    public static int findTheThirdPositiveIntegerInTheArray(int[] theNumbers){

        int positiveInt = 0;
        int count = 0;

        for (int num : theNumbers){
            if (num > 0){
                count++;
            }

            if (count == 3){
                positiveInt = num;
                break;
            }
        }

        return positiveInt;
    }


}