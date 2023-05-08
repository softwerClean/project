package mycleann;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Admin
{

	Properties r = new Properties();
	InputStream input888 = null;
	protected boolean adminlogged;
	 protected String admin_name=r.getProperty("dbname"), admin_password=r.getProperty("dbpassword");
	 protected String Update;
	 public Admin(String user_name, String password) 
	 {
		 this.admin_name=user_name;
		 this.admin_password=password;
		 
		 this.adminlogged=false;
	 }
	 public Admin() 
	 {
	 
		 admin_name=r.getProperty("dbname");
		 admin_password=r.getProperty("dbpassword");
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
