/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sma_test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import jade.core.Agent;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import static javax.management.Query.div;

/**
 *
 * @author LENOVO
 */
public class SolutionAgent extends Agent{
    Connection con = null;
    protected void setup(){
       /*l'agent solutionn
        1. b hadouk les mots cles lli kharejhoum l'agent analyseur
        ghadi l'agent solution yhawess ela les pb similaire lli f la BDD l le pb lli jbed ses mots cles
        a y affichihoum ga3 par ordre decroissant par rapport le nb de mot cle
 
     
        */
            
           //---------------------------------------------------------------------
        
       ///*****connexion bdd  
            Statement st = null;
            ResultSet rst = null;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           String DbUrl ="jdbc:mysql://localhost/smadb";
            Connection con = DriverManager.getConnection(DbUrl, "root", "");
                       st = con.createStatement();
            
                } catch (ClassNotFoundException ex) {
            Logger.getLogger(SolutionAgent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SolutionAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
        //-----------------------------------------------------------------------------
        ///*****lecture data (le fichier txt)
                 String data = "";
        try {
      File myObj = new File("C:/Users/LENOVO/Desktop/ErrorLogs.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
       data = data + myReader.nextLine();
    
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      //System.out.println(data);

         String[]  parts = data.split(" ");
         //----------------------------------------------------------------------------------
         
      
     
       
    }
     

}
