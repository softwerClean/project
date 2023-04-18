package mycleann;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Company extends Customers
{

    private static EmailServer email2 = new EmailServer();

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
//		isAdded = false;
//
//		if (admin.isLogged())
//		{
//			List<String> result = this.search(name);
//
//			if (result.isEmpty() && Company.add(this))
//				isAdded = true;
//			else
//				logger.info("the id is already exists");
//	
//		}
//		else
//		{
//			logger.info("\nthe admin must be logged in");
//		}
//
	//	return isAdded;
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
	public static void EmailServer(EmailServer email)
	{
		email2=email;
		
		
	}
	
	public static void remender(Customers cus) throws IOException
	{
	String em=cus.GetEmail();
	String f = "the order is completed";
	String g="You can come to pick it up";
	
	email2.sendEmail(em, f, g);
	}
	
	
}
