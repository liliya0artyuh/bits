 package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class CarController {
 	@Autowired
    CarMongoRepository carRepository;
 	
    @Autowired
    CarSearchRepository carSearchRepository;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("carList", carRepository.findAll());
        System.out.println("999999999999999 inside /home");
        return "home";
    }
    
//    @RequestMapping("/home")
//    public List<Car> home() {
//       // model.addAttribute("carList", carRepository.findAll());
//        System.out.println("88888888888888888888 inside /home");
//        return carRepository.findAll();
//       // return "home";
//    }

    @RequestMapping(value = "/addCar", method = RequestMethod.POST)
    public List<Car> addCar(@ModelAttribute Car car) {
       // carRepository.save(car);
        return carRepository.findAll();
    }


    @RequestMapping(value = "/search")
    public String search(Model model, @RequestParam String search) {
        model.addAttribute("carList", carSearchRepository.searchCars(search));
        model.addAttribute("search", search);
        return "home";
    }
 }