package com.Pattern;

public class Tshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 3; row++)
		{
			for (int col = 1; col <= 3; col++) 
			{
				if ((row == 2) && ((col == 1) || (col == 3))) 
				{
					System.out.print("   ");
				} else if ((row == 3) && ((col == 1) || (col == 3))) 
				{
					System.out.print("   ");
				}

				else 
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}

	}
}
