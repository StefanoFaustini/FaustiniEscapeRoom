/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faustiniescaperoom;

import java.time.LocalDateTime;

/**
 *
 * @author STUDENTE
 */
public class Stanze {
    
    private String nome;
    private String cognome;
    private int codiceFiscale;
    LocalDateTime dataAccesso;
    LocalDateTime dataUscita;
    private final int i=3;
    private int numeroAccessi;
   
   
   
    Stanze [] stanze = new Stanze[i];
   

    public Stanze(String nome, String cognome, int codiceFiscale, LocalDateTime dataAccesso, LocalDateTime dataUscita)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.dataAccesso = dataAccesso;
        this.dataUscita = dataUscita;
    }
   
   
    public Stanze(Stanze s)
    {
        this.nome=s.nome;
        this.cognome=s.cognome;
        this.codiceFiscale=s.codiceFiscale;
        this.dataAccesso=s.dataAccesso;
        this.dataUscita=s.dataUscita;
    }
   

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getCodiceFiscale() {
        return codiceFiscale;
    }

    public LocalDateTime getDataAccesso() {
        return dataAccesso;
    }

    public LocalDateTime getDataUscita() {
        return dataUscita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodiceFiscale(int codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setDataAccesso(LocalDateTime dataAccesso) {
        this.dataAccesso = dataAccesso;
    }

    public void setDataUscita(LocalDateTime dataUscita) {
        this.dataUscita = dataUscita;
    }
   
   
    public String toString()
    {
        String s="";
       
        System.out.println("");
       
        return s;
       
    }
   
    private void registraAccessi(String nome, String cognome, int codiceFiscale, LocalDateTime dataAccesso)
    {
        int numeroAccessi=0;
       
        for (int j=0; j<i; j++)
        {
            numeroAccessi++;
           
        }
    }
    
    
    
}
