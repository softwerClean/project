package mycleann;

import java.util.HashMap;
import java.util.Properties;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.logging.Level;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FirstClass {
	static Logger logger = Logger.getLogger(FirstClass.class.getName());
	static RandomAccessFile fromFile;

//	public static void func() throws IOException
//	{
//		String print = "please enter the name";
//		String name;
//		String password;
//		Scanner scanner = new Scanner(System.in);
//		int key;
//		Admin admin = new Admin();
//		while(true) {
//		logger.log(Level.INFO,"welcome to our Library , Who are you?\n1-Admin.\n2-User.\n3-Exit the Company.");
//				
//		Properties r = new Properties();
//	
//		FileInputStream stream=new FileInputStream("C:\\Users\\Hp\\Desktop\\mycleanadhamfgdfg\\src\\test\\resources\\config.properties");
//		r.load(stream);		
//		key = scanner.nextInt();
//		switch (key) {
//		case 1:
//			logger.log(Level.INFO,"enter the name");
//		name = scanner.next();
//			logger.log(Level.INFO,"enter the password");
//			password = scanner.next();
//			if(!admin.admin_password.equals(password)||!admin.admin_name.equals(name)) {logger.log(Level.INFO,"the name or password is wrong"); break;}
//		    admin.login(name, password);
//			while(true){
//				logger.log(Level.INFO,"\n3-add product.\n4-update product.\n5-delete product.\n6-search product.\n7-add customer.\n8-update customer.\n9-delete customer\n10-notification user.\n11-Print report.\n12-print discount option.\n13-sent Email.\n14-Order Distribution\n16-Search Customer ");
//	        	 key = scanner.nextInt();
//	        	
//				switch (key) {
//	 			case 3:
//	 				Product p = new Product();
//	 				logger.log(Level.INFO,"please enter the Category");
//	 			String	category = scanner.next();
//	 				logger.log(Level.INFO,print);
//	 				String	NAME = scanner.next();
//	 				logger.log(Level.INFO,"please enter the price");
//	 				String	price = scanner.next();
//	 				logger.log(Level.INFO,"please enter the amount");
//	 				String	amount = scanner.next();
//	 				logger.log(Level.INFO,"please enter the Order ID");
//	 				String	 orderid = scanner.next();
//	 			p.add(admin);
//	 			Company c=new Company();
//	 			c.PutProduct(category, NAME, price, amount, orderid);
//	 			  String filename = "product.txt"; 
//	 		        FileOutputStream fos = null;
//	 		        FileChannel channel = null;
//	 			try 
//	 			{fos = new FileOutputStream(filename, true);
//	            channel = fos.getChannel();
//
//	 				 String productInfo = category + "," + NAME + "," + price  + "," + amount + "," + orderid + "\n";
//	 	            ByteBuffer buffer = ByteBuffer.wrap(productInfo.getBytes());
//	 	            channel.write(buffer);
//	 	       	logger.log(Level.INFO,"Product information has been written to the file.");
//	 	        } catch (IOException e) {
//	 	       	logger.log(Level.INFO,"Error writing to file: " + e.getMessage());
//	 	        }
	public static void func() throws IOException {
	    String print = "Please enter the name:";
	    Scanner scanner = new Scanner(System.in);
	    int key;
	    Admin admin = new Admin();

	    while (true) {
	        logger.log(Level.INFO, "Welcome to our library. Who are you?\n1-Admin.\n2-User.\n3-Exit the Company.");

	        Properties properties = new Properties();
	        FileInputStream inputStream = new FileInputStream("C:\\Users\\Hp\\Desktop\\mycleanadhamfgdfg\\src\\test\\resources\\config.properties");
	        properties.load(inputStream);
	        
	        key = scanner.nextInt();
	        switch (key) {
	            case 1:
	                logger.log(Level.INFO, "Enter the name:");
	                String name = scanner.next();
	                logger.log(Level.INFO, "Enter the password:");
	                String password = scanner.next();
	                
	                if (!admin.admin_password.equals(password) || !admin.admin_name.equals(name)) {
	                    logger.log(Level.INFO, "The name or password is wrong");
	                    break;
	                }
	                
	                admin.login(name, password);
	                while (true) {
	                    logger.log(Level.INFO, "\n3-Add product.\n4-Update product.\n5-Delete product.\n6-Search product.\n7-Add customer.\n8-Update customer.\n9-Delete customer.\n10-Notification user.\n11-Print report.\n12-Print discount option.\n13-Send email.\n14-Order distribution.\n16-Search customer.");
	                    key = scanner.nextInt();

	                    switch (key) {
	                        case 3:
	                            Product product = new Product();
	                            logger.log(Level.INFO, "Please enter the category:");
	                            String category = scanner.next();
	                            logger.log(Level.INFO, print);
	                            String name8 = scanner.next();
	                            logger.log(Level.INFO, "Please enter the price:");
	                            String price = scanner.next();
	                            logger.log(Level.INFO, "Please enter the amount:");
	                            String amount = scanner.next();
	                            logger.log(Level.INFO, "Please enter the order ID:");
	                            String orderid = scanner.next();
	                            
	                            product.add(admin);
	                            Company company = new Company();
	                            company.PutProduct(category, name8, price, amount, orderid);
	                            
	                            String filename = "product.txt";
	                            try {
	                            		FileOutputStream fos = new FileOutputStream(filename, true); 
	                            		FileChannel channel = fos.getChannel() ;
	                                String productInfo = category + "," + name + "," + price  + "," + amount + "," + orderid + "\n";
	                                ByteBuffer buffer = ByteBuffer.wrap(productInfo.getBytes());
	                                channel.write(buffer);
	                                logger.log(Level.INFO, "Product information has been written to the file.");
	                            } catch (IOException e) {
	                                logger.log(Level.INFO, "Error writing to file: " + e.getMessage());
	                            }
	                            break;
	                        case 4:
	                            logger.log(Level.INFO, print);
	                            String name1 = scanner.next();
	                            
	                            File file1 = new File("product.txt");
	                            Scanner in1 = new Scanner(file1);
	                            
	                            String string1;
	                            String n = "";
	                            String str = "";
	                            while (in1.hasNextLine()) {
	                                string1 = in1.nextLine();
	                                String[] splited1 = string1.split(",");
	                                if (splited1[1].equals(name1)) {
	                                    logger.log(Level.INFO, "please enter the Category");
	                                    String category1 = scanner.next();
	                                    logger.log(Level.INFO, print);
	                                    String NAME1 = scanner.next();
	                                    logger.log(Level.INFO, "please enter the price");
	                                    String price1 = scanner.next();
	                                    logger.log(Level.INFO, "please enter the amount");
	                                    String amount1 = scanner.next();
	                                    logger.log(Level.INFO, "please enter the Order ID");
	                                    String orderid1 = scanner.next();
	                                    str = category1 + "," + NAME1 + "," + price1 + "," + amount1 + "," + orderid1;
	                                    n += str + "\n";
	                                    continue;
	                                } else {
	                                    n += string1 + "\n";
	                                    continue;
	                                }
	                            }
	                            in1.close();
	                            FileWriter newFile = new FileWriter("product.txt");
	                            newFile.write(n);
	                            newFile.close();
	                            break;

	                        case 5:
	                            logger.log(Level.INFO, print);
	                            String name2 = scanner.next();
	                            
	                            int flag = 0;
	                            try {
	                                ArrayList<String> al = new ArrayList<String>();
	                                RandomAccessFile raf = new RandomAccessFile("product.txt", "rw");
	                                raf.seek(0);
	                                String s;
	                                while ((s = raf.readLine()) != null) {
	                                    al.add(s);
	                                }
	                                for (int i = 0; i < al.size(); i++) {
	                                    String[] up = al.get(i).split(",");
	                                    if (name2.equals(up[1])) {
	                                        al.remove(i);
	                                        flag = 1;
	                                        break;
	                                    }
	                                }
	                                BufferedWriter writer = new BufferedWriter(new FileWriter("product.txt"));
	                                writer.write("");
	                                writer.flush();
	                                writer.close();
	                                raf.seek(0);
	                                for (int i = 0; i < al.size(); i++) {
	                                    raf.writeBytes(al.get(i) + "\n");
	                                }
	                                raf.close();
	                            } catch (Exception e) {
	                                logger.log(Level.INFO, "Error");
	                            }
	                            break;
	                        case 7:
	                            Customers customer = new Customers();
	                            logger.log(Level.INFO, "Please enter the ID:");
	                            String id = scanner.next();
	                            logger.log(Level.INFO, "Please enter the name:");
	                            String name9 = scanner.next();
	                            logger.log(Level.INFO, "Please enter the email:");
	                            String email = scanner.next();
	                            logger.log(Level.INFO, "Please enter the address:");
	                            String address = scanner.next();
	                            logger.log(Level.INFO, "Please enter the phone number:");
	                            String phone = scanner.next();
	                            customer.addd(admin);
	                            customer.putcustomer(id, name9, email, address, phone);
	                            String filename2 = "customer.txt";
	                            try {
	                            	FileOutputStream fos = new FileOutputStream(filename2, true);
	                            
	                                 FileChannel channel = fos.getChannel();
	                                String customerInfo = id + "," + name + "," + email + "," + address + "," + phone + "\n";
	                                ByteBuffer buffer = ByteBuffer.wrap(customerInfo.getBytes());
	                                channel.write(buffer);
	                                logger.log(Level.INFO, "Customer information has been written to the file.");
	                            } catch (IOException e) {
	                                logger.log(Level.INFO, "Error writing to file: " + e.getMessage());
	                            }
	                            break;
	                        case 8:
	                            logger.log(Level.INFO, "Please enter the name of the customer to edit:");
	                            String nameToEdit = scanner.next();
	                            File file = new File("customer.txt");
	                            Scanner in = new Scanner(file);
	                            String m;
	                            String updatedCustomers = "";
	                            while (in.hasNextLine()) {
	                                m = in.nextLine();
	                                String[] fields = m.split(",");
	                                if (fields[1].equals(nameToEdit)) {
	                                    logger.log(Level.INFO, "Please enter the new ID:");
	                                    String newId = scanner.next();
	                                    logger.log(Level.INFO, "Please enter the new name:");
	                                    String newName = scanner.next();
	                                    logger.log(Level.INFO, "Please enter the new email:");
	                                    String newEmail = scanner.next();
	                                    logger.log(Level.INFO, "Please enter the new address:");
	                                    String newAddress = scanner.next();
	                                    logger.log(Level.INFO, "Please enter the new phone number:");
	                                    String newPhone = scanner.next();
	                                    String updatedCustomer = newId + "," + newName + "," + newEmail + "," + newAddress + "," + newPhone;
	                                    updatedCustomers += updatedCustomer + "\n";
	                                } else {
	                                    updatedCustomers += m + "\n";
	                                }
	                            }
	                            in.close();
	                            try {
	                            	FileWriter fileWriter = new FileWriter("customer.txt");
	                            
	                                fileWriter.write(updatedCustomers);
	                            } catch (IOException e) {
	                                logger.log(Level.INFO, "Error writing to file: " + e.getMessage());
	                            }
	                            break;


	 		
//	 			case 4: 
//
//	 				
//	 				logger.log(Level.INFO,print);
//	 				 String name1 = scanner.next();
//	 				
//	 				File file1 = new File("product.txt");
//	 	             Scanner in1 = new Scanner(file1);
//	 	             
//	 	             String string1;
//	 	             String n="";
//	 	            String str="";
//	 	             while(in1.hasNextLine())
//	 	             {
//	 	            	string1=in1.nextLine();
//	 	                 String[] splited1 = string1.split(",");
//	 	                 if(splited1[1].equals(name1) )       
//	 	                 {
//	 	                	logger.log(Level.INFO,"please enter the Category");
//	 	   	 			String	category1 = scanner.next();
//	 	   	 				logger.log(Level.INFO,print);
//	 	   	 				String	NAME1 = scanner.next();
//	 	   	 				logger.log(Level.INFO,"please enter the price");
//	 	   	 				String	price1 = scanner.next();
//	 	   	 				logger.log(Level.INFO,"please enter the amount");
//	 	   	 				String	amount1 = scanner.next();
//	 	   	 				logger.log(Level.INFO,"please enter the Order ID");
//	 	   	 				String	 orderid1 = scanner.next();
//	 	                     str= category1+","+NAME1+","+price1+","+ amount1+"," + orderid1 ;
//	 	                      n+=str+"\n";
//	 	                       
//	 	                    continue;                  
//
//	 	                 }
//	 	                 else 
//	 	                 {	 	                     
//	 	                      n+=string1+"\n";
//	 	                     continue;
//	 	                 } 	               
//	 	             }
//	 	            in1.close();
//	 	            FileWriter newFILE = new FileWriter("product.txt");
//	 	            newFILE.write(n);
//	 	            newFILE.close();
//	 	         
//	 		    break;
//	 				
//	 			case 5:
//	 			
//	 				
//		 				logger.log(Level.INFO,print);
//		 				 String name2 = scanner.next();
//		 				
//	 		       int flag=0;
//	 		        try{
//	 		            ArrayList<String>al=new ArrayList();
//	 		           RandomAccessFile raf=new  RandomAccessFile("product.txt","rw");
//	 		           raf.seek(0);
//	 		       
//	 		          String s;
//	 		          while((s=raf.readLine())!=null){       
//	 		        al.add(s);
//	 		    }                                        
//	 		      for(int i=0;i<al.size();i++){
//	 		         String[]up=al.get(i).split(",");
//	 		         if(name2.equals(up[1])){
//	 		             al.remove(i);
//	 		              flag=1;
//	 		             break;
//	 		         }
//	 		      }
//	 		         
//	 		       
//	 		     BufferedWriter     writer = new BufferedWriter(new FileWriter("product.txt"));
//	 		writer.write("");
//	 		writer.flush();
//	 		writer.close();
//	 		raf.seek(0);
//	 		         for(int i=0;i<al.size();i++){
//	 		      raf.writeBytes(al.get(i)+"\n");  
//	 		         }
//	 		         raf.close();
//	 		        }
//	 		        catch(Exception exp){
//	 		       	logger.log(Level.INFO,"Error");
//	 		        }
//	 		        break;
//	 			case 7:
//	 				Customers customer = new Customers();
//	 				logger.log(Level.INFO,"please enter the id");
//	 				String id = scanner.next();
//	 				logger.log(Level.INFO,print);
//	 				 String name3 = scanner.next();
//	 				logger.log(Level.INFO,"please enter the email");
//	 				 String email = scanner.next();
//	 				logger.log(Level.INFO,"please enter the address");
//	 				 String address = scanner.next();
//	 				logger.log(Level.INFO,"please enter the phone");
//	 				 String phone = scanner.next();
//	 			customer.addd(admin);
//	 			customer.putcustomer(id, name3, email, address,phone);
//	 			  String filename8 = "customer.txt"; 
//	 		        FileOutputStream fos8 = null;
//	 		        FileChannel channel8 = null;
//	 			try 
//	 			{fos8 = new FileOutputStream(filename8, true);
//	            channel8 = fos8.getChannel();
//
//	 				 String productInfo8 = id + "," + name3 + "," + email  + "," + address + "," + phone + "\n";
//	 	            ByteBuffer buffer8 = ByteBuffer.wrap(productInfo8.getBytes());
//	 	            channel8.write(buffer8);
//	 	       	logger.log(Level.INFO,"Product information has been written to the file.");
//	 	        } catch (IOException e) {
//	 	       	logger.log(Level.INFO,"Error writing to file: " + e.getMessage());
//	 	        }
//	 			
//	 			 break;
//	 			case 8: 
//	 				logger.log(Level.INFO,print);
//				 String name4 = scanner.next();
//	 				
//				File file3 = new File("customer.txt");
//	             Scanner in2 = new Scanner(file3);
//	             
//	             String m ;
//	             String n2="";
//	            String str1="";
//	             while(in2.hasNextLine())
//	             {
//	                 m=in2.nextLine();
//	                 String[] splitedsn1 = m.split(",");
//	                 if(splitedsn1[1].equals(name4) )       
//	                 {
//	                	 logger.log(Level.INFO,"please enter the id");
//	 	 				String id1 = scanner.next();
//	 	 				logger.log(Level.INFO,print);
//	 	 				 String name31 = scanner.next();
//	 	 				logger.log(Level.INFO,"please enter the email");
//	 	 				 String email1 = scanner.next();
//	 	 				logger.log(Level.INFO,"please enter the address");
//	 	 				 String address1 = scanner.next();
//	 	 				logger.log(Level.INFO,"please enter the phone");
//	 	 				 String phone1 = scanner.next();
//	                     str1= id1+","+name31+","+email1+","+ address1+"," + phone1 ;
//	                      n2+=str1+"\n";	                       
//	                    continue;                  
//	                 }
//	                 else 
//	                 {	                     
//	                      n2+=m+"\n";
//	                     continue;
//	                 }               
//	             }
//	            in2.close();
//	            FileWriter newFILE1 = new FileWriter("customer.txt");
//	            newFILE1.write(n2);
//	            newFILE1.close();         
//		    break;
	 			case 9:
	 				logger.log(Level.INFO,print);
	 				 String name5 = scanner.next();
	 				
		       int flag1=0;
		        try{
		            ArrayList<String>al=new ArrayList();
		           RandomAccessFile raf=new  RandomAccessFile("customer.txt","rw");
		           raf.seek(0);
		          String s;
		          while((s=raf.readLine())!=null){       
		        al.add(s);
		    }                                        
		      for(int i=0;i<al.size();i++){
		         String[]up=al.get(i).split(",");
		         if(name5.equals(up[1])){
		             al.remove(i);
		              flag1=1;
		             break;
		         }
		      }
		       
		     BufferedWriter writer = new BufferedWriter(new FileWriter("customer.txt"));
		writer.write("");
		writer.flush();
		writer.close();
		raf.seek(0);
		         for(int i=0;i<al.size();i++){
		      raf.writeBytes(al.get(i)+"\n");  
		         }
		         raf.close();
		        }
		        catch(Exception exp){
		        	logger.log(Level.INFO,"Error");
		        }
		        break;
	 			case 6:
	 				String filenaMe = "product.txt";
	 				Scanner myObj = new Scanner(System.in);
	 				logger.log(Level.INFO,"please enter the Name :  ");
	 				String Name = myObj.nextLine();
	 				  FileInputStream fis = new FileInputStream(filenaMe);
	 			             FileOutputStream fos4 = new FileOutputStream("output.txt");
	 			            byte[] buffer = new byte[1024];
	 			            int bytesRead;
	 			            String currentLine = "";

	 			            while ((bytesRead = fis.read(buffer)) != -1) {

	 			                String chunk = new String(buffer, 0, bytesRead);
	 			                int index;
	 			                while ((index = chunk.indexOf('\n')) != -1) {
	 			                    String line = currentLine + chunk.substring(0, index);
	 			                 
	 			                    String[] parts = line.split(",");
	 			                    String NAME1 = parts[1];
	 			                    if (NAME1.equals(Name)) {
	 			                    	fos4.write((parts[0]+" "+parts[1]+" "+parts[2]+" "+parts[3]+" "+parts[4]+ "\n").getBytes());
	 			                    	logger.log(Level.INFO,parts[0]+" "+parts[1]+" "+parts[2]+" "+parts[3]+" "+parts[4]+ "\n");
	 			                    }

	 			                    chunk = chunk.substring(index + 1);
	 			                    currentLine = "";
	 			                }

	 			                currentLine += chunk;
	 			            }

	 			            if (!currentLine.isEmpty()) {
	 			            	fos4.write(("Product not found.\n").getBytes());
	 			            }
                      break;
		
	 			case 16:
	 				String filenaMe7 = "customer.txt"; 
	 				Scanner myObj7 = new Scanner(System.in);
	 				logger.log(Level.INFO,"please enter the Name :  ");
	 				String Name7 = myObj7.nextLine();

	 				  FileInputStream fis7 = new FileInputStream(filenaMe7);
	 			             FileOutputStream fos7 = new FileOutputStream("output1.txt");

	 			            byte[] buffer7 = new byte[1024];
	 			            int bytesRead7;
	 			            String currentLine7 = "";

	 			            while ((bytesRead7 = fis7.read(buffer7)) != -1) {

	 			                String chunk7 = new String(buffer7, 0, bytesRead7);

	 			                int index7;

	 			                while ((index7 = chunk7.indexOf('\n')) != -1) {

	 			                    String line7 = currentLine7 + chunk7.substring(0, index7);
	 			                 
	 			                    String[] parts7 = line7.split(",");
	 			                    String NAME7 = parts7[1];
	 			                    if (NAME7.equals(Name7)) {
	 			                    	fos7.write((parts7[0]+" "+parts7[1]+" "+parts7[2]+" "+parts7[3]+" "+parts7[4]+ "\n").getBytes());
	 			                    	logger.log(Level.INFO,parts7[0]+" %s"+parts7[1]+" %s"+parts7[2]+" %s"+parts7[3]+" %s"+parts7[4]+ "%s\n");
	 			                    }

	 			                    chunk7 = chunk7.substring(index7 + 1);
	 			                    currentLine7 = "";
	 			                }

	 			                currentLine7 += chunk7;
	 			            }

	 			            if (!currentLine7.isEmpty()) {
	 			            	fos7.write(("Product not found.\n").getBytes());
	 			            }

break;
	                   
		
	 			case 11:
	 				 List<Map<String, Object>> salesData = new ArrayList();
	 			    Map<String, Object> sale1 = new HashMap();
	 			    sale1.put("product", "Widget A");
	 			    sale1.put("quantity", 100);
	 			    sale1.put("price", 10.0);
	 			    sale1.put("total", 1000.0);
	 			    salesData.add(sale1);
	 			    
	 			    Map<String, Object> sale2 = new HashMap();
	 			    sale2.put("product", "Widget B");
	 			    sale2.put("quantity", 50);
	 			    sale2.put("price", 20.0);
	 			    sale2.put("total", 1000.0);
	 			    salesData.add(sale2);
	 			    
	 			    BusinessReport report = new BusinessReport();
	 			    report.setTitle("Sales Report");
	 			    report.setDate("2023-05-06");
	 			    report.setSalesData(salesData);
	 			    
	 			    ObjectMapper mapper = new ObjectMapper();
	 			    try {
	 			      String json = mapper.writeValueAsString(report);
	 			     logger.log(Level.INFO,json);
	 			    } catch (JsonProcessingException e) {
	 			      e.printStackTrace();
	 			    }
	 			  break;
	 					   
	 			case 14:    List<Worker> availableWorkers = new ArrayList();
	 		    availableWorkers.add(new Worker("Adham"));
	 		    availableWorkers.add(new Worker("Muheeb"));
	 		    availableWorkers.add(new Worker("Yazan"));
	 		    availableWorkers.add(new Worker("EZZ"));
	 		    availableWorkers.add(new Worker("Ali"));

	 		    List<Orderr> orders = new ArrayList();
	 		    orders.add(new Orderr("Order 1"));
	 		    orders.add(new Orderr("Order 2"));
	 		    orders.add(new Orderr("Order 3"));
	 		    orders.add(new Orderr("Order 4"));
	 		    orders.add(new Orderr("Order 5"));
	 		    orders.add(new Orderr("Order 6"));

	 		    OrderDistributor distributor = new OrderDistributor(availableWorkers);
	 		    distributor.distributeOrders(orders);
	 					 break;	
	 					 
	 			case 12:

	 				Scanner input = new Scanner(System.in);
	 	        
	 				logger.log(Level.INFO,"Enter customer name: ");
	 	        String customerName = input.nextLine();
	 	        
	 	       logger.log(Level.INFO,"Enter total amount spent: ");
	 	        double totalAmount = input.nextDouble();
	 	        
	 	        double discount = 0.0;
	 	        if (totalAmount > 400.0) {
	 	            discount = 0.1 * totalAmount;
	 	        }
	 	        
	 	        double discountedAmount = totalAmount - discount;
	 	        
	 	       logger.log(Level.INFO,"Customer Name: " + customerName);
	 	      logger.log(Level.INFO,"Total Amount Spent: " + totalAmount + " NIS");
	 	     logger.log(Level.INFO,"Discount: " + discount + " NIS");
	 	    logger.log(Level.INFO,"Discounted Amount: " + discountedAmount + " NIS");
	 	    
	 	    
                default:
                    logger.log(Level.INFO, "Invalid input. Please try again.");
                    break;
            
        




				}
	 		    
	 		  

	 				
	 		        
	 	        }
		case 2 :
				
				logger.log(Level.INFO,"1-Are you a new customer");
				logger.log(Level.INFO,"2-Are you a customer Have an account?");
				 String name7 = scanner.next();

				
				
				
				
				break;
		case 3:
				logger.log(Level.INFO,"GOOD BAY.");
				break;
        default:
            logger.log(Level.INFO, "Invalid input. Please try again.");
            break;
    





	}break;
		}		
	}
	
	
	public static void main(String[] args) throws IOException  
	{
		
		func();
	
}

}