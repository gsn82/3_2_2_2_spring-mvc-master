package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    CarDAO carDAO = new CarDAOImpl();

    @Override
    public List<Car> getCars(int number) {
        return carDAO.getCars(number);
    }
}