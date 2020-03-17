package com.JASP.X00085518;
import java.util.Scanner;

public class Main {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese un numero natural: ");
        int num= scan.nextInt(); scan.nextLine();
        System.out.println("Serie fibonacci: ");
        int a=0,b=1,c=1;

        for(int i=1;i<num;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}