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
public class Decrypt {
    
    PrivateKey PrivateK = new PrivateKey(); //need d and n values
    
     public char int2ascii(int b){ //convert random number back to ascii
        char a = (char) b;
        return a;
    }
     
     public void decrypt(int n, int d){ //pass in private key
         //Plaintext = Ciphertext * d mod n
     }
    
}
