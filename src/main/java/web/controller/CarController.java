package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public List<Car> printCars() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car();
        car1.setModel("Mazda 6");
        car1.setSeries(3);
        car1.setYearOfRelease(2014);

        Car car2 = new Car();
        car2.setModel("Cadillac Eldorado");
        car2.setSeries(7);
        car2.setYearOfRelease(1977);

        Car car3 = new Car();
        car3.setModel("Cadillac Escalade");
        car3.setSeries(4);
        car3.setYearOfRelease(2015);

        Car car4 = new Car();
        car4.setModel("Cadillac Escalade");
        car4.setSeries(3);
        car4.setYearOfRelease(2010);

        Car car5 = new Car();
        car5.setModel("Land Rover Discovery");
        car5.setSeries(4);
        car5.setYearOfRelease(2013);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return null;
//        return "index";
    }
}
