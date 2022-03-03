/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Okechukwu Daniel
 */
abstract class shape
{
    
    public shape()
    {
        System.out.println("Drawing a shape");
    }
    
    public abstract void calculateArea();
}
class Triangle extends shape
{
    double base, height;
    public Triangle()
    {
        System.out.println("Drawing a Triangle");
        base = 1.0;
        height = 1.0;
    }
    
    public Triangle(double b, double h)
    {
        System.out.println("Drawing a Triangle");
        base = b;
        height = h;
    }
    @Override
    public void calculateArea()
    {
        double area = 0.5*base*height;
        System.out.println("Area = " +area);
    }
}
public class JavaApplication2 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstnumber = JOption;
        String secondnumber;
    }
    
}
