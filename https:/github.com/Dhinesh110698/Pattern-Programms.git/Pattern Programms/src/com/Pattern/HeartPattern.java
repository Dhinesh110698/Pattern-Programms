package com.Pattern;

public class HeartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 11; row++) {
			for (int col = 1; col <= 11; col++) {
				if ((col== 1)||(col==11)) {
					if ((row==3)||(row==4)||(row==5)||(row==6)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if ((col==2)||(col==10)) {
					if ((row==2)||(row==7)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if ((col==3)||(col==9)) {
					if ((row== 2) || (row == 8)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}
				  else if ((col==4)||(col==8)) {
						if ((row== 3) || (row == 9)) {
							System.out.print(" *");
						} else {
							System.out.print("  ");
						}
				} else if ((col==5)||(col==7)) {
					if ((row== 4) || (row == 10)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
			} else if (col==6) {
				if ((row== 5) || (row == 11)) {
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
