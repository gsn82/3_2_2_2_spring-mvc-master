package web.dao;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("uaz", 123, 123));
        carList.add(new Car("fiat", 34, 234));
        carList.add(new Car("bmw", 1232, 234));
        carList.add(new Car("uaz", 234, 234));
        carList.add(new Car("fia2t", 334, 2334));
        carList.add(new Car("bm3w", 12332, 2343));
    }

    @Override
    public List<Car> getCars(int number) {
        if( number > 5) {
            return carList;
        }
        return carList.subList(0, number);
    }
}