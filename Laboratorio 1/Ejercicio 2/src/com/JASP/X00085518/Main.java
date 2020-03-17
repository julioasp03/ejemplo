package com.JASP.X00085518;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite una frase");
        String frase, inverso = "", palind = "";
        frase = scan.nextLine();
        char x;
        for (int i = 0; i<frase.length(); i++)
        {
            x = frase.charAt(i);
            if (x != ' ')
            {
                palind += x;
            }
        }
        for (int i = palind.length()-1; i>=0; i--)
        {
            x = palind.charAt(i);
            inverso += x;
        }
        System.out.println(palind.equals(inverso));

    }
}
