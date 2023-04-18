package mycleann;

import java.util.ArrayList;

public class Customers 
{


	protected String id,phone;
	protected String name;
	protected String address;
	protected String code;
	protected String city;
	private String email;
	protected static ArrayList <String[]> customers =new ArrayList();
	protected boolean add;
	protected boolean delete;
	protected boolean update;
	protected static ArrayList <String[]> find_by_name =new ArrayList();

	
	public Customers()
	{
		this.add=false;
		this.delete=false;
		this.update=false;	
		id="";
		name="";
		address="";
		code="";
		city="";
		email="";
		this.phone=phone;
	}
	
	public void Customers(String id, String name,String email, String address, String code,String city)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
		this.code=code;
		this.city=city;
	
	}
	public String GetEmail() {
		return email;
	}

	public void SetEmail(String email) {
		this.email = email;
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
		System.out.println("the admin not loggin");
	}
		return add;
		
	}

	public boolean addded() {
		// TODO Auto-generated method stub
		return this.add;
	}
	
	public void putcustomer(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return this.delete;
	}

		public boolean UpdateMissing(Admin admin) 
	{
		// TODO Auto-generated method stub
		update= false;
		
		if(admin.isLogged()) 
		{
			
			update= true;

		}
		return  update;
	}
	public boolean updateUp(Admin admin) 
	{
		// TODO Auto-generated method stub
		update= false;
		
		if(admin.isLogged()) 
		{
			update= true;

		}
		return  update;
	}

	public boolean update() {
		// TODO Auto-generated method stub
		return this.update;
	}
}
