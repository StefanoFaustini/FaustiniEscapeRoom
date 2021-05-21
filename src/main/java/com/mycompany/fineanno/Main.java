/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fineanno;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;




/**
 *
 * @author work
 */
public class Main {
    
    
    public static void main(String[] args) {
       
        String[] vociMenu = new String[11];
        int sceltaUtente = -1;
        
        Scanner Tastiera = new Scanner(System.in);
        
       EscapeRoom e1= new EscapeRoom();
       
       int esitoOperazione;
       
       Accesso accesso;
       
       String nomeFileCSV = "EscapeRoom.txt";
       String nomeFileBinario = "EscapeRoom.bin";
                
                
        vociMenu[0] = "Esci";
        vociMenu[1] = "Aggiungi libro";
        vociMenu[2] = "Visualizza libro";
        vociMenu[3] = "Rimuovi libro";
        vociMenu[4] = "Ottieni titoli dei libri di un autore";
        vociMenu[5] = "Visualizza libri presenti";
        vociMenu[6] = "Visualizza elenco alfabetico";
        vociMenu[7] = "visualizza elenco libri ordinati per prezzo";
        vociMenu[8] = "Visualizza elenco libri per autore in ordine alfabetico";
        vociMenu[9] = "Esporta libri in formato csv";
        vociMenu[10]="Salva dati";
        
        Menu menu= new Menu(vociMenu);
        
        //deserializzazione
        
        try 
        {
            
            s1=s1.caricaScaffale(nomeFileBinario);
            System.out.println("Dati caricati correttamente");
        }
        catch (IOException ex) 
        {
            System.out.println("Impossibile accedere al file. I dati non sono stati caricati");
        }
        catch (FileExeption ex) 
        {
            System.out.println("Errore di lettura dal file. I dati non sono stati caricati");
        }
        
        do
        {
            try
            {
                 sceltaUtente=menu.sceltaMenu();
            switch(sceltaUtente)
            {
                case 0:
                {
                    System.out.println("L'applicazione terminerà");
                    break;
                }
                case 1:
                {
                   
                    System.out.println("Nome--> ");
                    accesso.setNome(tastiera.nextLine());
                    System.out.println("Cognome--> ");
                    accesso.setCognome(tastiera.nextLine());
                    System.out.println("Codice Fiscale--> ");
                    accesso.setCodiceFiscale(tastiera.nextInt());
                    System.out.println("Data Ingresso--> ");
                    ripiano = tastiera.nextInt();
                    System.out.println("Data Uscita--> ");
                    posizione = tastiera.nextInt();
                    try
                    {
                          s1.setLibro(libro,ripiano ,posizione );
                          System.out.println("inserimento avvenuto correttamente!");
                    }
                    catch(EccezionePosizioneNonValida e1)
                    {
                        System.out.println(e1.toString());
                    }
                     catch(EccezionePosizioneNonVuota e2)
                    {
                        System.out.println(e2.toString());
                    }
                    
                   
                    
                   
                    System.out.println("premi un pulsante per continuare.!");
                    tastiera.nextLine();
                    break;
                }
                 case 2:
                {
                    //visualizza libro
                    System.out.println("ripiano [1..4]--> ");
                    ripiano = tastiera.nextInt();
                    System.out.println("posizione [1..14]--> ");
                    posizione = tastiera.nextInt();
                    try
                    {
                        libro =s1.getLibro(ripiano, posizione);
                         if (libro == null)
                        System.out.println("nessun libro presente in questa posizione");
                    else 
                        System.out.println(libro.toString());
                    }
                    catch(EccezionePosizioneNonValida e1)
                    {
                        System.out.println(e1.toString());
                    }
                    
                   
                    System.out.println("premi un pulsante per continuare.");
                    tastiera.nextLine();
                    break;
                }
                 case 3:
                {
                    //elimina libro
                    System.out.println("ripiano [1..4]-->");
                    ripiano = tastiera.nextInt();
                    System.out.println("posizione [1..14]-->");
                    posizione = tastiera.nextInt();
                    try
                    {
                        s1.rimuoviLibro(ripiano, posizione);
                        System.out.println("libro eliminato correttamente");
                    }
                    catch(EccezionePosizioneNonValida e1)
                    {
                        System.out.println(e1.toString());
                    }
                     catch(EccezionePosizioneVuota e2)
                    {
                        System.out.println(e2.toString());       
                    }
                    
                    
                   
                    System.out.println("premi un pulsante per continuare.");
                    tastiera.nextLine();
                    break;
                
                    
                        
                }
                 case 4:
                {
                    //cerca libro in base  ad Autore
                    String[] elencoTitoli;
                    String autore;
                    System.out.println("Autore-->");
                    autore = tastiera.nextLine();
                    try
                    {
                        elencoTitoli = s1.elencoTitoliAutore(autore);
                         if (elencoTitoli == null)
                        System.out.println("nessun libro di "+autore);
                    else
                    {
                        for (int i=0;i<elencoTitoli.length;i++)
                             System.out.println(elencoTitoli[i]);
                    }
                    }
                    catch(EccezionePosizioneNonValida e1)
                    {
                        System.out.println(e1.toString());
                    }
                    
                   
                    System.out.println("premi un pulsante per continuare.");
                    tastiera.nextLine();
                    break;
                }
                 case 5:
                {
                    System.out.println(s1.toString()); 
                    System.out.println("premi un pulsante per continuare.");
                    tastiera.nextLine();
                    break;
                }
                 case 6:
                 {
                     try
                     {
                         System.out.println(s1.elencoAlfabeticoLibri());
                     }
                     catch(EccezionePosizioneNonValida e1)
                     {
                         System.out.println(e1.toString());
                     }
                     
                     break;
                 }
                 case 7:
                 {
                     Libro[] elencoLibri;
                     try
                     {
                         elencoLibri=s1.elencoLibriOrdinatiPrezzo();
                     for(int i=0;i<elencoLibri.length;i++)
                     {
                         System.out.println(elencoLibri[i].toString() +" € " + elencoLibri[i].prezzo());
                     }
                     }
                     catch(EccezionePosizioneNonValida e1)
                     {
                         System.out.println(e1.toString());
                     }
                     
                     break;
                 }
                 case 8:
                 {
                     Libro[] elencoLibri;
                     try
                     {
                         elencoLibri=s1.elencoLibriAlfabeticoAutoreTitolo();
                     for(int i=0;i<elencoLibri.length;i++)
                     {
                         System.out.println(elencoLibri[i].toString() +" € " + elencoLibri[i].prezzo());
                     }
                     }
                     catch(EccezionePosizioneNonValida e1)
                     {
                         System.out.println(e1.toString());
                     }
                     
                     break;
                 }
                 case 9:
                 {
                     try
                     {
                        s1.esportaLibri(nomeFileCSV);
                         System.out.println("esportazione avvenuta correttamente!");
                     }
                     catch(IOException e1)
                     {
                         System.out.println("Impossibile accedere al file, i libri non sono stati salvati.");
                     }
                     catch(EccezionePosizioneNonValida | FileExeption  e2)
                     {
                         System.out.println(e2.toString());
                     }
                 
                     break;
                 }
                 case 10:
                 {//serializzazione
                     try 
                     {
                         s1.salvaScaffale(nomeFileBinario);
                         System.out.println("Dati salvati correttamente");
                     } catch (IOException ex) 
                     {
                         System.out.println("Impossibile accedere al file. I dati non sono stati salvati");
                         
                     }
                     break;
                 }
             
             }
            }
            catch(InputMismatchException | NumberFormatException e1)
            {
                tastiera.nextLine();
                System.out.println("Input non corretto");
            }
           
            
        }while(sceltaUtente!=0);
        
    }    
    
}
