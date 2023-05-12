package mycleann;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Order {
	static Logger logger = Logger.getLogger(Order.class.getName());

    private String status;
    private String customerEmail;
    private String orderDetails;
    private EmailSenderrr emailSender;

    public Order(String customerEmail, String orderDetails, EmailSenderrr emailSender) {
        this.status = "waiting";
        this.customerEmail = customerEmail;
        this.orderDetails = orderDetails;
        this.emailSender = emailSender;
    }

    public void markAsComplete() {
        this.status = "complete";
        try {
            emailSender.sendEmail(customerEmail, orderDetails);
        } catch (Exception e) {
        	logger.log(Level.INFO, "Failed to send email notification: %s", e.getMessage());
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public EmailSenderrr getEmailSenderrrr() {
        return emailSender;
    }

    public void setEmailSenderrr(EmailSenderrr emailSender) {
        this.emailSender = emailSender;
    }
}

