package com.Pattern;

public class Sshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 4; col++) {
				if (col == 1) 
				{
					if((row==1)||(row==4))
					{
					System.out.print("  ");
				}
					else
					{
						System.out.print(" *");
					}
				}
						else if (col == 3) {
					if ((row == 1)|| (row == 3)||(row==5)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if (col == 2) {
					if ((row == 1)||(row==3)||(row==5)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}else if (col == 4) {
					if ((row == 1)||(row==3)||(row==4)) {
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
