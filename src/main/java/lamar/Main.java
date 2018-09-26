package lamar;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Random rand = new Random();
//
//        int number = rand.nextInt(10);
//
//        int numberOfTries = number;
//
//        Scanner input = new Scanner(System.in);
//
//        int guess;
//
//        boolean win = false;
//
//        while (win == false) {
//
//
//            System.out.println(" Guess a number between 1 and 100 ");
//
//            guess = input.nextInt();
//
//            number++;
//
//            if (guess == number) {
//                win = true;
//
//            } else if (guess < number) {
//
//                System.out.println(" Your guess is too low sorry ");
//            } else if (guess > number) {
//
//                System.out.println(" Your guess is too high sorry ");
//            }
//
//        }
//        System.out.println(" You win! ");
//
//        System.out.println("The number was " + numberOfTries);
//
//        System.out.println(" It took you " + numberOfTries + " tries ");


        Student me = new Student("lamar",19,'m' ) ;

        me.setlongGrade(90000);

        System.out.println(me.getlonggrade());

        System.out.println(me.age);


        System.out.println(me.name);

        System.out.println(me.gender);

        me.setnickname("You motha fucker");

        System.out.println(me.getNickname());















































    }
}

















