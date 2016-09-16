
package sum.multiplication.addition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SumMultiplicationAddition 
{
    
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        
        System.out.print("Enter one number = ");
        String str=input.readLine();
        double a = Double.parseDouble(str);
        
        System.out.print("Enter other number = ");
        String str1=input.readLine();
        
        double b = Double.parseDouble(str1);
        
        double sum=a+b;
        double mul=a*b;
        double div=a/b;
        
        System.out.println("SUM = "+sum);
        System.out.println("MUL = "+mul);
        System.out.println("Division = "+div);
        
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
                System.out.println();
        }
        
        int z=1;
        for(int w=1; w<=5; w++)
        {
            for(int y= 1; y<=w; y++)
            {
                System.out.print(z+++ " ");
                
            }
                System.out.println();
        }
    }
    
}
