package com.mcnz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RuntimeException09 {

	public static void main(String[] args) {

	    List servers = new ArrayList();
	    servers.add("Tomcat");
			
	    Iterator<String> iterator = servers.iterator();
	    while (iterator.hasNext()) {
	      String server = iterator.next();
	      servers.add("Jetty");  // throws ConcurrentModificationException
	    }
		

	}

}
