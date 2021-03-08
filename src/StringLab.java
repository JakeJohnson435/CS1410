/*
Jake Johnson
String Lab
24 Feb 2021
 */

public class StringLab {

    static class StringFunctionsClass {

        /**
         * This method should take the string and print it to the screen with a space between each character in the string.
         * For example, "Hello" should print
         * H e l l o
         * to the screen
         *
         * @param s
         */
        public static void splitTheString(String s) {

            String newString = s.replaceAll("\\B", " ");
            System.out.println(newString);

        }


        /**
         * This method accepts two strings and returns true if they are the same and false
         * if they are different
         */
        public static boolean compareString(String s1, String s2) {
            if (s1.equals(s2)) {
                return true;
            } else {
                return false;
            }

        }

        /**
         * This method accepts two strings and returns true if s2 is part of s1.
         */
        public static boolean stringInString(String s1, String s2) {
            if (s1.contains(s2)) {
                return true;
            } else {
                return false;
            }
        }


        /**
         * This method should print the following pattern.  Note that there are spaces at the first of the rows
         * If a 3 is given, it should print
         * UUUS
         * UUS
         * US
         * S
         * <p>
         * If a 5 is given, it should print
         * UUUUUS
         * UUUUS
         * UUUS
         * UUS
         * US
         * S
         */
        public static void printSUUPattern(int numOfUs) {


        }


        /**
         * Accept as input a String and print all characters in lower case
         */
        public static void printLower(String s) {

            System.out.println(s.toLowerCase());

        }

        /**
         * Accept as input a String and replace all 0's with o's and then print the string
         */

        public static String replace0s(String s) {
            String replace = s.replace("0", "o");
            return replace;
        }
    }


    public static void main(String[] args) {

        //Split Strings
        System.out.println("Testing Split String");
        StringFunctionsClass.splitTheString("JavaIsFun");
        StringFunctionsClass.splitTheString("FunWithJava");
        String t = "";
        String [] tmp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int j = 0; j < 25; j++){
            int rand = (int)(Math.random()*tmp.length);
            t = t + tmp[rand];
        }
        StringFunctionsClass.splitTheString("Word_" + t);

        //Compare Strings
        System.out.println("\nTesting Compare String:");
        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        System.out.println(StringFunctionsClass.compareString(s1,s2));//Should print true
        System.out.println(StringFunctionsClass.compareString(s1,s3));//Should print true

        //strings within strings
        System.out.println("\nTesting Strings Within Strings");
        String s4 = "Concatenate";
        String s5 = "dog";
        System.out.println(StringFunctionsClass.stringInString(s4,s3));//Should print true
        System.out.println(!StringFunctionsClass.stringInString(s4, s5));//Should print true

        //print suu pattern
        System.out.println("\nTesting Print SUU Pattern");
        StringFunctionsClass.printSUUPattern(0);
        StringFunctionsClass.printSUUPattern(1);
        StringFunctionsClass.printSUUPattern(2);
        StringFunctionsClass.printSUUPattern(3);

        //lower case
        System.out.println("\nTesting to Lower Case");
        StringFunctionsClass.printLower("CAT");//should print cat
        StringFunctionsClass.printLower("dog");//should print dog

        //replace0s
        System.out.println("\nTesting Replace 0s");
        System.out.println(StringFunctionsClass.replace0s("L00t")); //should print Loot
        System.out.println(StringFunctionsClass.replace0s("0000")); //should print oooo
        System.out.println(StringFunctionsClass.replace0s("LamaLama")); //should print LamaLama

    }

}