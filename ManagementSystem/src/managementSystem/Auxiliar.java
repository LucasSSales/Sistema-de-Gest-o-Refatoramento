package managementSystem;

import java.util.Calendar;

public class Auxiliar {
	
	public String currentDate() {
		
		Calendar c = Calendar.getInstance();
		String currentDate = null;
		
		if(c.get(c.DAY_OF_MONTH) < 10)
			currentDate = "0";
		
		currentDate += c.get(c.DAY_OF_MONTH) + "/";
		
		if(c.get(c.MONTH)+1 < 10)
			currentDate += "0";
		
		currentDate +=  (c.get(c.MONTH)+1);
		
		return currentDate;
	}
	
}
