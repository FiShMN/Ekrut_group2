package controller;

import java.io.*;
import java.net.Inet4Address;
import java.util.ArrayList;

import db.mysqlConnection;
import ocsf.server.*;
import gui.ServerPortFrameController;
import gui.ServerUI;
import db.ShowSubscriber;
import db.UpdateDB;
/**
 * This class overrides some of the methods in the abstract superclass in order
 * to give more functionality to the server.
 *
 * @author Aviram Fishman
 * @author Hanna Kruchenetzky
 * @author Nofar Oshri Bensimon
 * @author Asaf Schneiderman
 * @author marina.shteinfer
 */

public class EchoServer extends AbstractServer {
	// Class variables *************************************************

	/**
	 * The default port to listen on.
	 */
	final public static int DEFAULT_PORT = 5555;
	public static int clientNumber = 1;
	// Constructors ****************************************************

	/**
	 * Constructs an instance of the echo server.
	 *
	 * @param port The port number to connect on.
	 */
	public EchoServer(int port) {
		super(port);
	}

	// Instance methods ************************************************

	/**
	 * This method handles any messages received from the client.
	 *
	 * @param msg    The message received from the client.
	 * @param client The connection from which the message originated.
	 */
	public void handleMessageFromClient(Object msg, ConnectionToClient client) {
		  
		if(msg instanceof String) {
			
			if(msg.toString().equals("disconnect")) {
				ServerUI.serverGUI.appendToConsole( client.getName() + " has disconnected"); 
			}
			else {
			client.setName("client #"+clientNumber+" (" +msg.toString()+ ") ");
			clientNumber++;
			ServerUI.serverGUI.appendToConsole( client.getName() + " connected successfully"); 
			}
				
		}
		else {
		  ArrayList<String> message = (ArrayList<String>)msg;
		  try {
			  if(message.size() == 3) {
		  UpdateDB.UpdateSubscriberCreditCard(message.get(2), message.get(0));
		  
		  //if(message.get(2).equals(null))
		  UpdateDB.UpdateSubscriberId(message.get(1), message.get(0)); 
		  }
			  
		 msg = (Object)ShowSubscriber.getSubscribers();
			  
		  message.clear();
		  }catch(Exception e) { System.out.println(message + " : not saved"); }
		
		  ServerUI.serverGUI.appendToConsole("Message received from " + client.getName()); 
		}
		
		 try {
			 
			client.sendToClient(msg);   //send to client subscriber DB 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}

	/**
	 * This method overrides the one in the superclass. Called when the server
	 * starts listening for connections.
	 */
	protected void serverStarted() {
		// mysqlConnection.connectionDb(); //connecting to server.
		ServerUI.serverGUI.appendToConsole("Server listening for connections on port " + getPort());
	}

	/**
	 * This method overrides the one in the superclass. Called when the server stops
	 * listening for connections.
	 */
	protected void serverStopped() {
		ServerUI.serverGUI.appendToConsole("Server has stopped listening for connections.");
	}

	// Class methods ***************************************************

	/**
	 * This method is responsible for the creation of the server instance (there is
	 * no UI in this phase).
	 *
	 * @param args[0] The port number to listen on. Defaults to 5555 if no argument
	 *                is entered.
	 */
}
//End of EchoServer class
