package mycleann;


import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class OrderCompleteEmail {

    private static final String EMAIL_FROM = "amamry2021.2002@gmail.com";
    private static final String SMTP_HOST = "smtp.gmail.com";
    private static final int SMTP_PORT = 587;
    private static final String SMTP_USERNAME = "adham yaqoub";
    private static final String SMTP_PASSWORD = enterPassword();
	private static Scanner scanner;

    private static String enterPassword() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the admin password:");
        return scanner.nextLine();
    }
    public static void sendEmail(String customerEmail, String orderId) throws MessagingException {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", SMTP_PORT);

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
        	@Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(SMTP_USERNAME, SMTP_PASSWORD);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(EMAIL_FROM));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(customerEmail));
        message.setSubject("Your order is complete: " + orderId);
        message.setText("Dear customer, your order with ID " + orderId + " has been marked as complete. Thank you for your business!");

        Transport.send(message);
    }
    private OrderCompleteEmail() {
    }
}
