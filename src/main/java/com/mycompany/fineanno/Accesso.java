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
public class Accesso {
    
    private String nome;
    private String cognome;
    private int codiceFiscale;
    LocalDateTime dataAccesso;
    LocalDateTime dataUscita;
 
    public Accesso(String nome, String cognome, int codiceFiscale, LocalDateTime dataAccesso, LocalDateTime dataUscita) 
    {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.dataAccesso = dataAccesso;
        this.dataUscita = dataUscita;
    }
    
    public Accesso(String nome, String cognome, int codiceFiscale, LocalDateTime dataAccesso) 
    {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.dataAccesso = dataAccesso;
    }
    
    public Accesso(Accesso a1)
    {
        this.nome= a1.getNome();
        this.cognome= a1.getCognome();
        this.codiceFiscale= a1.getCodiceFiscale();
        this.dataAccesso= a1.getDataAccesso();
        this.dataUscita= a1.getDataUscita();
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
    
    
    
    

}
