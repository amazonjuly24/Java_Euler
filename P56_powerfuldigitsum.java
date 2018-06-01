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
public class P56_powerfuldigitsum {
    public static void main(String args[])
    {
        BigInteger b=BigInteger.ONE,c;
        //BigInteger i=BigInteger.ONE;
        long m=100;
       BigInteger bi=BigInteger.valueOf(m);
        for(BigInteger i=BigInteger.ONE;i.compareTo(bi)<0;i=i.add(BigInteger.ONE))
        {
            for (int j=2;j<100;j++)
            {
              b=i.pow(j);  
              System.out.print(" "+b);
            }
         //refer power digit sum   
        }
    }
    
}
