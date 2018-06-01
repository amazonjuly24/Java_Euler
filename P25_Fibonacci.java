/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigInteger;

/**
 *
 * @author Manju
 */
public class P25_Fibonacci {
    public static void main(String args[])
    {
        long sum=0;
        BigInteger b1,b2,a=BigInteger.ONE,b=BigInteger.ONE,c;
        for(long i=1;i<=10000;i++)
        {
            c=a.add(b);
            a=b;
            b=c;
            //System.out.print(a+" "); 
             //System.out.print(c+"\t "); 
              long l=String.valueOf(c).length();
             // System.out.print("\n"+l+" "); 
              if(l>=1000)
              {
                  System.out.print("\n\n\n"+i+"\n\n\n");
              }
//              else
//                  System.out.print("Index not found");
        }
       
    }
}
