package API;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("add")
public class Agrega {

    public static ArrayList<Driver> driverArrayList = new ArrayList<>();
    public static ArrayList<Rider> ridersArrayList = new ArrayList<>();

    /**
     * Method to add a driver to the server
     * @param driver instance of the driver that is received from the client
     * @return 
     */
    @POST
    @Path("driver")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Driver addDriver(Driver driver){
        driver.setId((int) (Math.random() * 100));
        for (int i = 0; i < driverArrayList.size(); i++){
            if (driver.getId() == driverArrayList.getId()){
                driver.setId((int) (Math.random() * 10000));
                i = 0;
            }
        }
        driverArrayList.add(driver);
        return driver;
    }

    /**
     * Method to add a rider to the server
     * @param rider instance of the rider that is received from the client
     */
    @POST
    @Path("estudiante")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Rider addRider(Rider rider){
        ridersArrayList.add(rider);
        return rider;
    }

}
