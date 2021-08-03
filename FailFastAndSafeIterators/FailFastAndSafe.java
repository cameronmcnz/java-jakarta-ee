package com.mcnz.collections;

import java.util.*;
import java.util.concurrent.*;

public class FailFastAndSafe {

	public static void main(String args[]) {
		failSafeIterator();
		//failFastIterator();
	}

	private static void failSafeIterator() {
		String[] data = { "Tomcat", "Undertow", "Kubernetes", "WebSphere", "JBoss" };
		CopyOnWriteArrayList<String> dataList = new CopyOnWriteArrayList<String>(data);
		Iterator<String> iterator = dataList.iterator();
		while(iterator.hasNext()) {
			String server = iterator.next();
			System.out.println(server);
			if (server.equals("Tomcat")) {
				dataList.add("Jetty");
			}
		}
	}

	private static void failFastIterator() {
		ArrayList<String> servers = new ArrayList<String>();
		servers.add("Tomcat");
		
		Iterator<String> iterator = servers.iterator();
		while (iterator.hasNext()) {
			String server = iterator.next();
			System.out.println(server);
			servers.add("Jetty");
		}
	}
}

