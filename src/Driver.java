import java.util.Random;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean play = true;

        while (play) {

            System.out.println("Welcome Challenger, what are you called?");
            String name = sc.nextLine();
            System.out.println("Greetings " + name + ". Would you like to enter your stats? (y/n)");
            char answer = sc.nextLine().charAt(0);

            CharacterOld c1;
            CharacterOld c2 = null;

            if (answer == 'y' || answer == 'Y') {
                System.out.println("Enter your hit points (max of 99)");
                int hitPoints = Integer.parseInt(sc.nextLine());

                System.out.println("Enter your strength (max of 10)");
                int strength = Integer.parseInt(sc.nextLine());

                c1 = new CharacterOld(name, hitPoints, strength);
                c1.showStats();
            } else {
                c1 = new CharacterOld(name);
                c1.showStats();
            }


            System.out.println("Select your difficulty: (easy/medium/hard)");
            String difficulty = sc.nextLine();

            boolean fight = true;

            if (difficulty.equalsIgnoreCase("easy") || difficulty.equalsIgnoreCase("e")) {
                c2 = new CharacterOld();
                System.out.println("You will be fighting: " + c2.getName());
                c2.showStats();
            } else if (difficulty.equalsIgnoreCase("medium") || difficulty.equalsIgnoreCase("m")) {
                c2 = new CharacterOld("Bugbear", 45, 5);
                System.out.println("You will be fighting: " + c2.getName());
                c2.showStats();
            } else if (difficulty.equalsIgnoreCase("hard") || difficulty.equalsIgnoreCase("h")){
                System.out.println("Oh you want a challenge? \nYou will be fighting Rowan.");
                c2 = new CharacterOld("Rowan", 80, 8);
                c2.showStats();
            } else {
                System.out.println("Too scared huh? Come back later");
                fight = false;
            }

            int yourDamage = c1.getStrength();
            int theirDamage = c2.getStrength();

            while (fight){
                boolean alive1 = c1.isAlive();
                if (alive1) {
                    int damage = rand.nextInt(yourDamage) + 1;
                    System.out.println("You attack dealing " + damage);
                    c2.takeDamage(damage);
                    Thread.sleep(2000);
                    if (c2.getHitPoints() <= 0){
                        System.out.println(c2.getName() + " is out of hit points");
                        c2.setStatus(false);
                    } else {
                        System.out.println(c2.getName() + " has " + c2.getHitPoints() + " hit points left. They're still alive");
                    }
                    Thread.sleep(2000);
                } else {
                    System.out.println("You are dead.");
                    break;
                }
                boolean alive2 = c2.isAlive();
                if (alive2){
                    int damage = rand.nextInt(theirDamage) + 1;
                    System.out.println(c2.getName() + " hits back dealing " + damage);
                    c1.takeDamage(damage);
                    Thread.sleep(2000);
                    if (c1.getHitPoints() <= 0){
                        System.out.println("You are out of hit points");
                        c1.setStatus(false);
                    } else {
                        System.out.println("You have " + c1.getHitPoints() + " hit points left. You're still alive");
                    }
                    Thread.sleep(2000);
                } else {
                    System.out.println("You won!");
                    break;
                }

            }




            System.out.println("Do you want to play again? (y/n)");
            String again = sc.nextLine();

            if (again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no")){
                play = false;
            }


        }


    }


}
