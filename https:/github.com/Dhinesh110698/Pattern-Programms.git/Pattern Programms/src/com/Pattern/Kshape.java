package com.Pattern;

public class Kshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 7; row++) {
			for (int col = 1; col <= 4; col++) {
				if (col == 1) {
					System.out.print(" *");
				} else if (col == 3) {
					if ((row == 2)  || (row == 6)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if (col == 2) {
					if ((row == 3)||(row==5)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}else if (col == 4) {
					if ((row == 1)||(row==7)) {
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