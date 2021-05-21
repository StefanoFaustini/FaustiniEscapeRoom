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
    private Accesso[] elencoStanze;
    private final int N_MAX_ACCESSI=3;
    private int accessiPresenti;
    private int stanzeOccupate;
    public EscapeRoom() 
    {
        elencoAccessi= new Accesso[100];
        elencoStanze= new Accesso[N_MAX_ACCESSI];
        this.accessiPresenti=0;
        this.stanzeOccupate=0;
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
        for (int i=0; i<elencoStanze.length; i++)
        {
            if(elencoStanze[i]==null)
            {
                elencoStanze[i]=new Accesso(a1);
                this.stanzeOccupate++;
                return 0;
            }
           
        }
        return -1;
    }
    
    
    public int eliminaAccesso(int codiceFiscale)
    {
         for (int i=0; i<elencoStanze.length; i++)
        {
            if(elencoStanze[i]!=null)
            {
                if(elencoStanze[i].getCodiceFiscale()==codiceFiscale)
                {
                    elencoAccessi[accessiPresenti]=new Accesso(elencoStanze[i]);
                    elencoStanze[i]=null;
                    stanzeOccupate--;
                    return 0;
                }
            } 
        }
        return -1;
    }
    
       
}
