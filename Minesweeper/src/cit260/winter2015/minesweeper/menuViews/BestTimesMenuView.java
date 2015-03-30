/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.winter2015.minesweeper.menuViews;

import cit260.winter2015.minesweeper.menuControls.BestTimesMenuControl;

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
    private static final long serialVersionUID = 1L;
    
    public BestTimesMenuView() {
        super("Best Times Menu", BestTimesMenuView.menuItems);
    }
    
   @Override
   public void executeCommands() {
        String command;
        
        do {
            display(); // display the menu
            
            command = getInput();
            
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
                    break;
                case "X":
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("X"));
   }
}