package com.mcnz;

import java.util.*;

public class RuntimeException08 {

	public static void main(String[] args) {
		
		
		Set set = new HashSet();
		set.iterator().next();
		
		if (!set.isEmpty()) {
			set.iterator().next();
		}
	
	}

}
