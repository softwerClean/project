package mycleann;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
class BusinessReport {
	  private String title;
	  private String date;
	  private List<Map<String, Object>> salesData;
	  
	  public String getTitle() {
	    return title;
	  }
	  
	  public void setTitle(String title) {
	    this.title = title;
	  }
	  
	  public String getDate() {
	    return date;
	  }
	  
	  public void setDate(String date) {
	    this.date = date;
	  }
	  
	  public List<Map<String, Object>> getSalesData() {
	    return salesData;
	  }
	  
	  public void setSalesData(List<Map<String, Object>> salesData) {
	    this.salesData = salesData;
	  }
	}