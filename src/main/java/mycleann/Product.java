package mycleann;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Product 
{
	static Logger logger = Logger.getLogger(Product.class.getName());

	protected String category;
	protected String price;
	protected String amount;
	protected String name;
	protected static ArrayList <String[]> products =new ArrayList<String[]>();
	protected boolean add;
	protected boolean delete;
	protected boolean found;
	protected boolean update;
	protected int var;
	protected int width,hight;
	private String Orderid;
	protected static ArrayList <Product> find_by_name =new ArrayList<Product>();

	
	public String getOrderid() {
		return Orderid;
	}
	
	public void setOrderid(String orderid) {
		Orderid = orderid;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		category = category;
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
	public void Product(String category, String name, String price, String amount,String orderid)
	{
		this.category=category;
		this.name=name;
		this.price=price;
		this.amount=amount;
		this.Orderid=orderid;
	}
	
	public boolean add(Admin admin)
	{
		add = false;
	if(admin.isLogged())
	{
		String [] product2 = {this.category,this.name,this.price,this.amount,this.Orderid};
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

	public void PutProduct(String string, String string2, String string3, String string4,String string5) {
		
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
		return this.update;
	}

	public static List<Product> SearchByName(String string)
	{
		List<Product> name =new ArrayList<Product>();
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

