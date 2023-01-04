package assignment;

import java.time.LocalDate;
import java.time.*;
import java.util.Arrays;
import java.util.Set;
import java.util.*;

public class Foreach {

	
	
	
	
	public static void main(String[] args)
	    {

		Set<String> zones = ZoneId.getAvailableZoneIds();

		zones.stream().sorted().forEach(System.out::println);
		
		
//		 for (String s : ZoneId.getAvailableZoneIds()) {
//	            System.out.println(s);
//	        } 
		
			
	    	  // Storing all the available Ids
//	        String[] Id_array = TimeZone.getAvailableIDs();
	  
	        // Displaying all the available Ids
//	        System.out.println("All the available Ids are: ");
	  
//	        for (int count = 0;
//	             count < Id_array.length; count++)
//	            System.out.println(Id_array[count]);
	    }
	    	
	    	
	    	
	    	
	    }
	
	
	
	
	
	
	
	
		


