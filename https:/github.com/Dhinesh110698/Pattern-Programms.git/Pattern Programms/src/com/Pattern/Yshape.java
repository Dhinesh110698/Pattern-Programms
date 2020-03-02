package com.Pattern;

public class Yshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (col == 1) {
					if ((row == 1) || (row == 5)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if (col == 3) {
					if (row == 3) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if (col == 2) {
					if ((row == 2) || (row == 4)) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				} else if (col == 4) {
					if (row == 2) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}
				if (col == 5) {
					if (row == 1) {
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
