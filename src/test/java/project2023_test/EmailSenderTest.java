package project2023_test;

import org.junit.Test;

import mycleann.EmailSenderrr;

import static org.junit.Assert.assertTrue;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class EmailSenderTest {
	@Test
	public void testSendEmail() throws AddressException, MessagingException {
	    EmailSenderrr emailSender = new EmailSenderrr("smtp.gmail.com", "587", "adham yaqoub", "0594348312Amamry");
	    emailSender.sendEmail("amamry2021.2002@gmail.com", "hello");

	    assertTrue("Email should have been sent successfully", emailSender.isSentSuccessfully());
	}


    
}

