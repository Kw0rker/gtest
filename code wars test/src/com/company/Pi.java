package com.company;

import java.util.Random;

public class Pi {
    public static void getPi(){
        Random r = new Random();
        int a =0; //in cirlce
        int b = 0;

        while (true){
            double x= -1 + Math.random()*2;
            double y =  -1 + Math.random()*2;
            b++;
            if (  (double)(Math.pow(x,2)+Math.pow(y,2))<=1)
                a++;
           double p=(double)a/b;

            System.out.println((double)4*p);
        }
    }
}
