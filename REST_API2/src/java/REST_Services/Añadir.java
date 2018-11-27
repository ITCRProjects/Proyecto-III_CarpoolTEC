
package REST_Services;

import Clases_Padre.Driver;
import Clases_Padre.Rider;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("add")
public class Añadir {

    public static ArrayList<Driver> driverArrayList = new ArrayList<>();
    public static ArrayList<Rider> ridersArrayList = new ArrayList<>();

    /**
     * Method to add a driver to the server
     * @param driver instance of the driver that is received from the client
     */
    @POST
    @Path("driver")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Driver addDriver(Driver driver){
        driverArrayList.add(driver);
        return driver;
    }

    /**
     * Method to add a rider to the server
     * @param rider instance of the rider that is received from the client
     */
    @POST
    @Path("rider")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Rider addRider(Rider rider){
        ridersArrayList.add(rider);
        return rider;
    }

}