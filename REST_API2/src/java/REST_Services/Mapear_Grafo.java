package REST_Services;

import Estructuras_Datos.Grafo;
import Estructuras_Datos.Grafo_POJO;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("map_data")
public class Mapear_Grafo {

    public static Grafo_POJO grafo_pojo;

    /**
     * Method that sends the client the current graph, that has the map data
     * @return instance of the holder class with all the data
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Grafo_POJO getMapData() {
        if (!Grafo.mapCreated){
            grafo_pojo = Grafo.preparation();
            return grafo_pojo;
        }
        else{
            return grafo_pojo;
        }
    }

}