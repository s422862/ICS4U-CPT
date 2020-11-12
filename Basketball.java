import java.util.Scanner;
import java.util.Random;

/**.
* main
* Create a program that gives the users choises in a basketball game
*user makes a choice and gets points in the process to win
* @author  John Omage
* @version 1.0
* @since   2020-11-10 
*/
public class Basketball {
// crrate private variables  
    private Random point;
    private Random letter;
    private Scanner reader;
    private int pointboard;
    private boolean running = true;

    public Basketball() {
        //call variables to public method Basketball so they are accessible in
        //main
        this.letter = new Random();
        this.point = new Random();
        this.reader = new Scanner(System.in);
        this.pointboard = 0;
    }

    public void clearOut() {
        this.reader.close();
    }

    public static void main(String[] args) {
        Basketball game = new Basketball();
        while (game.isRunning()) {
            game.basketballgame();
        }
        game.clearOut();
        System.out.println("THE GAME IS DONE");
    }

    public void basketballgame() {

        int intro = letter.nextInt(4);
       

        if (intro == 1) {
            System.out.println("You're dribbling up the lane, what do you do?");
        }
        if (intro == 2) {
            System.out.println("your team gives you the ball?");
        }
        if (intro == 3) {
            System.out.println("You got the ball from the rebound?");
        }

        System.out.println("1. make it from a 3 pointer");
        System.out.println("2. Go inside the court and lay up");
        System.out.println("3. fake it and make it");
        System.out.println("4. go in and make a dunk");
        int move = reader.nextInt();
        int chance = point.nextInt(10) + 1;

        if (move == 1) {
            if (chance >= 7) {
                System.out.println("You made a 3!");
                pointboard = pointboard + 3;
            }
            if (chance < 7) {
                System.out.println("You didnt make it! try again");
            }

        }
        if (move == 2) {
            if (chance >= 5) {
                System.out.println("You made the point!");
               pointboard = pointboard + 2;
            }
            if (chance < 5) {
                System.out.println("You didnt make it!");
            }
        }

        if (move == 3) {
            if (chance >= 3) {
                System.out.println("You made the shot!");
                pointboard = pointboard + 2;
            }
            if (chance < 2) {
                System.out.println("Noo you missed!");
            }
        }

        if (move == 4) {
            if (chance > 1) {
                System.out.println("You dunked it in! Nice!");
                pointboard = pointboard + 2;
            }
            if (chance <= 1) {
                System.out.println("You didnt make it!!");
            }
        }

        if (move > 4) {
            System.out.println("Error, not allowed, try again");
        }

        System.out.println("The score is " + pointboard);

        if (pointboard >= 21) {
            setRunning(false);
        }
    }

    public int getPointboard() {
        return pointboard;

    }

    public boolean isRunning() {
        return running;

    }

    public void setRunning(boolean running) {
        this.running = running;

    }

}