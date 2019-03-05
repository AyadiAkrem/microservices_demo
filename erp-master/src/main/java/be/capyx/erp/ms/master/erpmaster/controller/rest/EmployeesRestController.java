package be.capyx.erp.ms.master.erpmaster.controller.rest;


import be.capyx.erp.ms.master.erpmaster.domain.Car;
import be.capyx.erp.ms.master.erpmaster.domain.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesRestController {


    private final static String url = "http://localhost:8090/fleet/";
    @GetMapping("/allasArray")
    public Object[] getEmployeesAsArrayWithHead() {

        List<Employee> allEmployees = getAllEmployees();
        Object[] returnedObject = new Object[allEmployees.size()];
        int i = 0;

        for (Employee emp :
                allEmployees) {
            returnedObject[i] = new Object[]{emp.getUUID(), emp.getName(), emp.getLastName(), emp.getEmail(), emp.getCompanyCar()};
            i++;
        }
        return returnedObject;

    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123L, "AYADI", "Akrem", "akrem.ayadi@capyx.be", getCarOf("12345")));
        employees.add(new Employee(12345L, "De Valck", "Erick", "devalk.erick@capyx.be", getCarOf("123")));

        return employees;

    }


    public String getCarOf(String uuid){
        RestTemplate template = new RestTemplate();
        ResponseEntity<Car> response = template.getForEntity(url + uuid, Car.class);
        return response.getBody().getRegistrationNumber();
    }




}
