/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbergenerator;
import java.util.Random;

/**
 *
 * @author Acer-User
 */
public class NumberGenerator {

    public static void main(String[] args) {
        Random randnum = new Random();
        
        for(int i=0; i < 5; i++)
        {
          int randomNumber = randnum.nextInt(100) + 1;
          System.out.println(randomNumber);
        }    
        
    }
}
