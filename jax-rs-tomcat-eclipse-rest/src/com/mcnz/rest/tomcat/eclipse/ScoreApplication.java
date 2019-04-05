package com.mcnz.rest.tomcat.eclipse;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class ScoreApplication extends ResourceConfig {
	
    public ScoreApplication() {
        packages("com.mcnz.rest.tomcat.eclipse");
    }

}

/*
	import javax.ws.rs.core.Application;

	ApplicationPath("/") public class ScoreApplication extends Application {
	public Set<Class<?>> getClasses() { return new
		HashSet<Class<?>>(Arrays.asList(com.mcnz.rest.tomcat.eclipse.ScoreService)); 
	} 
}
*/