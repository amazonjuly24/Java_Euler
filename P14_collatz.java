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
public class P14_collatz {
   
    public static void main(String args[]){
		
		
		int largest = 0;
		int longest_sequence = 0;
		for(int n = 2; n < 1000001; n++){
			long Number = n;
			int counter = 1;
			while(Number > 1){
				if(Number % 2 == 0){
					Number = Number / 2;
				} else{
					Number = (Number * 3) + 1;
				}
				counter += 1;
			}
			
			if(counter > longest_sequence){
				longest_sequence = counter;
				largest = n;
			}
		}
	
		System.out.format("Answer = %d", largest);
		
	}

}
    
    

