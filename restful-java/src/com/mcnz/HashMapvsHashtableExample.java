package com.mcnz;

import java.util.HashMap;
import java.util.Hashtable;

/* Code to compare Hashtable and HashMap */
public class HashMapvsHashtableExample {

	// Difference between Hashtable and HashMap example
	public static void main(String[] args) {
        
		// Java Hashtable example
		Hashtable<String,String> hashTableExample = new Hashtable<String, String>();
        hashTableExample.put("ford", "Mustang SUV");
        hashTableExample.put("dodge", "Viper ACR");
        hashTableExample.put("chevy", "Chevette");
        
        System.out.println("Hashtable example code:"+ hashTableExample);
 
        // Java HashMap example
        HashMap<String,String> hashMapExample = new HashMap<String,String>();
        hashMapExample.put("ford", "Mustang SUV");
        hashMapExample.put("dodge", "Viper ACR");
        hashMapExample.put("chevy", null);
        hashMapExample.put(null, "Corvette");
        System.out.println("HashMap example code :"+hashMapExample);   

	}

}
