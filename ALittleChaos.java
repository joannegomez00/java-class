/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jg.alittlechaos;
import java.util.Random;

/**
 *
 * @author joannegomez
 */
public class ALittleChaos {

    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100);
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num); 
        
        System.out.println("Or just keep generating new views");
        System.out.println("Here's a bunch of numbers from 0-100: ");
        
        System.out.println(randomizer.nextInt(101) + ", "); 
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
        
    
    }
}
