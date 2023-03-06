package mycleann;

import java.util.ArrayList;

public class Customers {


	protected String id,name,address,phone;
	protected static ArrayList <String[]> customers =new ArrayList();
	protected boolean add;
	protected boolean delete;
	protected boolean update;
	protected static ArrayList <String[]> find_by_name =new ArrayList();

	
	public Customers() {
		this.add=false;
		this.delete=false;
		this.update=false;	
	}
	
	public void Customers(String id, String name, String address, String phone)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
}
