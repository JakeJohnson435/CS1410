import java.util.*;

public class DemoExcep
{
    public static void main(String [] args)
    {
        //We'll be needing these variables.
        //Always put your variables at the top of your code

        //What's the difference in a run time error and compiler error?

        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
        int n1 = 0;
        int n2 = 0;
        int sum = 0;

        //1. Notice how this segment will cause a run time error if the user tries to
        //divide by 0.

//        System.out.println ("Enter value 1");
//        n1 = input.nextInt();
//        System.out.println ("Enter value 1");
//        n2 = input.nextInt();
//        sum = n1/n2;
//        System.out.println(sum);

        //We could avoid this by putting it in a while loop to see what the user entered
        //or we could use try/catch
        //Comment out the above code

        //2. Copy the code and then put the segment in a try/catch for all exceptions

//        System.out.println ("Enter value 1");
//        n1 = input.nextInt();
//        System.out.println ("Enter value 2");
//        n2 = input.nextInt();
//
//        try {
//            sum = n1/n2;
//        } catch (Exception E){
//            System.out.println(E);
//        }
//        System.out.println(sum);


        //3. We can also set this up so we force them to execute forever until they do it
        //right. Comment out the above code. Copy it here and implement a do/while.
		
//		do {
//            System.out.println ("Enter value 1");
//            n1 = input.nextInt();
//            System.out.println ("Enter value 2");
//            n2 = input.nextInt();
//            System.out.println(sum);
//            continueLoop = false;
//
//            try {
//                sum = n1/n2;
//            } catch (Exception E){
//                System.out.println(E);
//            }
//
//        }
//
//		while(continueLoop);


        //4. We can also target specific exceptions with multiple catch blocks.
        //Comment out the above code and move it here.

		do 
		{ 
		try
			{
                System.out.println ("Enter value 1");
                n1 = input.nextInt();
                System.out.println ("Enter value 2");
                n2 = input.nextInt();
                sum = n1/n2;
                System.out.println(sum);
                continueLoop = false;
            }
		catch (ArithmeticException A)//catch math error
			{
                System.out.println("You cant divide by 0.");
			}
		catch (InputMismatchException I)//catch input error
			{
                System.out.println("Wrong input type");
                input.next();
			}
		}while(continueLoop);


        //5. Move the dangerous part to a method and specify what exception that method
        //can throw. Comment out the above code and move it here with a method call.
        //Create the method below.
		
		/*
					...code...
		*/

        //6. Do an online search to look for a class/method and its associated exceptions
        //7. Why bother at all? Why not just let the program crash

    }


    //Edit this method to throw an ArithmeticException
	/*public static int divide(int x, int y)
	{return x/y;}*/


}