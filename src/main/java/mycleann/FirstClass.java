package mycleann;

import java.util.HashMap;
import java.util.Properties;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
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
    static Scanner scanner = new Scanner(System.in);
    static String print = "Please enter the name:";
    static Admin admin = new Admin();
static String filenameproperities="customer.txt";
static String filenameproperities2="product.txt";

	public static void adminMenue()
	{
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
          
          String filename = filenameproperities2;
          
          try {
          		FileOutputStream fos = new FileOutputStream(filename, true); 
          		FileChannel channel = fos.getChannel() ;
              String productInfo = category + "," + name8 + "," + price  + "," + amount + "," + orderid + "\n";
              ByteBuffer buffer = ByteBuffer.wrap(productInfo.getBytes());
              channel.write(buffer);
              logger.log(Level.INFO, "Product information has been written to the file.");
          } catch (IOException e) {
        	  logger.info("Error writing to the file: " + e.getMessage());
        	  }
          
	}
	
	
	
	
	public static void function() throws IOException {
	    int key;

	    while (true) {
	        logger.log(Level.INFO, "Welcome to our library. Who are you?\n1-Admin.\n2-User.\n3-Exit the Company.");

	        Properties properties = new Properties();
	        FileInputStream inputStream = new FileInputStream("C:\\Users\\Hp\\Desktop\\New folder (8)\\mycleanadhamfgdfg\\src\\test\\resources\\config.properties");
	        properties.load(inputStream);
	        
	        key = scanner.nextInt();
	        switch (key) {
	        
	        case 1:
	            logger.log(Level.INFO, "Enter the name:");
	            String name = scanner.next();
	            logger.log(Level.INFO, "Enter the password:");
	            String password = scanner.next();

	            if (!admin.adminPassword.equals(password) || !admin.adminName.equals(name)) {
	                logger.log(Level.INFO, "The name or password is wrong");
	                break;
	            }

	            admin.login(name, password);
	            while (true) {
	                logger.log(Level.INFO, "\n3-Add product.\n4-Update product.\n5-Delete product.\n6-Search product.\n7-Add customer.\n8-Update customer.\n9-Delete customer.\n10-Notification user.\n11-Print report.\n12-Print discount option.\n13-Send email.\n14-Order distribution.\n16-Search customer.");
	                key = scanner.nextInt();

	                    switch (key)
	                    {
	                      
	                    
	                    case 3:
	                    	adminMenue();
	                    	break;
	                    
	                    
	                    case 4:
	                        logger.log(Level.INFO, print);
	                        String name1 = scanner.next();

	                        File file1 = new File(filenameproperities2);
	                        Scanner in1 = new Scanner(file1);

	                        String string1;
	                        StringBuilder n = new StringBuilder();
	                        String str = "";
	                        while (in1.hasNextLine()) {
	                            string1 = in1.nextLine();
	                            String[] splited1 = string1.split(",");
	                            if (splited1[1].equals(name1)) {
	                                logger.log(Level.INFO, "please enter the Category");
	                                String category1 = scanner.next();
	                                logger.log(Level.INFO, print);
	                                String Name = scanner.next();
	                                logger.log(Level.INFO, "please enter the price");
	                                String price1 = scanner.next();
	                                logger.log(Level.INFO, "please enter the amount");
	                                String amount1 = scanner.next();
	                                logger.log(Level.INFO, "please enter the Order ID");
	                                String orderid1 = scanner.next();
	                                str = category1 + "," + Name + "," + price1 + "," + amount1 + "," + orderid1;
	                                n.append(str).append("\n");
	                            } else {
	                                n.append(string1).append("\n");
	                            }
	                        }

	                        in1.close();
	                        FileWriter newFile = new FileWriter(filenameproperities2);
	                        newFile.write(n.toString());
	                        newFile.close();
	                        break;


	                        case 5:
	                            logger.log(Level.INFO, print);
	                            String name2 = scanner.next();
	                            
	                            try {
	                                ArrayList<String> al = new ArrayList<String>();
	                                RandomAccessFile raf = new RandomAccessFile(filenameproperities2, "rw");
	                                raf.seek(0);
	                                String s;
	                                while ((s = raf.readLine()) != null) {
	                                    al.add(s);
	                                }
	                                for (int i = 0; i < al.size(); i++) {
	                                    String[] up = al.get(i).split(",");
	                                    if (name2.equals(up[1])) {
	                                        al.remove(i);
	                                        break;
	                                    }
	                                }
	                                BufferedWriter writer = new BufferedWriter(new FileWriter(filenameproperities2));
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
	                            customer.ret(id, name9, email, address, phone);
	                            String filename2 = filenameproperities;
	                            try {
	                            	FileOutputStream fos = new FileOutputStream(filename2, true);
	                            
	                                 FileChannel channel = fos.getChannel();
	                                String customerInfo = id + "," + name9 + "," + email + "," + address + "," + phone + "\n";
	                                ByteBuffer buffer = ByteBuffer.wrap(customerInfo.getBytes());
	                                channel.write(buffer);
	                                logger.log(Level.INFO, "Customer information has been written to the file.");
	                            } catch (IOException e) {
	                            	String logMessage = String.format("Error writing to file: %s%n", e.getMessage());
	                            	logger.log(Level.INFO, logMessage);
	                            }
	                            break;
	                        case 8:
	                            logger.log(Level.INFO, "Please enter the name of the customer to edit:");
	                            String nameToEdit = scanner.next();
	                            File file = new File(filenameproperities);
	                            Scanner in = new Scanner(file);
	                            String m;
	                            StringBuilder updatedCustomers = new StringBuilder();
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
	                                    updatedCustomers.append(updatedCustomer).append("\n");
	                                } else {
	                                    updatedCustomers.append(m).append("\n");
	                                }
	                            }
	                            in.close();
	                            try {
	                                FileWriter fileWriter = new FileWriter(filenameproperities);
	                                fileWriter.write(updatedCustomers.toString());
	                            } catch (IOException e) {
	                            	String logMessage = String.format("Error writing to file: %s%n", e.getMessage());
	                            	logger.log(Level.INFO, logMessage);
	                            }
	                            break;

	                        case 9:
	                            logger.log(Level.INFO, "Please enter a name: ");
	                            String name5 = scanner.next();
	                            try {
	                                ArrayList<String> al = new ArrayList<String>();
	                                RandomAccessFile raf = new RandomAccessFile(filenameproperities, "rw");
	                                raf.seek(0);
	                                String s;
	                                while ((s = raf.readLine()) != null) {
	                                    al.add(s);
	                                }
	                                for (int i = 0; i < al.size(); i++) {
	                                    String[] up = al.get(i).split(",");
	                                    if (name5.equals(up[1])) {
	                                        al.remove(i);
	                                        break;
	                                    }
	                                }
	                                BufferedWriter writer = new BufferedWriter(new FileWriter(filenameproperities));
	                                writer.write("");
	                                writer.flush();
	                                writer.close();
	                                raf.seek(0);
	                                for (int i = 0; i < al.size(); i++) {
	                                    raf.writeBytes(al.get(i) + "\n");
	                                }
	                                raf.close();
	                            } catch (Exception exp) {
	                                logger.log(Level.INFO, "Error");
	                            }
	                            break;

	                        case 6:
	                            String filename22 = filenameproperities2;
	                            Scanner scannerr = new Scanner(System.in);
	                            logger.log(Level.INFO, "Please enter the name: ");
	                            String name_product = scannerr.nextLine();
	                            FileInputStream fis = new FileInputStream(filename22);
	                            FileOutputStream fos = new FileOutputStream("output.txt");
	                            byte[] buffer = new byte[1024];
	                            int bytesRead;
	                            String currentLine = "";
	                            while ((bytesRead = fis.read(buffer)) != -1) {

	                                String chunk = new String(buffer, 0, bytesRead);
	                                int index;
	                                while ((index = chunk.indexOf('\n')) != -1) {
	                                    String line = currentLine + chunk.substring(0, index);

	                                    String[] parts = line.split(",");
	                                    String NAmE = parts[1];
	                                    if (NAmE.equals(name_product)) {
	                                        fos.write((parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3] + " " + parts[4] + "\n").getBytes());
	                                        String logMessage = String.format("%s %s %s %s %s%n", parts[0], parts[1], parts[2], parts[3], parts[4]);
	                                        logger.log(Level.INFO, logMessage);
	                                    }

	                                    chunk = chunk.substring(index + 1);
	                                    currentLine = "";
	                                }

	                                currentLine += chunk;
	                               

	                            }

	                            if (!currentLine.isEmpty()) {
	                                fos.write("Product not found.\n".getBytes());
	                            }
	                            break;

	                        case 16:
	                            String filename7 = filenameproperities;
	                            Scanner scanner7 = new Scanner(System.in);
	                            logger.log(Level.INFO, "Please enter the name: ");
	                            String name7 = scanner7.nextLine();

	                            FileInputStream fis7 = new FileInputStream(filename7);
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
	                                    String nameInFile7 = parts7[1];
	                                    if (nameInFile7.equals(name7)) {
	                                        fos7.write((parts7[0] + " " + parts7[1] + " " + parts7[2] + " " + parts7[3] + " " + parts7[4] + "\n").getBytes());
	                                        String logMessage = String.format("%s %s %s %s %s %n", parts7[0], parts7[1], parts7[2],  parts7[3], parts7[4]);
	                                        logger.log(Level.INFO, logMessage);
	                                    }

	                                    chunk7 = chunk7.substring(index7 + 1);
	                                    currentLine7 = "";
	                                }

	                                StringBuilder builder = new StringBuilder();
	                                builder.append(currentLine7);
	                                builder.append(chunk7);
	                                currentLine7 = builder.toString();
	                            }

	                            if (!currentLine7.isEmpty()) {
	                                fos7.write(("Product not found.\n").getBytes());
	                            }

	                            break;

	                    
	                        case 11:
	                            List<Map<String, Object>> salesData = new ArrayList<Map<String, Object>>();
	                            Map<String, Object> sale1 = new HashMap<String, Object>();
	                            sale1.put("product", "Widget A");
	                            sale1.put("quantity", 100);
	                            sale1.put("price", 10.0);
	                            sale1.put("total", 1000.0);
	                            salesData.add(sale1);

	                            Map<String, Object> sale2 = new HashMap<String, Object>();
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
	                                logger.log(Level.INFO, json);
	                            } catch (JsonProcessingException e) 
	                            {
	                            	String logMessage = String.format("Error while processing JSON: %s%n", e.getMessage());
	                            	logger.log(Level.SEVERE, logMessage);

	                            	}
	                            break;

	                        case 14:
	                            List<Worker> availableWorkers = new ArrayList<Worker>();
	                            availableWorkers.add(new Worker("Adham"));
	                            availableWorkers.add(new Worker("Muheeb"));
	                            availableWorkers.add(new Worker("Yazan"));
	                            availableWorkers.add(new Worker("EZZ"));
	                            availableWorkers.add(new Worker("Ali"));

	                            List<Orderr> orders = new ArrayList<Orderr>();
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

	                            logger.log(Level.INFO, "Enter customer name: ");
	                            String customerName = input.nextLine();

	                            logger.log(Level.INFO, "Enter total amount spent: ");
	                            double totalAmount = input.nextDouble();

	                            double discount = 0.0;
	                            if (totalAmount > 400.0) {
	                                discount = 0.1 * totalAmount;
	                            }

	                            double discountedAmount = totalAmount - discount;

	                            logger.log(Level.INFO, "Customer Name: {0}", customerName);
	                            logger.log(Level.INFO, "Total Amount Spent: %.2f NIS%n", totalAmount);
	                            logger.log(Level.INFO, "Discount: %.2f NIS%n", discount);
	                            logger.log(Level.INFO, "Discounted Amount: %.2f NIS%n", discountedAmount);



   break;
                default:
                    logger.log(Level.INFO, "Invalid input. Please try again.");
                    break;
            
        




				}
	 		    
	 		  

	 				

	                    break;    }

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
		
		function();
	
}

}