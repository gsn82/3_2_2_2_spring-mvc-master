package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("uaz", 123, 123));
        carList.add(new Car("fiat", 34, 234));
        carList.add(new Car("bmw", 1232, 234));
        carList.add(new Car("uaz", 234, 234));
        carList.add(new Car("fia2t", 334, 2334));
        carList.add(new Car("bm3w", 12332, 2343));
    }

/*
	@GetMapping(value = "/cars")
	public String printCars(Model model) {

		model.addAttribute("carList", carList);

		return "cars";
	}/**/
/*
	@GetMapping(value = "/cars")
	public String printCarsParam(@RequestParam("count") int count , Model model) {

		List<Car> list = new ArrayList<>();

		for (int i=0; i<count; i++){
			list.add(carList.get(i));
		}

		model.addAttribute("carList", list);

		return "cars";
	}/**/

    @GetMapping(value = "/cars")
    public String printCarsParam(HttpServletRequest request, Model model) {

        if (request.getParameter("count") != null) {
            int count = Integer.parseInt(request.getParameter("count"));
            List<Car> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                list.add(carList.get(i));
            }
            model.addAttribute("carList", list);

        } else {
            model.addAttribute("carList", carList);
        }


        return "cars";
    }/**/
}