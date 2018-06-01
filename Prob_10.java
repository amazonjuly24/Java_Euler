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
public class Prob_10 {
    public static void main(String args[])
    {
        long b=0,n=1000,m;
        for(int a=2;a<=1000;a++)
        {
            m=n*n/(2*(n-a));
            b=n-m;
            long c=n-a-b;
             if((a*a+b*b)==c*c){
              System.out.println((int)(a*b*(n-a-b)));
              break;
          }
        }
    }
}
