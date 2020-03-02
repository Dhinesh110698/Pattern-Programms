package com.Pattern;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 7; row++) {
			for (int col = 1; col <= 7; col++) {
				if ((row == 1)||(row==7)) {
					if (col==4) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if ((row==2)||(row==6)) {
					if ((col==3)||(col==4)||(col==5)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if ((row==3)||(row==5)) {
					if ((col== 1) || (col == 7)) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				} else if (row== 4) {
						System.out.print(" *");
					}
			}
			System.out.println();
		}

	}

}
