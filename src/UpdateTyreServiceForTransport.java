
public class UpdateTyreServiceForTransport implements UpdateTyreService {

    @Override
    public void updateTyre(Transport[] transports) {
//        System.out.println("Размер списка транспорта " + transports.length);
//        System.out.println("Наименование");
//        updateTyreTransport (transports);
//        System.out.println(" ");
    }
    @Override
    public void updateTyre(Car[] cars) {
        System.out.println("Услуга  -  замена покрышек" );
        System.out.println("_______________________________________________________________________________" );
        System.out.println("Размер списка машин:  " + cars.length);

        updateTyreTransport (cars);
        System.out.println(" ");
    }


    @Override
    public void updateTyre(Bicycle[] bicycles) {
        System.out.println("Размер списка  велосипедов: " +  bicycles.length);
        updateTyreTransport (bicycles);
        System.out.println(" ");
    }



    @Override
    public void updateTyre(Truck[] trucks) {
        System.out.println("Размер списка  грузовиков: " +  trucks.length);
        updateTyreTransport (trucks);
        System.out.println(" ");
    }

    private void updateTyreTransport (Transport [] transports) {
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            System.out.println("Обслуживаем и меняем покрышку: " +  " Название модели: " + transport.getModelName() + " Количество колес: " + transport.getWheelsCount());

        }
    }
}

