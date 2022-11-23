package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping(value ="/cars")
    public String showAnyCars(@RequestParam(value = "count", required = false) Integer count,
                              Model model) {
        if(count == null){
            List<Car> totalList = carService.getAllCars();
            model.addAttribute("totalList", totalList);
            return "allCars";
        }
        List<Car> totalList2 = carService.getSomeCars(count);
        model.addAttribute("totalList2", totalList2);
        return "anyCars";
    }

}
