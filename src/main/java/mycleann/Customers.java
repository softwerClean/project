package mycleann;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Customers {

    private static final Logger logger = Logger.getLogger(Customers.class.getName());
    protected static ArrayList <String[]> customers =new ArrayList<String[]>();
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone;
    protected boolean add;
    private List<Double> transactionAmounts = new ArrayList<Double>();
    private double totalSpending;
    private boolean eligibleForDiscount;

    public Customers(String id, String name, String address, String phone,String email ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
      
    }

    public Customers() {
		// TODO Auto-generated constructor stub
	}

	public boolean add(Admin admin) {
        if (!admin.isLogged()) {
            logger.log(Level.INFO, "Admin is not logged in.");
            return false;
        }

        String[] customer = {id, name, address, phone};
        if (Customers.customers.add(customer)) {
            return true;
        } else {
            logger.log(Level.WARNING, "Failed to add customer.");
            return false;
        }
    }

    public boolean delete(Admin admin) {
        if (!admin.isLogged()) {
            logger.log(Level.INFO, "Admin is not logged in.");
            return false;
        }

        return true;
    }

    public boolean update(Admin admin) {
        if (!admin.isLogged()) {
            logger.log(Level.INFO, "Admin is not logged in.");
            return false;
        }

        return true;
    }

    public void addTransaction(double amount) {
        transactionAmounts.add(amount);
        totalSpending += amount;
        if (totalSpending > 400) {
            eligibleForDiscount = true;
        }
    }

    public double getTotalSpending() {
        return totalSpending;
    }

    public boolean isEligibleForDiscount() {
        return eligibleForDiscount;
    }

    public boolean applyDiscount() {
        if (eligibleForDiscount) {
            double discountAmount = totalSpending * 0.1;
            logger.log(Level.INFO, name + " is eligible for a 10% discount of " + discountAmount + " NIS.");
            return true;
        } else {
            logger.log(Level.INFO, name + " is not eligible for the discount.");
            return false;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	public boolean UpdateMissing(Admin admin) 
{
	boolean update = false;
	
	if(admin.isLogged()) 
	{
		
		update= true;

	}
	return  update;
}
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
	public boolean addded() {
	return this.add;
}
}


//package mycleann;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import java.util.logging.Logger;
//import java.util.logging.Level;
//public class Customers 
//{	
//	static Logger logger = Logger.getLogger(Customers.class.getName());
//
//
//	protected List<Double> transactionAmounts;
//	protected double totalSpending;
//	protected boolean eligibleForDiscount;
//	protected String id;
//	protected String name;
//	protected String address;
//	protected String email;
//	protected String phone;
//	protected static ArrayList <String[]> customers =new ArrayList<String[]>();
//	protected boolean add;
//	protected boolean delete;
//	protected boolean update;
//	
//	public Customers()
//	{
//		this.add=false;
//		this.delete=false;
//		this.update=false;	
//		id="";
//		name="";
//		address="";
//		email="";
//		phone="";
//	}
//	
//	public void ret(String id, String name,String email, String address,String phone)
//	{
//		this.id=id;
//		this.name=name;
//		this.email=email;
//		this.address=address;
//		this.phone=phone;
//		 this.transactionAmounts = new ArrayList<Double>();
//	        this.totalSpending = 0;
//	        this.eligibleForDiscount = false;
//	}
//	
//
//	public boolean addd(Admin admin)
//	{
//		add = false;
//	if(admin.isLogged())
//	{
//		String [] customer2 = {this.id,this.name,this.address,this.phone};
//		if(Customers.customers.add(customer2))
//			add=true;
//	}
//	else
//	{
//		logger.log(Level.INFO,"the admin not loggin");
//	}
//		return add;
//		
//	}
//
//	public boolean addded() {
//		return this.add;
//	}
//	
//	public void putcustomer(String string, String string2, String string3, String string4,String string5) {
//		
//	}
//
//		public boolean delete(Admin admin)
//	{
//		delete = false;
//		if(admin.isLogged())
//			delete = true;
//
//		return delete;
//	
//	}
//	
//	
//	public boolean delete() 
//	{
//		return this.delete;
//	}
//
//		public boolean UpdateMissing(Admin admin) 
//	{
//		update= false;
//		
//		if(admin.isLogged()) 
//		{
//			
//			update= true;
//
//		}
//		return  update;
//	}
//	public boolean updateUp(Admin admin) 
//	{
//		update= false;
//		
//		if(admin.isLogged()) 
//		{
//			update= true;
//
//		}
//		return  update;
//	}
//
//	public boolean update() {
//		return this.update;
//	}
//	
//	
//	public String GetEmail() {
//		return email;
//	}
//
//	public void SetEmail(String email) {
//		this.email = email;
//	}
//	
//	 public void addTransaction(double amount) {
//	        transactionAmounts.add(amount);
//	        totalSpending += amount;
//	        if (totalSpending > 400) {
//	            eligibleForDiscount = true;
//	        }
//}
//	 
//	 public double getTotalSpending() {
//	        return totalSpending;
//	    }
//
//	    public boolean isEligibleForDiscount() {
//	        return eligibleForDiscount;
//	    }
//	    
//	    public boolean applyDiscount() {
//	        if (eligibleForDiscount) {
//	            double discountAmount = totalSpending * 0.1;
//	            logger.log(Level.INFO,name + " is eligible for a 10% discount of " + discountAmount + " NIS.");
//	        } else {
//	        	logger.log(Level.INFO,name + " is not eligible for the discount.");
//	        }
//			return applyDiscount();
//	    }
//}
