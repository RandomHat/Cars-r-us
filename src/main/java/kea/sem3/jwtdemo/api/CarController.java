package kea.sem3.jwtdemo.api;

import kea.sem3.jwtdemo.dto.CarRequest;
import kea.sem3.jwtdemo.dto.CarResponse;
import kea.sem3.jwtdemo.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarResponse> getCars(){return carService.getCars();}

    @GetMapping("/{id}")
    public CarResponse getCar(@PathVariable int id) throws Exception {return carService.getCar(id, false);}


    // I Spring-land ved spring godt at vi får en Json-fil retur (Rest standard og RestController annotation), så med @RequestBody forsøger spring automatisk at mappe ned til classen.
    @PostMapping
    public CarResponse addCar(@RequestBody CarRequest carRequest){return carService.addCar(carRequest);}

    @PutMapping("/{id}")
    public CarResponse editCar(@RequestBody CarRequest body, @PathVariable int id){return null;}

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable int id){}

}

