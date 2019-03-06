package be.capyx.erp.ms.fleet.fleetmanager.controller;


import be.capyx.erp.ms.fleet.fleetmanager.model.Car;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fleet")
public class FleetController {


    @HystrixCommand(fallbackMethod = "fallBackRetrieveCar", commandKey = "car_1",
            groupKey = "fleet_1")
    @GetMapping("/{employee}")
    public Car find(@PathVariable String employee) {
        if(RandomUtils.nextBoolean()){
            throw new RuntimeException("Unexpected Exception");
        }

        if (employee.equals("12345")) {
            return new Car("1 KFS 544");
        }
        return new Car("1 PTT 999");
    }

    public Car fallBackRetrieveCar(String employee){
       return new Car("X-XXX-XXX");
    }

}
