package API;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("enviarGrafo")
public class enviaGrafo {

    public static grafoPOJO holder;

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public grafoPOJO getMapData() {
        if (!Grafo.mapCreated){
            holder = Grafo.preparation();
            return holder;
        }
        else{
            return holder;
        }
    }

}