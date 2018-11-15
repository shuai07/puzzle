/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
import java.util.Random; 
        


/**
 *
 * @author yao-s9
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Random rand = new Random();
    int numberToGuess = rand.nextInt(128);
    int numberOfTries = 0;
    Scanner input = new Scanner(System.in);
    int guess;
    
        boolean win = false;
    
    while (win == false) {
        
    System.out.println("Guess a number between 1 and 128: ");
    guess = input.nextInt ();
    numberOfTries++;
    
    if (guess == numberToGuess) {
    
    }
    else if (guess < numberToGuess) {
       System.out.println("Your guess is too low");
    }
    else if (guess > numberToGuess) {
       System.out.println("Your guess is too high");
    }
}

    System.out.println("You win!");
    System.out.println("The number was " + numberToGuess);
    System.out.println("It took you " + numberOfTries + " tries" );
    }
}



