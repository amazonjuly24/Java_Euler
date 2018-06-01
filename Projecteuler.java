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
public class Projecteuler {

   public static void main(String args[]) {

        // print prime numbers from 1 - 100
        System.out.println("Prime numbers from 1 to 100 ");
  long sum=0;
        for (long i = 2; i <= 2000000; i++) {
          
            if (isPrime(i)) {
                sum=sum+i;
                
            }
        }
                    System.out.print(sum);

    }

    /*
     * An optimized to check if a number is prime or not.
     */
    public static boolean isPrime(long num) {
        if (num == 2 || num == 3||num==5|| num==7) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0|| num %5==0) {
            return false;
        }

        for (long i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0 || num % Math.sqrt(num) == 0) {
                return false;
            }
        }
        return true;

    }
    
}




