package mycleann;

import java.io.InputStream;
import java.util.Properties;

public class Admin
{

	Properties r = new Properties();
	InputStream input888 = null;
	protected boolean adminlogged;
	protected String adminName;
	protected String  admin_password;
	 protected String Update;
	 public Admin(String userName, String password) {
			this.adminName = userName;
			this.admin_password = password;
			this.adminlogged = false;
		}

		public Admin() {
			this.adminName = "adham_12028277";
			this.admin_password = "123456789@adham";
		}

		public boolean login(String userName, String password) {
			this.adminlogged = this.adminName.equals(userName);
			this.adminlogged = this.admin_password.equals(password);
			return this.adminlogged;
		}

		public boolean logout() {
			this.adminlogged = false;
			return this.adminlogged;
		}

		public boolean isLogged() {
			return this.adminlogged;
		}

		public String updatingUp(Admin admin) {
			return this.Update;
		}
}
//	 public Admin(String user_name, String password) 
//	 {
//		 this.admin_name=user_name;
//		 this.admin_password=password;
//		 
//		 this.adminlogged=false;
//	 }
//	 public Admin() 
//	 {
//		 this.admin_name="adham_12028277";
//		 this.admin_password="123456789@adham";				 
//				 
//	 }
//
//public boolean login(String user_name, String password)
//{
//	
//	this.adminlogged=this.admin_name.equals(user_name);
//	this.adminlogged=this.admin_password.equals(password);
//
//	return this.adminlogged;
//
//   }
//
//public boolean logout()
//{
//	
//	this.adminlogged=false;
//	return this.adminlogged;
//	
//   }
//
//public boolean isLogged()
//{
//	
//	return this.adminlogged;
//	
//   }
//public String updatingUp(Admin admin) 
//{
//	return this.Update;
//}
//  }
