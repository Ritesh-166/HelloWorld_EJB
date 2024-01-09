package org.example;

//import jakarta.ejb.EJB;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import javax.ejb.EJB;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
@RequiredArgsConstructor
@Stateless
 public class HelloResource {

    @EJB
    private Hello helloBean ;


    @GET
    @Path("/world/{name}/")
    public Response sayHello(@PathParam("name") String name) {



       try {

            if (helloBean != null) {
                String message = helloBean.sayHello(name);
                return Response.ok(message).build();

            } else {
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("HelloBean is null").build();
            }
      } catch (Exception e) {
//
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error processing request").build();

       }
    }



    @GET
    @Path("/welcome")
    public Response welcome(){
        return Response.ok("welcome!!").build();
}


}
