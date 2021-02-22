/* Jake Johnson
   Exceptions Exercise
   21/Feb/2021
*/



import java.util.Arrays;

public class ExceptionLab {


 
    public static void main(String[] args) {

        /*First exception is taken straight from the demo we did in class.
        This exception catches errors due to math and prevents the code from crashing out,
        instead giving you a message letting you know what happened.*/

            int n1 = 10;
            int n2 = 0;
            int sum = 0;

            try {
                //Attempting to assign sum as the answer to n1 divided by n2, but n2 is 0 and dividing by 0 throws an error.
                sum = n1/n2;
                System.out.println(sum);
            } catch (ArithmeticException A){
                System.out.println(A + "\nYou cant divide by zero so an error was caught and handled.");
            }

        /*Next up is the ArrayIndexOutOfBounds.
        This exception occurs when you attempt to access something stored in an array,
        but the index provided of the item you want doesn't exist.
        */

            //array created with 3 spots reserved, (indexes 0, 1 and 2)
            int [] array = new int[3];
            Arrays.fill(array, 0);

            try {
                //When running the for loop, we are going up to the length, since java starts some things at 0 and others at 1, this makes it seem there is an
                //extra space at the end.  When the loop hits index 3, it doesnt exist and the error is thrown.
                for (int i = 0; i<=array.length; i++){
                    System.out.println(array[i]);
                }
            } catch (ArrayIndexOutOfBoundsException Ar){
                System.out.println(Ar + "\nThe index requested at the end of the for loop does not exist.  Error was caught and handled.");
            }

        /*Now comes the NullPointerException.
        This exception occurs when you are attempting to call or access a method that is null.
        */

        try {
            String myString = null;
            System.out.println(myString.substring(2, 5));
        } catch (NullPointerException Np){
            System.out.println(Np + "\nIn this case, we are attempting to create a substring of a string that does not exist, therefore a NullPointerException occurred.");
        }

        /*Finally, the StringIndexOutOfBoundsException.
        This occurs when attempting to manipulate strings, but the index provided doesn't exist in the string
         */

        try {
            //Creating a string with 10 index spaces then asking for the character at the 11th space. This would throw an error if not caught.
            String myNewString = "Hello World";
            char myChar = myNewString.charAt(11);
        } catch (StringIndexOutOfBoundsException S){
            System.out.println(S + "\nThe index provided for charAt(11) is past the length of the string. This makes the StringIndexOutOfBoundsException occur, which was caught and handled.");
        }



        }

}
