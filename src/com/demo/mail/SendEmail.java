package com.demo.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {
		String to = "xuhaihua@chinac.com";
		String from = "test@chinac.com";
		String host = "localhost";
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", host);
		Session session = Session.getDefaultInstance(props);
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("This is the Subject Line!");
			message.setText("This is actual message");
			Transport.send(message);  // send
			System.out.println("Sent message successfully....");
			
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
		
	}

}
