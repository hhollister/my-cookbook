package edu.matc.controller;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hornb on 4/15/2017.
 */

//Defines the base URI for all resource URIs.
@ApplicationPath("/rest")

//The java class declares root resource and provider classes
public class RestApplication extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(AllUsers.class );
        return h;
    }
}