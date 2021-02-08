import java.util.Random;


public class Decisions {

    public static void main(String[] args) {

        Random rand = new Random();

        int gauss = 0;
        int wisp = 0;
        int prot = 0;
        String winner = "";

        for (int i = 0; i < 1000; i++){
            int number = rand.nextInt(3);
            if (number == 0){
                gauss++;
            } else if (number == 1){
                wisp++;
            } else if (number == 2){
                prot++;
            }
        }

        if (prot > wisp && prot > gauss){
            winner = "prot";
        } else if (wisp > prot && wisp > gauss){
            winner = "wisp";
        } else if (gauss > wisp && gauss > prot){
            winner = "gauss";
        }

        System.out.println("Totals: " +
                "\nGauss: " + gauss +
                "\nProt: " + prot +
                "\nWisp: " + wisp +
                "\nAnd the winner is: " + winner + "!");

    }

}
