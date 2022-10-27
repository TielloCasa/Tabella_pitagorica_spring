package it.gianluca.ES1_spring;

import java.util.Arrays;

public class Messaggio {

	private String mess[][] = new String [10][10];

	public Messaggio(){
		setMess(mess);
	}
	
	

	@Override
	public String toString() {
		String aString = "";
		  for(int row = 0; row < mess.length; row++) {
		     for(int col = 0; col < mess[row].length; col++) {
		        aString += " " + mess[row][col];
		     }
		  }
		  return aString;
	}



	public String[][] getMess() {
		return mess;
	}

	public void setMess(String[][] mess) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				mess[i][j] = String.valueOf((i+1)*(j+1));
				
			}
			
		}
	}
	
	
}
