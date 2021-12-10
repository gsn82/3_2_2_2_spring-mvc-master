package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    final CarService carService;

    public CarController() {
        this.carService = new CarServiceImpl();
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}