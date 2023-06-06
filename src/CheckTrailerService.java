public interface CheckTrailerService {
    default void checkTrailer(Transport[] transports){

        System.out.println("Не положено проверять прицеп у некоторых видов транспорта");
    }

    default void checkTrailer(Car[] cars){
        System.out.println("Услуга  -  проверка прицепа" );
        System.out.println("_______________________________________________________________________________" );
        System.out.println("Не положено проверять прицеп у легкового автомобиля");
    }

    default void checkTrailer(Bicycle[] bicycles){
        System.out.println("Не положено проверять прицеп у велосипеда");
    }

    void checkTrailer(Truck[] trucks);
}
