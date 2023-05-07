package mycleann;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;
import java.util.logging.Level;
public class Customers 
{	static Logger logger = Logger.getLogger(FirstClass.class.getName());


	protected List<Double> transactionAmounts;
	protected double totalSpending;
	protected boolean eligibleForDiscount;
	protected String id;
	protected String name;
	protected String address;
	protected String email;
	protected String phone;
	protected static ArrayList <String[]> customers =new ArrayList<String[]>();
	protected boolean add;
	protected boolean delete;
	protected boolean update;
	protected static ArrayList <String[]> find_by_name =new ArrayList<String[]>();

	
	public Customers()
	{
		this.add=false;
		this.delete=false;
		this.update=false;	
		id="";
		name="";
		address="";
		email="";
		phone="";
	}
	
	public void Customers(String id, String name,String email, String address,String phone)
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
		if(Customers.customers.add(customer2))
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
	
	public void putcustomer(String string, String string2, String string3, String string4,String string5) {
		
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

		public boolean UpdateMissing(Admin admin) 
	{
		update= false;
		
		if(admin.isLogged()) 
		{
			
			update= true;

		}
		return  update;
	}
	public boolean updateUp(Admin admin) 
	{
		update= false;
		
		if(admin.isLogged()) 
		{
			update= true;

		}
		return  update;
	}

	public boolean update() {
		return this.update;
	}
	
	
	public String GetEmail() {
		return email;
	}

	public void SetEmail(String email) {
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
	            logger.log(Level.INFO,name + " is eligible for a 10% discount of " + discountAmount + " NIS.");
	        } else {
	        	logger.log(Level.INFO,name + " is not eligible for the discount.");
	        }
			return applyDiscount();
	    }
}
