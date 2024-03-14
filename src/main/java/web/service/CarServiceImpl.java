package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("Honda", "Accord", 2019),
            new Car("Ford", "Mustang", 2021),
            new Car("Chevrolet", "Camaro", 2018),
            new Car("BMW", "X5", 2022)
    );

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}