package org.pratap.spring.mongodb.demo2.controller;

import org.pratap.spring.mongodb.demo2.model.Car;
import org.pratap.spring.mongodb.demo2.repository.CarSearchRepository;
import org.pratap.spring.mongodb.demo2.repository.ICarMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by orgpratap on 3/24/17.
 */
@Controller
public class CarController {

    @Autowired
    ICarMongoRepository carMongoRepository;

    @Autowired
    CarSearchRepository carSearchRepository;

    @RequestMapping(value = "/home")
    public String home(Model model){
        model.addAttribute("carList",carMongoRepository.findAll());
        return "home";
    }

    @RequestMapping(value = "/addCar", method = RequestMethod.POST)
    public String addCar(@ModelAttribute Car car){
        carMongoRepository.save(car);
        return "redirect:home";
    }

    @RequestMapping(value = "/search")
    public String serach(Model model, @RequestParam String search){
        model.addAttribute("carList", carSearchRepository.searchCars(search));
        model.addAttribute("search", search);
        return "home";
    }

}
