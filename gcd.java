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
public class gcd {
    
    public static void main(String args[])
    {
    long i,j,n;
    System.out.print(gcd(98,56)+" ");
   // gcd(48,18);
    }
    public static long gcd(long a, long b)
    {
        //System.out.print(a+"");
        long c,r=1;
        for(int i=1;i<a&&i<b;++i)
        {
            if(a%i==0&&b%i==0)
            {
                r=i;
            }
             //System.out.print(r+"");
        }
       
        return r;
    }
}
