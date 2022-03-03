/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Okechukwu Daniel
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        //
        //for receiving input from user
        /*
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //int n = 2;
        int m = 5;
        int sum = number +m;
        int mult = number*m;
        int diff = m-number;
        int div = m/number;
        System.out.println("Answers:"+"\nSum = "+sum+"\nDifference = "+diff+"\nMultiplication = "+mult+"\nDivision = "+div);
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Balance : ");
        double balance = input.nextDouble();
        System.out.println("Enter Interest Rate per Annum : ");
        double rate = input.nextDouble();
        System.out.println("Enter Time Frame in years : ");
        double time = input.nextDouble();
        double interest = (balance*rate*time)/100;
        double newamount = balance + interest;
        System.out.println("The interest after "+time+" year = "+interest);
        System.out.println("New Account Balance = "+newamount);
        double newbalance = newamount;
        double newinterest = (newbalance*rate*time)/100;
        double amount = newbalance + newinterest;
        System.out.println("The new account balance is "+amount+ " after 2 years.");
        
        
    }
    
}
