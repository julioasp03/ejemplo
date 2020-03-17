package com.JASP.X00085518;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String frase, frase2="";
        char c;

        System.out.println("Digite una frase");
        frase = scan.nextLine();

        for (int i=0; i<frase.length(); i++)
        {
            c = frase.charAt(i);

            if (c == 'a' || c == 'A')
            {
                frase2 += 'b';
            }
            else
            {
                frase2 += c;
            }
        }

        System.out.print("Nueva frase= ");
        System.out.println(frase2);
    }
}
