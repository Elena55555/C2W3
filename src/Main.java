public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа № 3");


        Car[] cars = {
                new Car ("car1",  4 ),
                new  Car ("car2",  4),

        };

        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2 ),
                new Bicycle("bicycle2", 2 ),
        };
        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };

        Transport[] transports = new Transport [cars.length + bicycles.length + trucks.length] ;

        for (int i = 0; i < cars.length; i++) {
            transports[i] = cars[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            transports[i + cars.length] = bicycles[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            transports[i + cars.length +bicycles.length] = trucks[i];
        }

        UpdateTyreService updateTyreServiceForTransport = new UpdateTyreServiceForTransport();

        updateTyreReport(updateTyreServiceForTransport, bicycles,cars,trucks,transports);

        CheckEngineService checkEngineServiceForTransport = new CheckEngineServiceForTransport();


        checkEngineReport(checkEngineServiceForTransport,bicycles,cars,trucks,transports);

        CheckTrailerService checkTrailerServiceForTransport = new CheckTrailerServiceForTransport();


        checkTrailerReport(checkTrailerServiceForTransport,bicycles,cars,trucks,transports);

    }
    private static void updateTyreReport(UpdateTyreService updateTyreService, Bicycle[] bicycles, Car[] cars, Truck[] trucks, Transport[] transports) {
        updateTyreService.updateTyre(cars);
        updateTyreService.updateTyre(bicycles);
        updateTyreService.updateTyre(trucks);
        updateTyreService.updateTyre(transports);
    }

    private static void checkEngineReport(CheckEngineService checkEngineService , Bicycle[] bicycles, Car[] cars, Truck[] trucks, Transport[] transports) {
        checkEngineService.checkEngine(cars);
        checkEngineService.checkEngine(bicycles);
        checkEngineService.checkEngine(trucks);
        checkEngineService.checkEngine(transports);
    }

    private static void checkTrailerReport(CheckTrailerService checkTrailerService , Bicycle[] bicycles, Car[] cars, Truck[] trucks, Transport[] transports) {
        checkTrailerService.checkTrailer(cars);
        checkTrailerService.checkTrailer(bicycles);
        checkTrailerService.checkTrailer(trucks);
        checkTrailerService.checkTrailer(transports);
    }
}