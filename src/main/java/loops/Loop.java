package loops;


import sun.plugin.dom.css.Counter;

import java.util.Random;
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

//        String artist[] ={"DMX", "J-Cole", "Assap Rocky"};
//
//        for(int fav = 0; fav<artist.length;fav++ ){
//
//            System.out.println(artist[fav]);
//        }


//        int[] arr1 ={1,2,3,4,5};
//
//        int[] arr2 ={7,8,9,10};
//
//        System.out.println(arr1[4] * arr2[3]);


//        double score = Math.random() * 100 + 1;
//
//        System.out.println(score);
//
//         if( score>90){
//
//             System.out.println("You got an A");
//
//         }else if(score>80){
//             System.out.println("You got an B");
//
//         }else if(score>70){
//             System.out.println("You got an C");
//
//         }else if(score>60){
//             System.out.println("You got an D");
//
//         }else if(score<59){
//             System.out.println("You got an F");
//         }


//        Scanner login = new Scanner((System.in));

//        System.out.println("username");
//
//        String name = "lamar";
//
//        String password = "TGIF";
//
//        String enter = login.nextLine();
//
//        if (enter.equalsIgnoreCase(name)) {
//
//            System.out.println("Enter password");
//
//        }
//
//        String type = login.nextLine();
//
//        if(type.equalsIgnoreCase(password)){
//
//            System.out.println("welcome");
//
//        }else {
//
//            System.out.println("your are locked out one try only");
//        }



//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//
//        float lo= 0;
//
//                for(int y = 0; y < numbers.length; y++ ) {
//
//                    lo = lo + numbers[y];
//
////                    System.out.println(lo/numbers.length);
//                }
//        System.out.println(lo/numbers.length);







//        int[] lottoNumbers = {11,21,23,14,5,65};
//
//        int sum = 0;
//
//        for(int u = 0; u <lottoNumbers.length; u++){
//
//
//
//            sum = sum + lottoNumbers[u];
//
//            System.out.println( "the sum of array is : " + sum);
//        }




//        for(int x = 1; x <= 50; x++){
//
//            if((x % 2 == 0) && (x % 3 == 0) ){
//                System.out.println("Wu");
//            }else if(x % 2 == 0){
//                System.out.println("Tang");
//            }else if(x % 3 == 0){
//                System.out.println("Wu");




//        Scanner mike = new Scanner(System.in);
//
//        System.out.println("what is your name");
//
//        String person = mike.nextLine();
//
//        System.out.println("How old are you");
//
//        String age = mike.nextLine();
//
//        int y = 1;
//        System.out.println("Hi" + person + "Your age is " + age + y );




//        String [] [] hats =
//                {
//                        {"mr", "mrs", "mc"},
//
//                        {"tee", "jones", "hammer"}
//
//
//                };
//
//        System.out.println(hats[0] [0] + hats[1] [0]);





        int[][] magicSquare =
                {
                        {16, 3, 2, 13},
                        {5, 10, 11, 8},
                        {9, 6, 7, 12},
                        {4, 15, 14, 1}
                };



        for(int row = 0; row < magicSquare.length; row++){

            for (int column = 0; column < magicSquare[row].length; column++){

                System.out.print(" \t " + magicSquare[row][column] + " \t | ");

            }
        }
        System.out.println();










































    }}



















































































































































































































































// for(int x = 6; x >= 0; x--) {
//
//            if (x == 2) {
//                break;
//            }
//            System.out.println(x);











//        int day = (int)(Math.random()* 6 + 1);
//        String dayString;
//
//        switch (day) {
//            case 1:
//                dayString = " U rolled a 1";
//                break;
//            case 2:
//                dayString = "U rolled a 2";
//                break;
//            case 3:
//                dayString = "U rolled a 3 ";
//                break;
//
//            case 4:
//                dayString = "U rolled a 4";
//                break;
//            case 5:
//                dayString = "U rolled a 5";
//                break;
//            case 6:
//                dayString = "U rolled a 6";
//                break;
//
//            default:
//                dayString = "Invalid day";
//                break;
//        }
//        System.out.println(dayString);
















//        for (int x = 1; x <= 5; x++) {
//
//            if (3 == x) {
//
//                System.out.println("Hip");
//            }
//
//
//        if (5 == x) {
//                System.out.println("Hop");
//
//            }
//            System.out.println(x);











//
//    String one = "monday";
//
//    String two = "wendsday";
//
//    String three = "friday";
//
//    String today = "friday";
//
//
//    if (one.equals(today)){
//        System.out.println("today is monday");
//
//
//    }else if(two.equals(today) ){
//
//            System.out.println("today is wendsday");
//
//
//
//
//
//    }else if(three.equals(today)){
//
//        System.out.print("today is friday");
//
//
//        }else{
//
//        System.out.print("ok");
//        }








