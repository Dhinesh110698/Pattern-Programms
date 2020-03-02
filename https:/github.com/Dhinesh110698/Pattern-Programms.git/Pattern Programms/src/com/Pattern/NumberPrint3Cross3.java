package com.Pattern;

public class NumberPrint3Cross3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		int no=1;                             //output 1  2  3
		for (int row=1;row<=3;row++)          //       4  5  6
		{                                     //       7  8  9
			for (int col=1;col<=3;col++)      //
			{
				System.out.print("  "+no);
				no++;
			}
			System.out.println();
		}
		
		
		
		for (int row=1;row<=3;row++)            //output
		{                                       //       1  1  1
			for (int col=1;col<=3;col++)        //       2  2  2
			{                                   //       3  3  3
				System.out.print("  "+row);
			}
			System.out.println();
	}
		
		
		
		
		for (int row=1;row<=3;row++)           //output
		{                                      //       1  2  3
			for (int col=1;col<=3;col++)       //       1  2  3
			{                                  //       1  2  3
				System.out.print("  "+col);
			}
			System.out.println();

}
}
}