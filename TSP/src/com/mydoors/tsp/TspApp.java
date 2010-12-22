package com.mydoors.tsp;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class TspApp extends Application {
	  @Override
	    public Restlet createInboundRoot() {
	        // Create a router Restlet that routes each call to a
	        // new instance of HelloWorldResource.
	        Router router = new Router(getContext());

	        // Defines only one route
	        router.attachDefault(TspService.class);
	       
	        return router;
	    }
}
