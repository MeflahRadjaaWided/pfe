/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sma_test;
import jade.core.Profile;
import jade.core.Runtime;
import jade.core.ProfileImpl;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
/**
 *
 * @author LENOVO
 */
public class mainContainer {
    
    public static void main(String[] args){
        try{
            Runtime runtime = Runtime.instance();
            Properties properties = new ExtendedProperties();
            properties.setProperty(Profile.GUI, "true");
            ProfileImpl profileImpl = new ProfileImpl(properties);
            AgentContainer mainContainer = runtime.createMainContainer(profileImpl);
            mainContainer.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
