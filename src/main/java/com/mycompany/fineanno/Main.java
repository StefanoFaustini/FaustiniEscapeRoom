/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fineanno;

import java.time.LocalDateTime;



/**
 *
 * @author work
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Accesso a = new Accesso("Stefano", "Faustini", 0, LocalDateTime.now(), LocalDateTime.of(2021, 5, 18, 18,30));
        System.out.println(a.getNome());
        System.out.println(a.getCognome());
        System.out.println(a.getDataAccesso());
        
        Accesso a1 = new Accesso("Nicola","Ziliani", 0, LocalDateTime.now());
        System.out.println(a1.getNome());
        System.out.println(a1.getCognome());
        
    }    
    
}
