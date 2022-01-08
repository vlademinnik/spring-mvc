package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.servise.ServiseCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int all, Model model) {
        List<Car> car = new ArrayList<>();
            car.add(new Car("Range Rover", "silver", 1500000));
            car.add(new Car("Reno Duster", "blue", 575000));
            car.add(new Car("BMW", "black", 12500000));
            car.add(new Car("Infiniti", "white", 1300000));
            car.add(new Car("Nissan", "black", 2950000));

        model.addAttribute("cars", ServiseCar.carX(car, all));

    return "cars";
    }
}
