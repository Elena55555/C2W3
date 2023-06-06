public class CheckEngineServiceForTransport implements CheckEngineService {

    @Override
    public void checkEngine(Transport[] transports) {
//        System.out.println("Размер списка транспорта " + transports.length);
//        System.out.println("Наименование");
//        checkEngineTransport (transports);
//        System.out.println(" ");
    }
    @Override
    public void checkEngine(Car[] cars) {
        System.out.println("Услуга  -  проверка двигателя" );
        System.out.println("_______________________________________________________________________________" );
        System.out.println("Размер списка машин:  " + cars.length);
        checkEngineTransport (cars);
        System.out.println(" ");
    }
    @Override
    public void checkEngine(Truck[] trucks) {
        System.out.println("Размер списка  грузовиков: " +  trucks.length);
//        System.out.println("Наименование");
        checkEngineTransport (trucks);
        System.out.println(" ");
    }

    private void checkEngineTransport (Transport [] transports) {
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            System.out.println("Обслуживаем и проверяем двигатель: " +  " Название модели: " + transport.getModelName() + " Количество колес: " + transport.getWheelsCount());

        }
    }
}

