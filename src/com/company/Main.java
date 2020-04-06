package com.company;

import scr.MyClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyClass myObject=new MyClass();
        Scanner input=new Scanner(System.in);
        int myArray[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Input number "+(i+1)+" : ");
            myArray[i]= Integer.parseInt(input.next());
        }

        myObject.calculateMaxValue(myArray);



    }
}
