package mycleann;

import java.util.ArrayList;
import java.util.List;

public class Product 
{

	protected String Category,price,amount;
	private String name;
	protected static ArrayList <String[]> products =new ArrayList();
	protected boolean add;
	protected boolean delete;
	protected boolean found;
	protected boolean update;
	protected int var;
	protected int width,hight;
	protected static ArrayList <Product> find_by_name =new ArrayList();

	
	public Product() 
	{
		
		this.width=width;
		this.hight=hight;
		this.add=false;
		this.delete=false;
		this.update=false;	
	}
	 public void setTitle(String name) {
	        this.name = name;
	    }
	  public  String getTitle() {
	        return name;
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

	public static List<Product> SearchByName(String string)
	{
		List<Product> name =new ArrayList();
for(int i=0;i<find_by_name.size();i++)
{
	  if(find_by_name.get(i).equals(name)){
		  name.add(find_by_name.get(i));
      }
}
		
		
		return name;
	}
	public boolean isfound()
	{
		
		return this.found;
	}
}

