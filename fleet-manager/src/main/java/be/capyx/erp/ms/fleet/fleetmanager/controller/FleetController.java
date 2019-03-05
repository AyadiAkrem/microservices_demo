package be.capyx.erp.ms.fleet.fleetmanager.controller;


import be.capyx.erp.ms.fleet.fleetmanager.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fleet")
public class FleetController {

    @GetMapping("/{employee}")
    public Car find(@PathVariable String employee) {
        if (employee.equals("12345")) {
            return new Car("1 KFS 544");
        }
        return new Car("1 PTT 999");
    }

}
