package mycleann;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Product 
{
	static Logger logger = Logger.getLogger(Product.class.getName());

	protected String ctegory;
	protected String price;
	protected String amount;
	protected String name;
	protected static ArrayList <String[]> products =new ArrayList<String[]>();
	protected boolean add;
	protected boolean delete;
	protected boolean found;
	protected boolean update;
	protected int myVar;
	protected int width;
	protected int hight;
	private String orderId;
	protected static ArrayList <Product> findbyname =new ArrayList<Product>();

	
	public String getOrderid() {
		return orderId;
	}
	
	public void setOrderid(String orderid) {
		orderId = orderid;
	}
	public String getCategory() {
		return ctegory;
	}

	public void setCategory(String category) {
		ctegory = category;
	}	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Product() 
	{
		
		this.width=0;
		this.hight=0;
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
	public void product(String category, String name, String price, String amount,String orderid)
	{
		this.ctegory=category;
		this.name=name;
		this.price=price;
		this.amount=amount;
		this.orderId=orderid;
	}
	
	public boolean add(Admin admin)
	{
		add = false;
	if(admin.isLogged())
	{
		String [] product2 = {this.ctegory,this.name,this.price,this.amount,this.orderId};
		if(Product.products.add(product2))
			add=true;
	}
	else
	{
		logger.log(Level.INFO,"the admin not loggin");
	}
		return add;
		
	}

	public boolean added() {
		return this.add;
	}

	public void putProduct(String string, String string2, String string3, String string4,String string5) {
		
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
		return this.delete;
	}

	public boolean UpdateMissing(Admin admin) 
	{
		myVar = Integer.parseInt(amount);
		update= false;
		
		if(admin.isLogged()&&myVar>=1) 
		{
			myVar-=1;
			update= true;

		}
		return  update;
	}
	public boolean updateUp(Admin admin) 
	{
		myVar = Integer.parseInt(amount);
		update= false;
		
		if(admin.isLogged()) 
		{
			myVar+=1;
			update= true;

		}
		return  update;
	}

	public boolean update() {
		return this.update;
	}

	public static List<Product> SearchByName(String string)
	{
		List<Product> name =new ArrayList<Product>();
for(int i=0;i<findbyname.size();i++)
{
	  if(findbyname.get(i).equals(name)){
		  name.add(findbyname.get(i));
      }
}
		
		
		return name;
	}
	public boolean isfound()
	{
		
		return this.found;
	}
}

