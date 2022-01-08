package web.servise;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

public class ServiseCar {

    public static List<Car> carX(List<Car> car, int count) {
        if(count == 0 || count > 5){
            return car;
        }
        return car.stream().limit(count).collect(Collectors.toList());
    }
}
