package com.carapi.api.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carapi.api.dto.CarDTO;


@RequestMapping("/car")
@RestController
public class CarController {

    @PostMapping("/create")
    public void createCar(@RequestBody CarDTO req){
        System.out.println(req.modelo());
        System.out.println(req.valor());
        System.out.println(req.fabricante());
    }   

}
