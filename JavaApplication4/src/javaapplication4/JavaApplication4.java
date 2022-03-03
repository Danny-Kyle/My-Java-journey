/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.io.*;
/**
 *
 * @author Okechukwu Daniel
 */
public class ReadData
{
    public void read()
    {
        try
        {
            FileReader fr = new FileReader("C:");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line= br.readLine())!= null)
            {
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
