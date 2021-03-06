/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.winter2015.minesweeper;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class GetPlayerName implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public static void getName() {
        String greeting = "Welcome to Minesweeper.";
        String namePrompt = "Please enter your name.";
        String ifnot = "\nPlayer name must contain 3 to 15 characters."
                + " Please try Again.";
       
        Scanner input = new Scanner (System.in);
        System.out.println(greeting + "\n" + namePrompt);
        String playerName = input.nextLine();
    
        //Checks for minumum of 3 characters and max of 15.
        //Loops if incorrect input.
        while((playerName.length() < 3) || (playerName.length() > 15)) { 
            System.out.println(ifnot);
            System.out.println("");
            System.out.println(namePrompt);
            playerName = input.nextLine();
        }
        System.out.println("Great " + playerName +", Go ahead!!!");
        GameVariables.setPlayerName(playerName);
    }  
}
    
