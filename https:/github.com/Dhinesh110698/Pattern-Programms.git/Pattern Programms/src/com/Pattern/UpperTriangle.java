package com.Pattern;

public class UpperTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row=1;row<=3;row++)           //output
		{                                      //       1  1  1
			for (int col=row;col<=3;col++)     //       2  2
			{                                  //       3
				System.out.print("  "+row);
			}
			System.out.println();

}
		
		for (int row=3;row>=1;row--)           //output
		{                                      //       3  2  1
			for (int col=row;col>=1;col--)     //       2  1
			{                                  //       1
				System.out.print("  "+col);
			}
			System.out.println();
		

	}

}
}