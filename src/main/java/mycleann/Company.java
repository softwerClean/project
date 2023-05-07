package mycleann;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Company extends Product
{


    static Logger logger
    = Logger.getLogger(Company.class.getName());
	
	protected boolean isAdded;
	protected static List<Company> clients = new ArrayList<Company>();

    private static List<Product> Product =new ArrayList<Product>();
    private static List<Customers> Customer = new ArrayList<Customers>();
    public Company() {
		isAdded = false;
		this.name="";
		
	}
	public static void addUser(Admin ad,Customers cus)
	{
		if(ad.isLogged()&&!isUserRegestered(cus.id)) {
			Customer.add(cus);
		}
		else if(!ad.isLogged()) logger.log(Level.INFO,"we must the admin logged in ");
		 else if(isUserRegestered(cus.id)) logger.log(Level.INFO,"this user is already registered");

	}

	public static boolean isUserRegestered(String admin)
	{

		for (int i = 0 ; i<Customer.size();i++)
		{
			if (Customer.get(i).id.equals(admin))
				return true;
		}
		return false;
	}
	public List<String> search(String id) 
	{
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < clients.size(); i++) {
			Company c = clients.get(i);

			if (c.get("id").indexOf(id) != -1)
				result.add(c.get("name"));
		}

		return result;
	}
	public String get(String type)
	{
		if (type.equals("name"))
			return this.name;
		return this.name;
	
	}
	public static List<Customers> serachUserBysig(String isbn)
	{
	    List<Customers> serch=new ArrayList<Customers>();
	    for(int i = 0; i< Customer.size(); i++)
	    {
	        if(Customer.get(i).id.contains(isbn)) serch.add(Customer.get(i));

	    }
	    return serch;
	}
	
	

	
}
