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
    
    public int p(){
        int p = 0; //change to prime later
        return p;
    }
    
    public int q(){
        int q = 0; //change to prime later
        return q;
    }
    
    public void makePublicKey(int p, int q){
        
        int n= p*q;
        //two numbers e and (p – 1)(q – 1) must be coprime
        //add calcuation of e
        int e;
        
        //return pair(n,e)
    }
    
    public void makePrivateKey(){
        
        //use extended euclidean algorithm for ed = 1 mod (p − 1)(q − 1)
        //want to return (n,d)
    }
    
}
