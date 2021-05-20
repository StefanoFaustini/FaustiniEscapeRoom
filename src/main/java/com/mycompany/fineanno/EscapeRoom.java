/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fineanno;

/**
 *
 * @author work
 */
public class EscapeRoom {
    
    private Accesso[] elencoAccessi;
    private final int N_MAX_ACCESSI=3;
    private int accessiPresenti;

    public EscapeRoom() 
    {
        elencoAccessi= new Accesso[N_MAX_ACCESSI];
        this.accessiPresenti=0;
    }
    
    

    public Accesso[] getElencoAccessi() 
    {
        return elencoAccessi;
    }

    public int getN_MAX_ACCESSI() 
    {
        return N_MAX_ACCESSI;
    }

    public void setElencoAccessi(Accesso[] elencoAccessi) 
    {
        this.elencoAccessi = elencoAccessi;
    }
    
    
    public int aggiungiAccesso(Accesso a1)
    {
        for (int i=0; i<elencoAccessi.length; i++)
        {
            if(elencoAccessi[i]==null)
            {
                elencoAccessi[i]=new Accesso(a1);
                this.accessiPresenti++;
                return 0;
            }
           
        }
        return -1;
    }
    
    
    
    
}
