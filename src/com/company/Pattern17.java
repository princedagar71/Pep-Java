package com.company;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=n/2,st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                if(i==n/2+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<n/2+1)
                st++;
            else
                st--;
            System.out.println();
        }

    }
}
//lololol