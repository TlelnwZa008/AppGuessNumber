/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appguessnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 344_04
 */
public class AppGuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();

        int numRandom;
        int numGuess;
        int count = 0;
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        numRandom = ran.nextInt(100);
        //  System.out.println("Number is "+numRondom);
        while (count <= 2) {

            System.out.println("Euner your guess : ");
            numGuess = scan.nextInt();
            //System.out.println("compair : "+ (numRandom==numGuess));

            if (numGuess == numRandom) {
                System.out.println("You win !");
                 break;
            } else if (numGuess > numRandom) {
                System.out.println("<<<<< decrement");
                count++;
            } else if (numGuess < numRandom) {
                System.out.println("Increment >>>>>");
                count++;
            }
        }
        if (count >= 3) {
            System.out.println("You loose !!");

        }
    }
}
