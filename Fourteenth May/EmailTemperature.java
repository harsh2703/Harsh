package com.c2.training;

import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;
import javax.mail.*;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.net.*;

public class EmailTemperature extends TimerTask {

	public static void main(String[] args) throws JSONException, IOException {
		// TODO Auto-generated method stub
		try {
			Timer t = new Timer();
			t.schedule(new EmailTemperature(), 0, 9000);

<<<<<<< HEAD
			URL url = new URL("http://api.weatherstack.com/current?access_key=ec8267c71393e51822225bf04db46e65&query=New%20York&units=m");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
				
=======
	        URL url = new URL("http://api.weatherstack.com/current?access_key="your_key_here"&query=New%20York&units=m");
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");

>>>>>>> 0ce32566bf2837d36dc179100eebd99ad0a26193
	        
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

<<<<<<< HEAD
			String res = br.readLine();
			   JSONObject obj1 = new JSONObject(res);
			String host="SMTP HOST"; //change accordingly 
			final String user="FROM EMAIL"; //change accordingly  
			final String password="PASSWORD"; //change accordingly  
			    
			String to="TO EMAIL"; //change accordingly  
				
			//Get the session object  
			Properties props = new Properties();  
			props.put("mail.smtp.auth", "true");  
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host",host);  
			props.put("mail.smtp.port", "PORT NUMBER"); //change accordingly
				
			Session session = Session.getDefaultInstance(props, 
					new javax.mail.Authenticator() {  
				protected PasswordAuthentication getPasswordAuthentication() {  
					return new PasswordAuthentication(user,password);  
				}  
			});
=======
	        String output;
	        System.out.println("Output from Server .... \n");
	        while ((output = br.readLine()) != null) {
	            System.out.println(output);
	        }
	        String host="smtp.gmail.com";  
			  final String user="abc@xyz.com";//change accordingly  
			  final String password="**********";//change accordingly  
			    
			  String to="xyz@hbs.com";//change accordingly  
			  
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
>>>>>>> 0ce32566bf2837d36dc179100eebd99ad0a26193
			   
			try {  
					MimeMessage message = new MimeMessage(session);  
					message.setFrom(new InternetAddress(user));  
					message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
					message.setSubject("Temperature Details: ");  
					message.setText("City: "
				    		+obj1.getJSONObject("location").getString("name")+"\nCurrent Temperature: "+obj1.getJSONObject("current").getString("temperature"));  
						
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
	@Override
	   public void run() {
	}
}
	