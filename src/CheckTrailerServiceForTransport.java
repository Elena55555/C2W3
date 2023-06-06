public class CheckTrailerServiceForTransport implements CheckTrailerService {

    @Override
    public void checkTrailer(Transport[] transports) {

//        System.out.println("Размер списка транспорта " + transports.length);
//        System.out.println("Наименование");
//        checkTrailerTransport (transports);
//        System.out.println(" ");
    }
    @Override
    public void checkTrailer(Truck[] trucks) {

        System.out.println("Размер списка  грузовиков " +  trucks.length);
//        System.out.println("Наименование");
        checkTrailerTransport (trucks);
        System.out.println(" ");
    }

    private void checkTrailerTransport (Transport [] transports) {
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            System.out.println("Обслуживаем и проверяем прицеп: " +  " Название модели: " + transport.getModelName() + " Количество колес: " + transport.getWheelsCount());

        }
    }
}