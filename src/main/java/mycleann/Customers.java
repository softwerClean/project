package mycleann;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;
import java.util.logging.Level;
public class Customers 
{	
	static Logger logger = Logger.getLogger(Customers.class.getName());


	protected List<Double> transactionAmounts;
	protected double totalSpending;
	protected boolean eligibleForDiscount;
	protected String id;
	protected String name;
	protected String address;
	protected String email;
	protected String phone;
	protected static ArrayList <String[]> customerList = new ArrayList<String[]>();
	protected boolean add;
	protected boolean delete;
	protected boolean isUpdated ;
	
	public Customers()
	{
		this.add=false;
		this.delete=false;
		this.isUpdated =false;	
		id="";
		name="";
		address="";
		email="";
		phone="";
	}
	
	public void ret(String id, String name,String email, String address,String phone)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
		this.phone=phone;
		 this.transactionAmounts = new ArrayList<Double>();
	        this.totalSpending = 0;
	        this.eligibleForDiscount = false;
	}
	

	public boolean addd(Admin admin)
	{
		add = false;
	if(admin.isLogged())
	{
		String [] customer2 = {this.id,this.name,this.address,this.phone};
		if(Customers.customerList.add(customer2))
			add=true;
	}
	else
	{
		logger.log(Level.INFO,"the admin not loggin");
	}
		return add;
		
	}

	public boolean addded() {
		return this.add;
	}
	

		public boolean delete(Admin admin)
	{
		delete = false;
		if(admin.isLogged())
			delete = true;

		return delete;
	
	}
	
	
	public boolean delete() 
	{
		return this.delete;
	}


		public boolean updateMissing(Admin admin) 
		{
		    isUpdated = false;
		    if (admin.isLogged()) 
		    {
		        isUpdated = true;
		    }
		    return isUpdated;
		}
	public boolean updateCustomer(Admin admin) {
	     isUpdated = false;
	    if (admin.isLogged()) {
	        isUpdated = true;
	    } else {
	        logger.log(Level.INFO, "Admin not logged in");
	    }
	    return isUpdated;
	}
	public boolean update() {
		return this.isUpdated ;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	            logger.log(Level.INFO, String.format("%s is eligible for a 10%% discount of %.2f NIS.", name, discountAmount));
	        } else {
	            logger.log(Level.INFO, name + " is not eligible for the discount.");
	        }
	        return applyDiscount();
	    }

}
