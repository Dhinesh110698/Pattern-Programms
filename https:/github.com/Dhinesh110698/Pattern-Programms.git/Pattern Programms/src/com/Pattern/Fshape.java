package com.Pattern;

public class Fshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 3; col++) {
				if (col == 1) {
					System.out.print(" *");
				} else if (col == 3) 
				{
					if((row==1)||(row==3))
					{
					System.out.print(" *");
				}
					else {
						System.out.print("  ");
					}
				}
					else if (col == 2) {
					if ( (row == 3)||(row==1)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}

				}
			}
			System.out.println();
		}

	}

}
