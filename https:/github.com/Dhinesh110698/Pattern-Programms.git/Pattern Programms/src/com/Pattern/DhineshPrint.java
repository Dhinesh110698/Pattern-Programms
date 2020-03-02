package com.Pattern;

public class DhineshPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 31; col++) {
				if (row == 1) 
				{
					if ((col==3)||(col==4)||(col==6)||(col==8)||(col==12)||(col==14)||(col==15)||(col==16)||(col==18)||(col==23)||(col==24)||(col==28)||(col==30)) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				} else if (row==2) {
					if ((col== 2)||(col==4)||(col==6)||(col==8)||(col==9)||(col==11)||(col==12)||(col==15)||(col==16)||(col==18)||(col==20)||(col==21)||(col==22)||(col==23)||(col==25)||(col==26)||(col==27)||(col==28)||((col==30))) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				} else if (row == 3) {
					if ((col==2)||(col==4)||(col==8)||(col==9)||(col==11)||(col==12)||(col==14)||(col==16)||(col==18)||(col==23)||(col==27)||(col==28)) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				} else if (row== 4) {
					if ((col== 2)||(col==4)||(col==6)||(col==8)||(col==9)||(col==11)||(col==12)||(col==14)||(col==15)||(col==18)||(col==20)||(col==21)||(col==22)||(col==23)||(col==24)||(col==25)||(col==26)||(col==28)||(col==30)) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				}
				if (row== 5) {
					if ((col== 3)||(col==4)||(col==6)||(col==8)||(col==12)||(col==14)||(col==15)||(col==16)||(col==18)||(col==23)||(col==28)||(col==30)) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				}
			}
			System.out.println();
		}

}
}