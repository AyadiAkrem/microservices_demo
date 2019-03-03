package be.capyx.erp.ms.master.erpmaster.controller.rest;


import be.capyx.erp.ms.master.erpmaster.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesRestController {


    @GetMapping("/employees/allasArray")
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

    @GetMapping("/employees/all")
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123L, "AYADI", "Akrem", "akrem.ayadi@capyx.be", "1 PTT 543"));
        employees.add(new Employee(124L, "De Valck", "Erick", "devalk.erick@capyx.be", "1 FST 433"));

        return employees;

    }


}
