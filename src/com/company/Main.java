package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    double meters,  kilograms, BMI;
    int inches, pounds;

        Scanner keyboard;
	keyboard = new Scanner(System.in);
	System.out.print("Hi today I am going to claculate your BMI, so what is your heght (inches only)");
	inches = keyboard.nextInt();
	meters = inches*0.254;
        System.out.print("Next what is your wheight in pounds");
        pounds = keyboard.nextInt();
        kilograms = pounds*0.453592;
     BMI = kilograms/meters;
     
    }
}
