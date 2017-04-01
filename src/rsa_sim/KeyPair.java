/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa_sim;

/**
 *
 * @author ElizabethReed PC
 */
public class KeyPair {
    
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
       
        int middleman = (p-1)*(q-1);
        //add calcuation of e
        //two numbers e and middleman must be coprime
        int e;
        
        //return pair(n,e)
    }
    
    public void makePrivateKey(){
        
        //use extended euclidean algorithm for ed = 1 mod (p − 1)(q − 1)
        //want to return (n,d)
    }
    
}
