package mycleann;

import java.util.ArrayList;

public class Product 
{

	protected String Category,name,price,amount;
	protected static ArrayList <String[]> products =new ArrayList();
	protected boolean add;
	protected boolean delete;
	protected boolean update;
	protected int var;
	protected int width,hight;
	protected static ArrayList <String[]> find_by_name =new ArrayList();

	
	public Product() 
	{
		
		this.width=width;
		this.hight=hight;
		this.add=false;
		this.delete=false;
		this.update=false;	
	}
	
	public void Product(String Category, String name, String price, String amount)
	{
		this.Category=Category;
		this.name=name;
		this.price=price;
		this.amount=amount;
	}
	
	public boolean add(Admin admin)
	{
		add = false;
	if(admin.isLogged())
	{
		String [] product2 = {this.Category,this.name,this.price,this.amount};
		if(Product.products.add(product2))
			add=true;
	}
	else
	{
		System.out.println("the admin not loggin");
	}
		return add;
		
	}

	public boolean added() {
		// TODO Auto-generated method stub
		return this.add;
	}

	public void PutProduct(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		
	}

	
	public boolean delete(Admin admin)
	{
		delete = false;
		if(admin.isLogged()&&Integer.parseInt(amount)>=1)
			delete = true;

		return add;
	
	}
	
	
	public boolean delete() 
	{
		// TODO Auto-generated method stub
		return this.delete;
	}

	public boolean UpdateMissing(Admin admin) 
	{
		// TODO Auto-generated method stub
		var = Integer.parseInt(amount);
		update= false;
		
		if(admin.isLogged()&&var>=1) 
		{
			var-=1;
			update= true;

		}
		return  update;
	}
	public boolean updateUp(Admin admin) 
	{
		// TODO Auto-generated method stub
		var = Integer.parseInt(amount);
		update= false;
		
		if(admin.isLogged()) 
		{
			var+=1;
			update= true;

		}
		return  update;
	}

	public boolean update() {
		// TODO Auto-generated method stub
		return this.update;
	}
	
}

