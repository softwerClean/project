package mycleann;

public class Admin
{
	
	protected boolean adminlogged;
	 protected String admin_name, admin_password;
	 protected String Update;
	 public Admin(String user_name, String password) 
	 {
		 this.admin_name=user_name;
		 this.admin_password=password;
		 
		 this.adminlogged=false;
	 }
	 public Admin() 
	 {
		 
		 this.adminlogged=false;
	 }

public boolean login(String user_name, String password)
{
	
	this.adminlogged=this.admin_name.equals(user_name);
	this.adminlogged=this.admin_password.equals(password);

	return this.adminlogged;

   }

public boolean logout()
{
	
	this.adminlogged=false;
	return this.adminlogged;
	
   }

public boolean isLogged()
{
	
	return this.adminlogged;
	
   }
public String updatingUp(Admin admin) 
{
	return this.Update;
}
  }
