package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

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
    public List<Car> getCarByCount(int count) {
        if (count <= 0) {
            return carList;
        }
        return carList.stream().limit(count).toList();
    }
}
