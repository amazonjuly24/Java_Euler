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
public class P12_trianglesum {
    public static void main(String args[])
    {   int n = 10000;
  
        long[] a=new long[1000000];
        long[] b=new long[1000000];
        
              // b[0]=1;
            long n1=n;
        for(int i=0;i<n1;i++)
        {
            a[i]=i+1;
            // System.out.print(a[i]+" ");
//              
         
        }
         
        for(int j=0;j<n1;j++)
        {
            for(int k=0;k<=j;k++){
           b[j]=b[j]+a[k]; 
           //System.out.print("\n");
           long c=0;
           if(b[j]%2==0||b[j]%5==0){
               for(long m=1;m<=b[j];m++)
               {
                  
                   if(b[j]%m==0)
                   {
                       c++;
                     //System.out.print(c+" ");
                      if(c>500)
                      {
                          System.out.print(m);
                      }
                   }}
               }
           }
           
        
           // System.out.print(b[j]+" ");
        }
       
       //for(int m=0)
        System.out.print("\n ");
       
    }
}
