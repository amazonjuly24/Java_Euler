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
public class powerdigitsum_p16 {
    public static void main(String args[])
    {
        long a=2,b=1000,c=11;
        BigInteger b1,b3;
        int exp=1000,l;
        BigInteger sum=BigInteger.ZERO;
       BigInteger b2=new BigInteger("99");
        Double d;
        
        b1=b2.pow(exp);
        String s=b1.toString();
        String[] s1=s.split("");
       l=b1.toString().length();
        System.out.print(b1+"\n\n");
        //System.out.print(l+"\n\n");
        //System.out.print(s1+"\n\n");
        for(int i=0;i<s1.length;i++)
        {
            sum=sum.add(new BigInteger(s1[i]));
        }
        
         System.out.print(sum);
    }
    
}
