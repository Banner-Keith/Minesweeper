/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.winter2015.minesweeper.interfaces;

import cit260.winter2015.minesweeper.exceptions.MenuException;

/**
 *
 * @author knban_000
 */
public interface EnterInfo {
   public String getInput() throws MenuException;
}
