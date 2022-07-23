/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sma_test;

import jade.core.Agent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class InterfaceAgent extends Agent{

    protected void setup(){
           String data = null;
           //l'agent interface va recuperer le fichier errorLogs et l'afficher
        try {
      File myObj = new File("C:/Users/LENOVO/Desktop/ErrorLogs.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
       data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
   
}
