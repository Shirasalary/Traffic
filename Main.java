import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight1 = new TrafficLight();
        TrafficLight trafficLight2 = new TrafficLight();
        TrafficLight trafficLight3 = new TrafficLight();
        TrafficLight trafficLight4 = new TrafficLight();

        List<Car> cars = new ArrayList<>();

//        for (int i = 1;i<=20;i++)
//        {
//            Car car = new Car();
//            cars.add(car);
//        }

        for (int i = 1;i<=20;i++)
        {

        }
    }

    public static void sleep(int seconds)
    {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
