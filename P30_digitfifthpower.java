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
public class P30_digitfifthpower {

    public static void main(String args[]) {
        int n = 9474, m, b, r, sum = 0;
        int[] a = new int[4];
        int[] c = new int[4];
        // int x=1634;
        for (int i = 1111; i < 10000; i++) {
            m = i;
            while (m > 0) {
                for (int j = 0; j < 4; j++) {
                    b = m % 10;
                    a[j] = b;

                    //System.out.print(" \t"+a[j]);
                    m = m / 10;

                }
                for (int k = 0; k < 4; k++) {
                    r = (a[k] * a[k] * a[k] * a[k]);
                    sum = sum + r;

                    // int fs=sum+a[k];
                    if (sum == n) {
                        
                        System.out.println("value found");
                    }

                }
                System.out.print(" " + sum);

            }
        }
    }

}
