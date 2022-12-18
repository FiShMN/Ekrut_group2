// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package controller;

import ocsf.client.*;
import common.*;
import entity.Subscriber;
import gui.ClientMenuController;
import gui.ClientUI;

import java.io.*;
import java.util.ArrayList;

import Entities.Product;
import Entities.Message;
import Entities.Order;


/**
 * This class overrides some of the methods defined in the abstract
 * superclass in order to give more functionality to the client.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;
 * @author Fran&ccedil;ois B&eacute;langer
 * 
 */
public class ChatClient extends AbstractClient
{
  //Instance variables **********************************************
  
  /**
   * The interface type variable.  It allows the implementation of 
   * the display method in the client.
   */
  ChatIF clientUI; 

  
  //Constructors ****************************************************
  
  /**
   * Constructs an instance of the chat client.
   *
   * @param host The server to connect to.
   * @param port The port number to connect on.
   * @param clientUI The interface type variable.
   */
  
  public ChatClient(String host, int port, ChatIF clientUI) 
    throws IOException 
  {
    super(host, port); //Call the superclass constructor
    this.clientUI = clientUI;
    openConnection();
    
  }

  
  //Instance methods ************************************************
    
  /**
   * This method handles all data that comes in from the server.
   *
   * @param msg The message from the server.
   */
  public void handleMessageFromServer(Object msg) 
  {
	  
	  if(msg instanceof String[]) {
		 // ClientMenuController.subFrame.showSubToTable((ArrayList<String>) msg);
		String[] message = (String[]) msg;
		  switch ((String)message[0]) { 
			case "login":
				System.out.println("login:" + message[1]);
				if(message[1].equals("Wrong_Input"))
					ClientMenuController.loginFrame.setAlertLbl("Wrong user name or password!");
				else if(message[1].equals("Already_logged_in"))
					ClientMenuController.loginFrame.setAlertLbl("User already loggedIn");
				else {
				String[] data = message[1].split("#");
				ClientMenuController.loginFrame.openFrameByRole(data[5]); //role in place 5
				}
				break;
	  }
		  }
	  
  }

  /**
   * This method handles all data coming from the UI            
   *
   * @param message The message from the UI.    
   */
  public void handleMessageFromClientUI(Object message)  
  {
    try
    {
    	
    	sendToServer(message);  
    }
    catch(IOException e)
    {
      clientUI.display
        ("Could not send message to server.  Terminating client.");
      quit();
    }
  }
  
  /**
   * This method terminates the client.
   */
  public void quit()
  {
    try
    {
      closeConnection();
    }
    catch(IOException e) {}
    System.exit(0);
  }
}
//End of ChatClient class
