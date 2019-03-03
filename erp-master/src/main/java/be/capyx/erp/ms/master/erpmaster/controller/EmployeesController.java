package be.capyx.erp.ms.master.erpmaster.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeesController {

    @RequestMapping("/home")
    public String employees(Model model) {
        return "home";
    }
}
