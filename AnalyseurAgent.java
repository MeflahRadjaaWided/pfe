/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sma_test;

import jade.core.Agent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.util.Arrays.asList;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.annolab.tt4j.TreeTaggerException;
import org.annolab.tt4j.TreeTaggerWrapper;




/**
 *
 * @author LENOVO
 */
public class AnalyseurAgent extends Agent{
     @Override
     protected void setup(){
         //les taches de l'agent analyseur
         /*
         1. recupere le pb trouvé m end l'agent interface
         2. il supprime les espaces w (? , . ! ...)
         3. yajbed les mots clé m le pb en eliminant les mots non pertinent lli rahoum f had tableau
         4. apres les mot cles yeddihoum l'agent solution
         */
          //tableau qui contient les mots non pertinent
        String[]  motnonpertinent = new  String[100];
        motnonpertinent[0] = "is"; motnonpertinent[1] = "you"; motnonpertinent[2] = "to";
        motnonpertinent[3] = "not"; motnonpertinent[4] = "or";
        motnonpertinent[5] = "than"; motnonpertinent[6] = "the"; motnonpertinent[7] = "be";
        motnonpertinent[8] = "An"; motnonpertinent[9] = "was";
        motnonpertinent[10] = "has"; motnonpertinent[11] = "other";
       motnonpertinent[12] = "more"; motnonpertinent[13] = "one"; motnonpertinent[14] = "else";
         motnonpertinent[15] = "because"; motnonpertinent[16] = "and"; motnonpertinent[17] = "same"; 
         motnonpertinent[18] = "for"; motnonpertinent[19] = "so";
         motnonpertinent[18] = "but"; motnonpertinent[19] = "yet";
         motnonpertinent[20] = "next";
         motnonpertinent[21] = "also"; motnonpertinent[22] = "too";
         motnonpertinent[23] = "fact"; motnonpertinent[24] = "others";
         motnonpertinent[25] = "this";
           motnonpertinent[26] = "while"; motnonpertinent[27] = "unlike";
           motnonpertinent[28] = "error"; 
           motnonpertinent[29] = "that"; motnonpertinent[30] = "have";
            motnonpertinent[31] = "no"; motnonpertinent[32] = "yes";
            motnonpertinent[33] = "could"; motnonpertinent[34] = "of"; 
         String data = "";
        try {
      File myObj = new File("C:/Users/LENOVO/Desktop/ErrorLogs.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
       data = data + myReader.nextLine();
        //System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      System.out.println(data);
///Vector<String>  parts = new Vector<String>() ;
         String[]  parts = data.split(" ");
         
        for (int i=0 ; i < parts.length; i++)
        {
          System.out.println("eeeeeeeeeeeeeeeeeeeeeeee"+parts[i]);
        }
         
         
         
         

      
    System.setProperty("treetagger.home", "C:/TreeTagger");
    TreeTaggerWrapper tt = new TreeTaggerWrapper<String>();
    try {
      tt.setModel("C:/TreeTagger/lib/english.par:iso8859-1");

      tt.setHandler((token, pos, lemma) -> 
        System.out.println(token + "\t" + pos + "\t" + lemma));
     // System.out.println("P1: "+part1);
     // System.out.println("P2: "+part2);
    // System.out.println("T : "+parts.length);
    
    // float A = parts.length;
     // double pertinent = 1 / A;
//System.out.println("la pertinence du mot est : "+pertinent);

      tt.process(asList(parts));
    }
         catch (IOException ex) {
             Logger.getLogger(AnalyseurAgent.class.getName()).log(Level.SEVERE, null, ex);
         } catch (TreeTaggerException ex) {
             Logger.getLogger(AnalyseurAgent.class.getName()).log(Level.SEVERE, null, ex);
         }    finally {
      tt.destroy();
    }
    }
}
