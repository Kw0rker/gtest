package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

class Primes{
    static boolean []ar;
    static final int max=50000000;
    static int[] result;
    static int prime_n=0;
    private static int skip;
    static IntStream stream;
    static IntStream stream(){
        long time=System.currentTimeMillis();
        if (prime_n>=max)return IntStream.of(result);
        int n= (int) (9.9*Math.pow(10,8));
        int cs = n <= 1e6 ? 7500
                : n <= 1e7 ? 60000
                : 100000, // chunk size
                cc = (n / cs),                     // chunk count
                xs = n % cs;                       // excess after last chunk
        ar=new boolean[cs/2];// array used as map
        Arrays.fill(ar,true);
        result=new int[max*2];
        //result. result[0]=2;
        int seed=0;
        for(int i = 0; i < cc; i++){
            skip=prime_n;
            primeSieve(cs/2,i*cs/2);
            result[0]=2;
            //if (prime_n>=max)break;
        }
        stream= IntStream.of(result);


        if (xs != 0) {
            primeSieve(xs / 2, cc * cs / 2);
        }
        System.out.println(prime_n);
        System.out.printf("Time working: %d",(System.currentTimeMillis()-time));
        return stream;
    }
    private static void primeSieve(double g, double o){
        double t = (Math.sqrt(4+8*(g+o))-2)/4,
                e = 0,
                s = 0;

        Arrays.fill(ar,true);

        if (o!=0) {
            int x=(int) Math.ceil((o-1)/3);
            double y=(g+o-1)/3;
            for(int i = x; i < y; i++) ar[(int) (1+3*i-o)] = false;
            for(int i = 2; i < t; i++){
                s = Math.ceil((o-i)/(1+2*i));
                e = (g+o-i)/(1+2*i);
                if (i%3!=1) for(double j = s; j < e; j++,s++) ar[(int) (i + j + 2*i*j-o)] = false;// TODO: 4/29/2020 optimze
            }
        } else {
            for(int i = 1; i < (g-1)/3; i++) ar[ (1+3*i)] = false;
            for(int i = 2; i < t; i++){
                e = (g-i)/(1+2*i);
                if (i%3!=1) for(int j = i; j < e; j++) ar[ (i + j + 2*i*j)] = false;
            }
        }
        for(int i = 0; i < g; i++) if(ar[ i]){
            result[prime_n++]= (int) ((i+o)*2+1);
        }
        //test stage
        //Arrays.sort(result);
    }
    static long sqrt(long x){
        // if (x<0)x=Math.abs(x);//i dont give a fuck to root negative
        // Base cases
        if (x == 0 || x == 1)
            return x;

        // Staring from 1, try all numbers until
        // i*i is greater than or equal to x.
        long i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
}