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
public class PublicKey {
    
     public int p(){
        int p = 0; //change to prime later
        return p;
    }
    
    public int q(){
        int q = 0; //change to prime later
        return q;
    }
    
    public int n(int p, int q){
        int n= p*q;
        return n;
    }
    
    public int e(int n, int p, int q){

        int middleman = (p-1)*(q-1);
        
        //add calcuation of e
        //two numbers e and middleman must be coprime
        int e = 0;
        return e;
       
    }
    //return pair(n,e)
    
    
}
