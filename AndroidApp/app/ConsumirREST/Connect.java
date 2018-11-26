package carpool.ConsumirREST;


import java.util.concurrent.*;

public class Connect {

    public static String url = "192.168.100.3";

    /**
     * Method to connect to the server to retrieve the current map data
     * @return All the data of the map, in a graph form
     */
    public static TemporalHolder getMapData() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<TemporalHolder> callable = new ConnectionManagerMapData();
        ((ConnectionManagerMapData) callable).setUrl(url);
        Future<TemporalHolder> future = executor.submit(callable);
        return future.get();
    }

    public static Driver addDriver(Driver driver) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<Driver> callable = new ConnectionManagerAddDriver();
        ((ConnectionManagerAddDriver) callable).setDriver(driver);
        ((ConnectionManagerAddDriver) callable).setUrl(url);
        Future<Driver> future = executor.submit(callable);
        return future.get();
    }

    public static SubRoute createRoute(SubRoute subRoute) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<SubRoute> callable = new ConnectionManagerCreateRoute();
        ((ConnectionManagerCreateRoute) callable).setSendRoute(subRoute);
        ((ConnectionManagerCreateRoute) callable).setUrl(url);
        Future<SubRoute> future = executor.submit(callable);
        return future.get();
    }

    public static Driver updateDriver(Driver driver) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<Driver> callable = new ConnectionManagerUpdateDriver();
        ((ConnectionManagerUpdateDriver) callable).setDriver(driver);
        ((ConnectionManagerUpdateDriver) callable).setUrl(url);
        Future<Driver> future = executor.submit(callable);
        return future.get();
    }

    public static Rider updateRider(Rider rider) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<Rider> callable = new ConnectionManagerUpdateRider();
        ((ConnectionManagerUpdateRider) callable).setRider(rider);
        ((ConnectionManagerUpdateRider) callable).setUrl(url);
        Future<Rider> future = executor.submit(callable);
        return future.get();
    }

}
