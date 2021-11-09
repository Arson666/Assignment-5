//Class: CMSC203 CRN 24307 
//Program: Assignment #5
//Instructor: Ping-Wei Tsai 
//Summary of Description: this program displays holiday bonuses
//Due Date: 11/9/2021 
//Integrity Pledge: I pledge that I have completed the programming assignment independently. 
//I have not copied the code from a student or any source. 
//Student’s Name: Anna Downey 

import java.io.*;
import java.util.Scanner;

class TwoDimRaggedArrayUtility{
	//this reads data
	public static double[][] readFile(java.io.File outputFile) throws java.io.FileNotFoundException{
	   double[][] data = new double[6][4];
	   String l;
       int i = 0;

       try{
    	   Scanner sc = new Scanner(outputFile);
           while (null != (l = sc.nextLine())){
                String[] temp = l.split(" ");
                int size = temp.length; 
                data[i] = new double[size];
                
                for (int j = 0; j < size; j++){
                     data[i][j] += Double.parseDouble(temp[j]);
                }
           i++;
           }
           sc.close();
       }
       catch (Exception e){
           e.printStackTrace();
       }
       return data;
  }
  
   //this writes data to a file
   public static void writeToFile(double[][] data, java.io.File outputFile) throws java.io.FileNotFoundException{
	   try {
		   PrintWriter writeFile = new PrintWriter(outputFile);
		   for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[i].length; j++) {
					writeFile.print(data[i][j] + " ");
				}
				writeFile.println();
			}
			writeFile.close();
       }
       catch(FileNotFoundException e){
           e.printStackTrace();
       }
   }
   
   //get the total value of the values in an array
   public static double getTotal(double[][] data){
       double total = 0.0;       
       for(int i = 0;i< data.length;i++){
           for(int j= 0;j < data[i].length;j++){
               total += data[i][j];
           }
       }
       return total;
   }
   
   //get array values and calculate the average 
   public static double getAverage(double[][] data){
       double total = 0.0;
       double tot = 0.0;
       int numB = 0;  
       for(int i = 0;i <data.length;i++){
           for(int j =0;j < data[i].length;j++){
               tot += data[i][j];
               numB += 1;
           }
       }
       total = (tot/numB);
       
       return total;
   }
   
   //add up all the values in a row
   public static double getRowTotal(double[][] data,int row){
       double total = 0.0;
       for(int i = 0;i < data[row].length;i++){
           total += data[row][i];
       }
       return total;
   }
   
   //add up all the values in a column
   public static double getColumnTotal(double[][] data,int col){
       double total = 0.0;     
       for(int i = 0;i < data.length;i++){
           if(col <= data[i].length - 1){
               total += data[i][col];
           }
       }
       return total;
   }
   
   //get the highest value in a row
   public static double getHighestInRow(double[][] data,int row){
       double high = data[row][0];
       for(int i = 0;i < data[row].length;i++){
           if(data[row][i] > high){
               high = data[row][i];
           }

       }
       return high;
   }
   
   //get highest row index
   public static int getHighestInRowIndex(double[][] data,int row){
	   int highIndex = 0;
	   double high = data[row][0];
       for(int i = 0;i < data[row].length;i++){
	       if(data[row][i] > high){
	            high = data[row][i];
	            highIndex = i;
	       }
       }
       return highIndex;
   }
   
   //get highest value in a column
   public static double getHighestInColumn(double[][] data,int col){
       double high = data[0][col];
       for(int i = 0;i < data.length;i++){
           if(col <= data[i].length - 1){               
               if(data[i][col] > high){
                   high = data[i][col];
               }
           }
       }
       return high;     
   }
   
   //get the highest column index
   public static int getHighestInColumnIndex(double[][] data, int col){
	   int highIndex = 0;
	   double high = data[0][col];
       for(int i = 0;i < data.length;i++){
           if(col < data[i].length){               
               if(data[i][col] > high){
                   high = data[i][col];
                   highIndex = i;
               }
           }
    	   
       }
       return highIndex;     
   }
   
   //get the highest value in the array
   public static double getHighestInArray(double[][] data){
       double high = data[0][0];
       for(int i = 1; i < data.length;i++){
           for(int j = 0;j < data[i].length;j++){
               if(data[i][j] > high){
                   high = data[i][j];
               }
           }
       }
       return high;
   }
  
   //get the lowest value in a row
   public static double getLowestInRow(double[][] data,int row){
       double low = data[row][0];
       for(int i =0;i < data[row].length;i++){
           if(data[row][i] < low){
               low = data[row][i];
           }

       }
       return low;
   }
   
   //get the lowest row index
   public static int getLowestInRowIndex(double[][] data,int row){
	   int lowIndex = 0;
	   double low = data[row][0];
       for(int i =0;i < data[row].length;i++){
           if(data[row][i] < low){
               low = data[row][i];
               lowIndex = i;
           }

       }
       return lowIndex;
   }
   
   //get the lowest value in a column
   public static double getLowestInColumn(double[][] data,int col){
       double low = data[0][col];
       for(int i = 0;i < data.length;i++){
           if(col <= data[i].length - 1){
               if(data[i][col] < low){
                   low = data[i][col];
               }
           }
       }       
       return low;  
   }
   
   //get the lowest column index
   public static int getLowestInColumnIndex(double[][] data,int col){
	   int lowIndex = 0;
	   double low = data[0][col];
       for(int i = 0;i < data.length;i++){
	   	   if(col < data[i].length){
	            if(data[i][col] < low){
	               low = data[i][col];
	                lowIndex = i;
	            }
	        }
       }
       return lowIndex;    
   	}        
    
   //get the lowest value in the array
   public static double getLowestInArray(double[][] data){
       double low = data[0][0];
       for(int i = 1;i < data.length;i++){
           for(int j = 0;j < data[i].length;j++){
               if(data[i][j] < low){
                   low = data[i][j];
               }
           }
       }
       return low;
   }
}