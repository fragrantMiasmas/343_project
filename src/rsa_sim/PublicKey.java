/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa_sim;

import java.util.Random;

/**
 *
 * @author ElizabethReed PC
 */
public class PublicKey {
    
    Random randomNumbers = new Random();
    
     //return pair(n,e)
    PublicKey(){
        int n;
        int e;
    }
    
//    public boolean isPrime(){
//        
//    }
    
    int p(){
//        int p = randomNumbers.nextInt(100); //change to random prime later
        int p = 7;
        return p;
    }
    
    int q(){
//        int q = randomNumbers.nextInt(100); //change to random prime later
        int q = 13;
        return q;
    }
    
    public int n(int p, int q){
        int n= p*q;
        return n;
    }
    
    public int e(int n, int p, int q){

        int middleman = (p-1)*(q-1);
        
        //two numbers e and middleman must be coprime, need to check later
        int e = randomNumbers.nextInt(middleman) + 1; //e must fall between 1 and middleman
        return e;
       
    }
      
    
}
