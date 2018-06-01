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
public class gcd2 {
    public static long gcd(long a, long b)
    {
        //System.out.print(a+"");
        long c,r=1;
        for(long i=1;i<=a&&i<=b;++i)
        {
            if(a%i==0&&b%i==0)
            {
                r=i;
               
            }
              
        }
         //System.out.print(sum+" ");
         
       
        return r;
    }
    
    public static long calgcd()
    {
        long x=1,sum=0;
        long limit=100000000000l;
        //BigInteger limit=BigInteger.TEN.pow(11);
        for(long i=1;i<=1000;i++)
        {
            for(long j=1;j<=i;j++)
            {
                x=gcd(i,j);
                sum=sum+x;
               //System.out.print("\t"+x+"  ");
            }
            
        }
        System.out.print(" \n"+sum+" ");
        return 0;
    }
    public static void main(String args[])throws Exception
    {
      System.out.print(calgcd()+" ");  
    }
    
}
