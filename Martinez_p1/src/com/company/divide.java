package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class divide {
    public double divide2(double i, double j) {
        Scanner get = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int rand_response;
        double inputtedAns = 0;
        double c;
        if (inputtedAns != (i / j)) {
            System.out.printf("How much is %.2f divided by %.2f? \n", i, j);
            inputtedAns = get.nextDouble();
            //c = (inputtedAns) - (i / j);
           // System.out.printf("C is\n", c);
            if (Math.abs((inputtedAns) - (i / j)) >= 0.001) {


                rand_response = rand.nextInt(3);
                switch (rand_response) {
                    case 0:
                        System.out.printf("No. Please try again.\n");
                        break;
                    case 1:
                        System.out.printf("Wrong. Try once more.\n");
                        break;
                    case 2:
                        System.out.printf("Don't give up!\n");
                        break;
                    case 3:
                        System.out.printf("No. Keep trying.\n");
                        break;
                }
                return 0;
            } else if (Math.abs((inputtedAns) - (i/j)) <= 0.001){
                System.out.printf("Very Good!\n");
                int score = 1;

                return score;

            }


        }
        return 0;


        //return inputtedAns;
    }
}
