package mycleann;

import java.io.InputStream;
import java.util.Properties;

public class Admin
{

	Properties r = new Properties();
	InputStream input888 = null;
	protected boolean adminlogged;
	protected String adminName;
	protected String adminPassword;
	protected String update;
	 public Admin(String userName, String password) {
			this.adminName = userName;
			this.adminPassword = password;
			this.adminlogged = false;
		}

		public Admin() {
			this.adminName = "adham_12028277";
			this.adminPassword = "123456789@adham";
		}

		public boolean login(String userName, String password) {
			this.adminlogged = this.adminName.equals(userName);
			this.adminlogged = this.adminPassword.equals(password);
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
			return this.update;
		}
}
