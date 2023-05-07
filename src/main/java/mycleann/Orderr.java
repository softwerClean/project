package mycleann;

public class Orderr {
	  private String name;

    private String id;
    private String customerName;
    private String customerEmail;

    public Orderr(String id, String customerName, String customerEmail) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }
    public Orderr(String name) {
        this.name = name;
      }
      
    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getName() {
        return name;
      }
}
