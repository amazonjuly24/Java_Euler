/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Manju
 */
import java.util.*;
import java.io.*;
import java.lang.StackOverflowError;
import java.math.BigInteger;
public class largegcd {
//    public static long gcd(long a, long b)
//    {
//        long r,m,n;
//        if (a == 0)
//            return b;
//         
//        return gcd(b%a, a);
//        
    
    
    //q=a/b;
//        r=a%b;
//        
//        if(a>=b && b>=0)
//        {
//            a=q*b+r;
//          gcd(b,a);
//            
//        }
//        if (p % q == 0)
//
//            return q;
//
//        return gcd(q, p % q);
        
        //return 1;
  //  }
    
//    static long gcdd(long a1,long b1)
//    {
//        long r1,r2;
//        return 0;
//    }
   
    
//    public static long calgcd()
//    {
//        BigInteger sum=BigInteger.ZERO;
//         BigInteger x=BigInteger.ONE;
//        long limit=100000000000l;
//        //BigInteger limit=BigInteger.TEN.pow(11);
//        for(long i=1;i<=10000l;i++)
//        {
//            for(long j=1;j<=i;j++)
//            {
//                
//                x=BigInteger.valueOf(i).gcd(BigInteger.valueOf(j));
//                
//                    sum=sum.add(x);
//                
//                
//               //System.out.print("\t"+x+"  ");
//            }
//            
//        }
//        System.out.print(" \n"+sum+" ");
//        return 0;
   // }
    public static void main(String args[])throws Exception
    {
      //System.out.print(calgcd()+" ");  
      BigInteger sum=BigInteger.ZERO;
         BigInteger x=BigInteger.ONE;
        long limit=100000000000l;
        //BigInteger limit=BigInteger.TEN.pow(11);
        for(long i=1;i<=10l;i++)
        {
            
            for(long j=1;j<=i;j++)
            {
                
                x=BigInteger.valueOf(i).gcd(BigInteger.valueOf(j));
                
                    sum=sum.add(x);
                
                
               //System.out.print("\t"+x+"  ");
            }
            
        }
        System.out.print(" \n"+sum+" ");
    }
    
}
