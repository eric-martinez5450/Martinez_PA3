package com.company;

import java.security.SecureRandom;

public class randomizer {
    public int rando1(){
        SecureRandom rand = new SecureRandom();
        int rand_doub = 0;
        while (rand_doub == 0 ) {
            rand_doub = rand.nextInt(10);
        }


        return rand_doub;
    }

    public int rando2(){
        SecureRandom rand = new SecureRandom();
        int rand_doub = 0;
        while (rand_doub == 0 ) {
            rand_doub = rand.nextInt(100);
        }


        return rand_doub;
    }

    public int rando3(){
        SecureRandom rand = new SecureRandom();
        int rand_doub = 0;
        while (rand_doub == 0 ) {
            rand_doub = rand.nextInt(1000);
        }


        return rand_doub;
    }

    public int rando4(){
        SecureRandom rand = new SecureRandom();
        int rand_doub = 0;
        while (rand_doub == 0 ) {
            rand_doub = rand.nextInt(10000);
        }


        return rand_doub;
    }

}
