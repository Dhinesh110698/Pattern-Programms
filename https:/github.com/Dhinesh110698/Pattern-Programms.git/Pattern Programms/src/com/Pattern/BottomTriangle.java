package com.Pattern;

public class BottomTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row=1;row<=3;row++)           //output
		{                                      //       1  
			for (int col=1;col<=row;col++)     //       2  2  
			{                                  //       3  3  3
				System.out.print("  "+row);
			}
			System.out.println();

}

	}

}
