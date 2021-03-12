//What is the purpose of the import command
//We are going to create a class today, but it'll be in the same directory so we can skip
//importing it in.
import java.util.Scanner;

public class classDemo
{
    public static void main(String[]args)
    {
        //1.
        //This is actually a prebuilt class with a static function
        //We'll discuss what static means a bit later.
        //It's part of a standard set so we don't have to import it
        System.out.println("Hello World");

        //2.
        //This is also a prebuilt class, but with a non-static function

		int x=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer value.");
		sc.nextInt();

        //Create a class file called character that has a name, hit points, and strength

        //*************************************************************************

        //8.
        //Let's make an instance of the character class
        //Make note by convention class names are capitalized

        CharacterOld c1 = new CharacterOld();

//        Character c5 = new Character("bob", 5, 5, 10);

        //9.
        //set the character's name and check to see if it set correctly

        c1.setName("Rhoan Vhalire");
        System.out.println(c1.getName());


        //10.
        //give the character some stats and then print them

        c1.showStats();


        //11.
        //The entire point of this is that we can now create more and more characters
        //Create a different character using a different variable name

        CharacterOld c2 = new CharacterOld();

        c2.setName("Lo'i Arsana");
        System.out.println(c2.getName());
        c2.showStats();


        //What's happening in memory?

        //12.
        //we can even make an array of these new objects



        //13.
        //What does the public vs private actually do?
        //Write code to change the nic name of a character/
        //Try to change the actual name of a character

        //What is the purpose of setting an instance variable private?
        //
        //
        //
        //

        //14.
        //The "new character()" is a constructor. It reserves a place in memory for the
        //object it creates and unlike primitive types it initializes everything to null.
        //Switch back to character and make some basic constructors

        //*************************************************************************

        //17.
        //testing the created constructors

        //test the default like constructor
        //Character c3 = new Character();
        //c3.showStats();

        //Character c4 = new Character("Frank", 200, 78);
        //c4.showStats();

    }
}