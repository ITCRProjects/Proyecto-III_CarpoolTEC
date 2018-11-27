package REST_Services;

import Estructuras_Datos.Grafo_POJO;
import Estructuras_Datos.Grafo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("getGrafo")
public class getGrafo {

    public static Grafo_POJO grafo_POJO;
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Grafo_POJO getMapData() {
        if (!Grafo.mapCreated){
            grafo_POJO = Grafo.preparation();
            return grafo_POJO;
        }
        else{
            return grafo_POJO;
        }
    }

}
