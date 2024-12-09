package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList;
    {
        carList = new ArrayList<>();

        carList.add(new Car("BMW", 5, 3));
        carList.add(new Car("Mercedes", 5, 4));
        carList.add(new Car("Lada Sport", 2, 8));
        carList.add(new Car("UAZ", 1, 10));
        carList.add(new Car("Vedro", 2, 0));
    }

    @Override
    public List<Car> getCarVal(int val) {
        if (val <= 0 || val >= carList.size()) {
            return carList;
        }
        return carList.stream().limit(val).toList();
    }
}