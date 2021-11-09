//Class: CMSC203 CRN 24307 
//Program: Assignment #5
//Instructor: Ping-Wei Tsai 
//Summary of Description: this program displays holiday bonuses
//Due Date: 11/9/2021 
//Integrity Pledge: I pledge that I have completed the programming assignment independently. 
//I have not copied the code from a student or any source. 
//Student’s Name: Anna Downey

public class HolidayBonus{
	
	public HolidayBonus() {
	}

	//this calculates holiday bonus 
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other){
	    double[] temp = new double[data.length];
	    for (int i = 0; i < data.length; i++){
	        for (int j = 0; j < data[i].length; j++){
	            double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, j);
	            double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, j);
		        if(data[i][j] > 0){
	               if(data[i][j] == highest ){
	                  temp[i] += high;
	               }
	               else {
	            	   if(data[i][j] == lowest){
	                   temp[i] += low;
	            	   }
	            	   else {
	            		   temp[i] += other;
	            	   }
	               }
	           }
	        }
	    }
	    return temp;
    }
      
	//calculate the total of holiday bonus
    public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other)
    {
    	double[] l = calculateHolidayBonus(data, high, low, other);
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total += l[i];
		}
		return total;
    }
}