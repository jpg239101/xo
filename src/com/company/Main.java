package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
     Scanner sc = new Scanner(System.in);
        boolean turn = true;






        System.out.println("Give a x coordinate on the board \n  1 2 3 \n1| | | |\n2| | | |\n3| | | |");
        int x = sc.nextInt();
        System.out.println("Give a y coordinate on the board \n  1 2 3 \n1| | | |\n2| | | |\n3| | | |");
        int y = sc.nextInt();

        String [] fgf = Board.plot(x,y,turn);
        System.out.println(fgf[0]);
        System.out.println(fgf[1]);
        System.out.println(fgf[2]);



    }
}
