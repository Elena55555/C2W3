public interface CheckEngineService {
    default void checkEngine(Transport[] transports){
        System.out.println("Не положено проверять двигатель у некоторых видов транспорта");
    }
    void checkEngine(Car[] cars);
    default void checkEngine(Bicycle[] bicycles) {
        System.out.println("Не положено проверять двигатель у велосипедов");
        System.out.println("  ");

    }
    void checkEngine(Truck[] trucks);
}
