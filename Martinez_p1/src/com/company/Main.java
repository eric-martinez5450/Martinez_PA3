package com.company;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		randomizer num = new randomizer();
		multiply obj1 = new multiply();
		add obj2 = new add();
		subtract obj3 = new subtract();
		divide obj4 = new divide();
		Scanner get = new Scanner(System.in);
		//Multiplication ans = new Multiplication();
		int flag = 0;
		double userScore = 0;
		double userScore2 = 0;
		int difficulty;
		int mode;

		while (flag == 0) {
			System.out.println("Please enter the arithmetic mode. (1 = addition, 2 = multiplication, 3 = subtraction, 4 = division)");
			mode = get.nextInt();
			switch (mode) {
				case 1:
					System.out.println("Please enter the difficulty level. (0 = easiest, 3 = hardest.)");
					difficulty = get.nextInt();
					switch (difficulty) {
						case 0:
							for (int k = 0; k < 10; k++) {
								double i = num.rando1();
								double j = num.rando1();

								userScore = userScore + obj2.add2(i, j);

							}
							break;
						case 1:
							for (int l = 0; l < 10; l++) {
								double i = num.rando2();
								double j = num.rando2();

								userScore = userScore + obj2.add2(i, j);
							}
							break;
						case 2:
							for (int m = 0; m < 10; m++) {
								double i = num.rando3();
								double j = num.rando3();

								userScore = userScore + obj2.add2(i, j);
							}
							break;
						case 3:
							for (int m = 0; m < 10; m++) {
								double i = num.rando4();
								double j = num.rando4();

								userScore = userScore + obj2.add2(i, j);
							}
							break;
					}
					break;

				case 2:
					System.out.println("Please enter the difficulty level. (0 = easiest, 3 = hardest.)");
					difficulty = get.nextInt();
					switch (difficulty) {
						case 0:
							for (int k = 0; k < 10; k++) {
								double i = num.rando1();
								double j = num.rando1();

								userScore = userScore + obj1.multiply2(i, j);

							}
							break;
						case 1:
							for (int l = 0; l < 10; l++) {
								double i = num.rando2();
								double j = num.rando2();

								userScore = userScore + obj1.multiply2(i, j);
							}
							break;
						case 2:
							for (int m = 0; m < 10; m++) {
								double i = num.rando3();
								double j = num.rando3();

								userScore = userScore + obj1.multiply2(i, j);
							}
							break;
						case 3:
							for (int m = 0; m < 10; m++) {
								double i = num.rando4();
								double j = num.rando4();

								userScore = userScore + obj1.multiply2(i, j);
							}
							break;
					}
				case 3:
					System.out.println("Please enter the difficulty level. (0 = easiest, 3 = hardest.)");
					difficulty = get.nextInt();
					switch (difficulty) {
						case 0:
							for (int k = 0; k < 10; k++) {
								double i = num.rando1();
								double j = num.rando1();

								userScore = userScore + obj3.subtract2(i, j);

							}
							break;
						case 1:
							for (int l = 0; l < 10; l++) {
								double i = num.rando2();
								double j = num.rando2();

								userScore = userScore + obj3.subtract2(i, j);
							}
							break;
						case 2:
							for (int m = 0; m < 10; m++) {
								double i = num.rando3();
								double j = num.rando3();

								userScore = userScore + obj3.subtract2(i, j);
							}
							break;
						case 3:
							for (int m = 0; m < 10; m++) {
								double i = num.rando4();
								double j = num.rando4();

								userScore = userScore + obj3.subtract2(i, j);
							}
							break;
					}
					break;
				case 4:
					System.out.println("Please enter the difficulty level. (0 = easiest, 3 = hardest.) Note: Round to the nearest thousandth when possible. (ex: 1/6 = 0.167)");
					difficulty = get.nextInt();
					switch (difficulty) {
						case 0:
							for (int k = 0; k < 10; k++) {
								double i = num.rando1();
								double j = num.rando1();

								userScore = userScore + obj4.divide2(i, j);

							}
							break;
						case 1:
							for (int l = 0; l < 10; l++) {
								double i = num.rando2();
								double j = num.rando2();

								userScore = userScore + obj4.divide2(i, j);
							}
							break;
						case 2:
							for (int m = 0; m < 10; m++) {
								double i = num.rando3();
								double j = num.rando3();

								userScore = userScore + obj4.divide2(i, j);
							}
							break;
						case 3:
							for (int m = 0; m < 10; m++) {
								double i = num.rando4();
								double j = num.rando4();

								userScore = userScore + obj4.divide2(i, j);
							}
							break;
					}
					break;
			}

			userScore2 = userScore;
			userScore = (userScore * 100) / 10;
			if (userScore <= 75.00) {
				System.out.printf("Your Score was %.2f correct out of 10. Please ask your teacher for extra help.\n", userScore2);
			} else if (userScore > 75.00) {
				System.out.printf("Your Score was %.2f correct out of 10. Congratulations, you are ready to go to the next level!\n", userScore2);
			}
			System.out.printf("Enter 0 to continue, 1 to exit\n");
			flag = get.nextInt();
		}
	}

}

