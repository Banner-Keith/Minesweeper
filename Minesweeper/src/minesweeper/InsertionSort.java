/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author group
 */
public class InsertionSort {
   
    public static void main(String[] args){
        InsertionSort insertionSort1 = new InsertionSort();
        insertionSort1.InsertionSort();
    }
    public void InsertionSort(){
        int j;
        char tempColumn;
        int tempRow;
        int i;
        
        MineLocations mineLocations = new MineLocations();
        
        for (j = 1; j < mineLocations.mineLocation.length; j++)
        {
            tempColumn = mineLocations.mineLocation [j].column;
            tempRow = mineLocations.mineLocation [j].row;
            for(i = j - 1; (i >= 0 ) && (mineLocations.mineLocation[i].column > tempColumn|| 
                    (mineLocations.mineLocation[i].column == tempColumn && mineLocations.mineLocation[i].row > tempRow)); i--)
            {
                mineLocations.mineLocation[i+1].column = mineLocations.mineLocation[i].column;
                mineLocations.mineLocation[i+1].row = mineLocations.mineLocation[i].row;
            }
            mineLocations.mineLocation[i+1].column = tempColumn;
            mineLocations.mineLocation[i+1].row = tempRow;
        }
        
        for (int k = 0; k < mineLocations.mineLocation.length; k++){
            System.out.println(mineLocations.mineLocation[k].column + "" + mineLocations.mineLocation[k].row);
        }
        
    }
    
}

    