package com.JASP.X00085518;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont=1, x;
        System.out.println("Digite un valor: ");
        x = scan.nextInt();

        up(x, cont);
    }

    static void up(int valor, int cont)
    {
        if (cont == valor)
        {
            down(valor, cont);
        }
        else
        {
            System.out.print(cont);
            up(valor, cont+1);
        }

    }

    static void down(int valor, int cont)
    {
        if (cont == 1)
        {
            System.out.print(cont);
        }
        else
        {
            System.out.print(cont);
            down(valor, cont-1);
        }
    }
}
