package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("***");
        Money[] moneyArr = new Money[3];

        moneyArr[0] = new Money(2,4,1,0);
        moneyArr[1] = new Money(1,4,5,6);
        moneyArr[2] = new Money(5,1,1,1);



        System.out.println("For Loop");
        for (int i = 0; i < 3; i++)
        {
            System.out.println(moneyArr[i]);
        }

        System.out.println();

    }
}
