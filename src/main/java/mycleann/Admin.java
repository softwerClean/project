package mycleann;

import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin
{

	Properties r = new Properties();
	InputStream input888 = null;
	protected boolean adminlogged;
	protected String adminName;
	protected String adminPassword;
	protected String update;
	private Scanner scanner;
	static Logger logger = Logger.getLogger(Admin.class.getName());

	 public Admin(String userName, String password) {
			this.adminName = userName;
			this.adminPassword = password;
			this.adminlogged = false;
		}

		public Admin() {
			this.adminName = "adham_12028277";
	        this.adminPassword = enterPassword();
		}
		private String enterPassword() {
	        scanner = new Scanner(System.in);

			logger.log(Level.INFO,"Enter the admin password:");
	        return scanner.nextLine();
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

		public String updatingUp() {
			return this.update;
		}
}
