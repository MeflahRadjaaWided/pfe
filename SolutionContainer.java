/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sma_test;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
/**
 *
 * @author LENOVO
 */
public class SolutionContainer {
    public static void main(String[] args){
         try{
             Runtime runtime = Runtime.instance();
            ProfileImpl profileImpl = new ProfileImpl(false);
            profileImpl.setParameter(ProfileImpl.MAIN_HOST, "localhost");
            AgentContainer agentContainer = runtime.createAgentContainer(profileImpl);
            AgentController agentController = agentContainer.createNewAgent
        ("Solution", SolutionAgent.class.getName(), new Object[]{});
            agentController.start();
             
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    
}
