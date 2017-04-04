package rsa_sim;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Jamie!
 * Marleigh
 * @author ElizabethReed PC
 */
public class Encrypter {
    
    PublicKey PublicK = new PublicKey(); //need e and n values to encrypt
    
    Random randomNumbers = new Random();
    
    public int ascii2int(char a){
        int b = (int) a;
        return b;
    }
   
     
    // for strings?        
    public int[] randomArray(int n){
        
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            //changes random number for each iteration
            int rand = randomNumbers.nextInt(n); 
            input[i] = rand;
        }
        
        return input;
    }
    
    public void encrypt(int n, int e, int plaintext){ //pass in the public key, e and n values
        //Ciphertext = Plaintext * e mod n
        int ciphertext = (plaintext * e) % n;
    }
   
}
