package com.unicamp.server;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.StaticHttpHandler;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ext.ContextResolver;

public class Main {

    public static final String BASE_URI = "http://localhost:8080/api/";

    public static HttpServer startServer() {
        
    	final ResourceConfig rc = new ResourceConfig()
    			.packages("com.unicamp.controllers")
    			.packages("org.glassfish.jersey.examples.jsonmoxy")
                .register(createMoxyJsonResolver());
    	
    	return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }
    
    public static ContextResolver<MoxyJsonConfig> createMoxyJsonResolver() {
        final MoxyJsonConfig moxyJsonConfig = new MoxyJsonConfig();
        Map<String, String> namespacePrefixMapper = new HashMap<String, String>(1);
        namespacePrefixMapper.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
        moxyJsonConfig.setNamespacePrefixMapper(namespacePrefixMapper).setNamespaceSeparator(':');
        return moxyJsonConfig.resolver();
    }

    public static void main(String[] args) throws IOException {
    	
        final HttpServer server = startServer();
        
        StaticHttpHandler staticHttpHandler = new StaticHttpHandler("src/main/public/");
        server.getServerConfiguration().addHttpHandler(staticHttpHandler, "/");
        
        System.out.println(String.format("Jersey app started with WADL available at "
        									+ "%sapplication.wadl\nHit enter to stop it...", BASE_URI));
        System.in.read();
        
        server.shutdown();
    }
}

