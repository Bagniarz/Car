import factoryMethodCar.cars.Car;
import factoryMethodCar.factories.CarFactory;
import factoryMethodCar.factories.MercedesFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        CarFactory carFactory = new MercedesFactory();
        Car car = carFactory.createCar();
        System.out.println(car);
    }
}
