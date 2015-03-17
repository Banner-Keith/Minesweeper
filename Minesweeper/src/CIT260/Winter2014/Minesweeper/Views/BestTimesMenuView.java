/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Winter2014.Minesweeper.Views;

import CIT260.Winter2014.Minesweeper.Controls.BestTimesMenuControl;

/**
 *
 * @author Keith Banner
 */


public class BestTimesMenuView extends Menu {
        
    private static final String[][] menuItems = {
        {"B", "Beginner"},
        {"I", "Intermediate"},
        {"E", "Expert"},
        {"A", "All Difficulty Levels"},
        {"X", "Exit to Main Menu"}
    }; 
    
    public BestTimesMenuView() {
        super(BestTimesMenuView.menuItems);
    }
    
   @Override
   public void executeCommands() {
        String command;
        
        do {
            display("Best Times Menu"); // display the menu
            
            command = getCommand();
            
            switch (command) {
                case "B":
                    BestTimesMenuControl.beginnerBestTimes();
                    break;
                case "I":
                    BestTimesMenuControl.intermediateBestTimes();
                    break;
                case "E":
                    BestTimesMenuControl.expertBestTimes();            
                    break;
                case "A":
                    BestTimesMenuControl.allBestTimes();
                case "X":
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("X"));
   }
}