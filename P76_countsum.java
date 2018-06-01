/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**9
 *
 * @author Manju
 */
public class P76_countsum {
    public static void main (String[] args)
    {
        int n=100;
        int[] a=new int[n+1];
        a[0]=1;
        for(int i=1;i<n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                a[j]=a[j]+a[j-i];
                System.out.print("\n"+a[j]+"\n");
            }
        }
        
    }
    
}
