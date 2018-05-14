/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.ido.fizzbuzztdd;

import java.util.ArrayList;

/**
 *
 * @author mael.voyame
 */
public class Fizzbuzz {
    ArrayList maListe = new ArrayList();
    
    public Fizzbuzz(){
        
    }
    
    public ArrayList getListe(){
        //int[] maListe = new int[100];
        for(int i = 1; i < 100; i++){
            maListe.add(i);
        }
        return maListe;
    }
    
    public void setFizz(){
        for(int i = 1; i < 100; i++){
            if(i%3 == 0){
                maListe.set(i-1, "Fizz");
            }
        }
    }
    
    public void setBuzz(){
        for(int i = 1; i < 100; i++){
            if(i%5 == 0){
                maListe.set(i-1, "Buzz");
            }
        }
    }
    
    public void setFizzBuzz(){
        for(int i = 1; i < 100; i++){
            if(i%3 == 0){
                if(i%5 == 0){
                    maListe.set(i-1, "FizzBuzz");
                }
            }
        }
    }
}
