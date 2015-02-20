/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author knban_000
 */
public class MineLocationsRandom {
    
    public static void main(String args[]) {
        MineLocationsRandom mineLocationsRandom = new MineLocationsRandom();
        mineLocationsRandom.SortMines(9,9,10);
    }
    
    int numberOfColumns;
    int numberOfRows;
    int numberOfMines;
    
    public void SortMines(int columns, int rows, int mines) {
        numberOfColumns = columns;
        numberOfRows = rows;
        numberOfMines = mines;
        int k;
        for (int j = 1; j < mineLocation.length; j++)
        {
            char tempColumn = mineLocation [j].column;
            int tempRow = mineLocation [j].row;
            for(k = j - 1; (k >= 0 ) && (mineLocation[k].column > tempColumn|| 
                    (mineLocation[k].column == tempColumn && mineLocation[k].row > tempRow)); k--)
            {
                mineLocation[k+1].column = mineLocation[k].column;
                mineLocation[k+1].row = mineLocation[k].row;
            }
            mineLocation[k+1].column = tempColumn;
            mineLocation[k+1].row = tempRow;
        }
    }
        
    MineLocationsRandom[] mineLocation = new MineLocationsRandom[numberOfMines];
    
    public MineLocationsRandom() {
        for (int i = 0; i < numberOfMines; i++){
            mineLocation[i] = new MineLocationsRandom((char)('A' + (char) (Math.random() * numberOfColumns)), 1+ (int) (Math.random() * numberOfRows));
            for (int j = 0; j < i; j++){                
                while (mineLocation[i].column == mineLocation[j].column && mineLocation[i].row == mineLocation[j].row) {
                    mineLocation[i] = new MineLocationsRandom((char)('A' + (char) (Math.random() * numberOfColumns)), 1+ (int) (Math.random() * numberOfRows));
                }
            }
        }
    }
    
    public char column;
    public int row;
    
    public MineLocationsRandom(char col, int ro) {
        column = col;
        row = ro;
    }

    
    
}
