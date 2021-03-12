//Game driver for testing inheritance demonstration files
//Dr. G
//10-5-18
//Edited 2-17-19
//Edited 2-27-20


//Now let's test our set up so far

import java.security.SecureRandom;

public class GameDriver
{
    public static void main(String [] args)
    {

        //We are going to create a test fight scenario involving a hero and a bad guy
        Field f1 = new Field();

        Hero h1 = new Hero("Ranger Bob", f1, 50, 10);
        Baddy b1 = new Baddy("Goblin 1", f1, 10, 2);

        //Add the ability to take damage and to heal to our hero and bad guy

        //Create a Hero with strength 10 and hit points 100

        //Create 3 Bad guys with strength 5 and hit points 200

        //Create a fight function that accepts a hero and a bad guy let them fight it out

        fight(h1, b1);

    }

	public static void fight(Hero h1, Baddy b1)
	{

	    SecureRandom sr = new SecureRandom();

	
		//Battle until the bad guys hit points are 0 or lower
		while (h1.isAlive() || b1.isAlive())
		{
			//Hero attacks

            b1.takeDamage(sr.nextInt(h1.getStrength()));
			
			
			//bad guy attack if it is still alive
			if (b1.isAlive())
			{
			    h1.takeDamage(sr.nextInt(b1.getStrength()));
			}
		}
		
		//show the outcome of the battle
		if(h1.isAlive())
			{
                System.out.println("Our hero is victorious!");
			}
			else {
            System.out.println("Our hero fought valiantly, but alas has fallen.");
            }
				
	}

}