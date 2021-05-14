package com.c2.training;

import java.io.*;
import java.util.*;
import java.net.*;
import javax.mail.*;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

	        URL url = new URL("http://api.weatherstack.com/current?access_key=ec8267c71393e51822225bf04db46e65&query=New%20York&units=m");
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");

	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(
	            (conn.getInputStream())));

	        String output;
	        System.out.println("Output from Server .... \n");
	        while ((output = br.readLine()) != null) {
	            System.out.println(output);
	        }
	        String host="smtp.gmail.com";  
			  final String user="harsh.shah.c2@gmail.com";//change accordingly  
			  final String password="ueEGeMGmQ4hW";//change accordingly  
			    
			  String to="harsh.shah@contcentric.com";//change accordingly  
			  
			   //Get the session object  
			   Properties props = new Properties();  
			   props.put("mail.smtp.auth", "true");  
			   props.put("mail.smtp.starttls.enable", "true");
			   props.put("mail.smtp.host",host);  
			   props.put("mail.smtp.port", "2525");
			     
			   Session session = Session.getDefaultInstance(props,  
			    new javax.mail.Authenticator() {  
			      protected PasswordAuthentication getPasswordAuthentication() {  
			    return new PasswordAuthentication(user,password);  
			      }  
			   });
			   
			   try {  
				     MimeMessage message = new MimeMessage(session);  
				     message.setFrom(new InternetAddress(user));  
				     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
				     message.setSubject("javatpoint");  
				     message.setText(output);  
				       
				    //send the message  
				     Transport.send(message);  
				  
				     System.out.println("message sent successfully...");  
				   
				     } catch (MessagingException e) {e.printStackTrace();}  

	        conn.disconnect();

	      } catch (MalformedURLException e) {

	        e.printStackTrace();

	      } catch (IOException e) {

	        e.printStackTrace();

	      }
	}

}
