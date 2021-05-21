/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fineanno;

import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;

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

    public Accesso[] getElencoStanze() {
        return elencoStanze;
    }

    public int getAccessiPresenti() {
        return accessiPresenti;
    }

    public int getStanzeOccupate() {
        return stanzeOccupate;
    }

    public void setElencoStanze(Accesso[] elencoStanze) {
        this.elencoStanze = elencoStanze;
    }

    public void setAccessiPresenti(int accessiPresenti) {
        this.accessiPresenti = accessiPresenti;
    }

    public void setStanzeOccupate(int stanzeOccupate) {
        this.stanzeOccupate = stanzeOccupate;
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
    
    public LocalDateTime visualizzaPermanenza(String cognome, String nome)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
    
     for (int i=0; i<elencoAccessi.length; i++)
        {
            if(elencoAccessi[i]!=null)
            {
                if(elencoAccessi[i].getNome().equalsIgnoreCase(nome) && elencoAccessi[i].getCognome().equalsIgnoreCase(cognome))
                {
                    String res="Permanenza: "+elencoAccessi[i].getDataAccesso().format(formatter)+" --- "+elencoAccessi[i].getDataUscita().format(formatter);
                }
            } 
        }
        return null;
    }
    
    
   public Accesso[] visualizzaOrdineAlfabetico ()
   {
     int n=0;
     for (int i=0; i<this.getStanzeOccupate(); i++)
     {
         if(elencoStanze[i]!=null)
         {
             n++;
         }
     }
     if(n==0)
     {
         return null;
     }
     Accesso[] elencoOrdinato = new Accesso[n];
     
     int p=0;
     
     for (int i=0; i<this.getStanzeOccupate(); i++)
     {
         if(elencoStanze[i]!=null)
         {
             elencoOrdinato[p] = elencoStanze[i];
             p++;
         }
     }
     elencoOrdinato = Ordinatore.selectionSortAfabeticoAccessi(elencoOrdinato);
     
     return elencoOrdinato;
   }
    
       
}
