package com.demo.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendHtmlEmail {

	public static void main(String[] args) {
		String to = "xuhaihua@chinac.com";
		String from = "xuhaihua@chinac.com";
		String host = "smtp.chinac.com";
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", host);
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.user", "xuhaihua@chinac.com");
		props.setProperty("mail.password", "Q1w2e3r4!@");
		Session session = Session.getDefaultInstance(props);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("This is the Subject Line!");
			message.setContent("<h1>This is actual message</h1>", "text/html");
			Transport.send(message); // send
			System.out.println("Sent message successfully....");

		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

}
