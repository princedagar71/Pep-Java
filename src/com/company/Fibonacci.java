package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        int n= sc.nextInt();
        System.out.println(a+"\n"+b);
        for (int i=0;i<n-2;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
