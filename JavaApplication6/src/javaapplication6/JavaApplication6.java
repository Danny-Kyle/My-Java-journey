/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;

/**
 *
 * @author Okechukwu Daniel
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("I Love Pizza");
        System.out.println("I thought so at least");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("How old are you? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("What is your favorite food? ");
        String food = sc.nextLine();
        
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);
    }
    
}
