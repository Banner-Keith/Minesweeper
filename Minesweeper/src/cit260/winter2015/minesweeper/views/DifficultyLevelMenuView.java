/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.winter2015.minesweeper.views;

import cit260.winter2015.minesweeper.controls.DifficultyLevelMenuControl;
import cit260.winter2015.minesweeper.exceptions.MenuException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kalavic
 */


public class DifficultyLevelMenuView extends Menu {
    
    private final static String[][] menuItems = {
        {"B", "Beginner"},
        {"I", "Intermediate"}, 
        {"E", "Expert"},
        {"P", "Preset Demo"},
        {"X", "Exit To Main Menu"}
    };
    private static final long serialVersionUID = 1L;
    
    DifficultyLevelMenuControl difficultyLevelMenuControl = new DifficultyLevelMenuControl();
    
    public DifficultyLevelMenuView() {
        super("Difficulty Level Menu", DifficultyLevelMenuView.menuItems);
    }
    
    @Override
   public void executeCommands() {
        String command = null;
        
        do {
            display(); // display the menu
            try {
                command = getInput();
            } catch (MenuException ex) {
            }
            
            switch (command) {
                case "B":
                    difficultyLevelMenuControl.beginner();
                    break;
                case "I":
                    difficultyLevelMenuControl.intermediate();
                    break;
                case "E":
                    difficultyLevelMenuControl.expert();
                    break;
                case "P":
                    difficultyLevelMenuControl.beginnerPreset();
                    break;
                case "X":
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("X"));
   }
}
