package com.JASP.X00085518;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite el tamanio de carcarteres: ");
        num = scan.nextInt();
        char c;
        ArrayList lista = new ArrayList();

        for (int i=0; i<num; i++)
        {
            System.out.println("Digite el caracter numero " + (i+1)+":");
            c= scan.next().charAt(0);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
            {
                lista.add(c);
            }
        }

        System.out.println(lista);
    }
}
