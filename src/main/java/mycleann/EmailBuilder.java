package mycleann;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailBuilder {

    private MimeMessage message;

    public EmailBuilder(Session session) {
        message = new MimeMessage(session);
    }

    public EmailBuilder setFrom(String from) throws MessagingException {
        message.setFrom(new InternetAddress(from));
        return this;
    }

    public EmailBuilder addTo(String to) throws AddressException, MessagingException {
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        return this;
    }

    public EmailBuilder setSubject(String subject) throws MessagingException {
        message.setSubject(subject);
        return this;
    }

    public EmailBuilder setBody(String body) throws MessagingException {
        message.setText(body);
        return this;
    }

    public MimeMessage build() {
        return message;
    }
}
