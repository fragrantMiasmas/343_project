package rsa_sim;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ElizabethReed PC
 */
public class Encrypt {
    
     Random randomNumbers = new Random();
    
    public int ascii2int(char a){
        int b = (int) a;
        return b;
    }
    
     public int randomNum(int b, int n){ //converts ascii to random number
         int rand = randomNumbers.nextInt(n); 
         return rand;
     }
     
    // for strings        
    public int[] randomArray(int n){
        
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            //changes random number for each iteration
            int rand = randomNumbers.nextInt(n); 
            input[i] = rand;
        }
        
        return input;
    }
    
    public void encrypt(){ //pass in the public key
        //Ciphertext = Plaintext * e mod n
    }
   
}
