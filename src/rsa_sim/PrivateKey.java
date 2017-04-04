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
public class PrivateKey extends Keys{ //extend keys
    
    PublicKey PK = new PublicKey(); //need to extract n and e value to form private key
    
    PrivateKey(){
        int n;
        int d;
    }
    
    int d(int e, int p, int q){
        int d = 0; //change later to include calcuation method
        return d;
    }
    
    public void makePrivateKey(){
        
        //use extended euclidean algorithm for ed = 1 mod (p − 1)(q − 1)
        //want to return (n,d)
    }
    
}
