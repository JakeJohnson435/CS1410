/*Jake Johnson
EnumLab
12 March 2021
 */

import java.util.Scanner;
import java.util.Arrays;

public class EnumLab {

    enum Direction{NORTH, EAST, SOUTH, WEST}

    public static void moveDirection(int[] array, Direction dir){

        if (dir == Direction.NORTH){
            array[1] += 1;
        }
        if (dir == Direction.EAST){
            array[0] += 1;
        }
        if (dir == Direction.SOUTH){
            array[1] -= 1;
        }
        if (dir == Direction.WEST){
            array[0] -= 1;
        }

        System.out.println("(" + array[0] + ", " + array[1] + ")");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Direction dir;

        int[] intArray = new int[2];
        Arrays.fill(intArray, 0);
        char direction;

        do {
            System.out.println("Enter a direction: N, E, S, W. Or press Q to quit.");
            char choice = sc.nextLine().charAt(0);
            direction = java.lang.Character.toUpperCase(choice);

            if (direction == 'Q'){
                break;
            }

            switch(direction)
            {
                default:  dir = Direction.NORTH;
                    break;
                case 'E':  dir = Direction.EAST;
                    break;
                case 'S':  dir = Direction.SOUTH;
                    break;
                case 'W':  dir = Direction.WEST;
                    break;
            }

            moveDirection(intArray, dir);
        } while (direction != 'Q');


    }



}
