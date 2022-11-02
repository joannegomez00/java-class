/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jg.fortunecookie;
import java.util.Random;

/**
 *
 * @author joannegomez
 */
public class FortuneCookie {

    public static void main(String[] args) {
        
        Random randomizer = new Random();
        int x = randomizer.nextInt(11);
        System.out.println("Your Greek Fortune: " + x);

        
        switch (x) {
        case 0:
        
    System.out.println("Those aren't droids you're looking for.");
    break;
    case 1:
    System.out.println("Never go in against a Sicilian when death is on the line!");
    break;
    case 2:
    System.out.println("Gonnies never say die.");
    break;
    case 3:
    System.out.println("With great power, there must also come -great responsibility.");
    break;
    case 4:
    System.out.println("Never argue with data.");
    break;
    case 5:
    System.out.println("Try not. Do, or do not. There is no try.");
    case 6:
    System.out.println("You are a leaf on the wind, watch how you soar.");
    break;
    case 7:
    System.out.println("Do absolutely nothing, and it will be everything it could be.");
    break;
    case 8:
    System.out.println("Kneel before Zod.");
    break;
    case 9:
    System.out.println("Make it so.");
    case 10:
    System.out.println("It is what it is.");
    break;
        }       
    
    System.out.println("Thanks Random, YOU'RE the best!");

    }
}
          
    
    
        
    
   
    
    
    
    
